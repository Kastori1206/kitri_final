package com.kitri.pms.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.kitri.pms.domain.MemberVO;
import com.kitri.pms.persistence.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView loginView(ModelAndView mv) {
		mv.setViewName("login/login");
		return mv;
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registerView() {	
		return "/login/register";
	}
	
	@RequestMapping(value="/insertMember",method=RequestMethod.GET)
    public ModelAndView insertMemberView(ModelAndView mv) {
        System.out.println("Controller.insertUserView() 호출");
        mv.setViewName(".tiles/login/register");
        return mv;
    }
    @ResponseBody
    @RequestMapping(value="/checkId")
    public int idCheck(String id,ModelAndView mv) {
        System.out.println("Controller.idCheck() 호출");
        int result=0;
        MemberVO user=memberService.getMember(id);
        if(user!=null) result=1;
        else System.out.println("아이디사용가능");
        return result;
    }
 
    @RequestMapping(value="/loginCheck", method=RequestMethod.POST)
    public String loginCheck(@ModelAttribute MemberVO vo, HttpSession session, RedirectAttributes redirectAttributes) {

    	boolean result = memberService.loginCheck(vo,session);
    	if(result == true) {
    		return "redirect:/home";
    	}else {
    		redirectAttributes.addFlashAttribute("msg","failure");
    		return "redirect:/";
    	}
    	
    }
    @RequestMapping("/logout")
    public ModelAndView logout(HttpSession session) {
    	memberService.logout(session);
    	ModelAndView mv= new ModelAndView();
    	mv.setViewName("");
    	mv.addObject("msg","logout");
    	return mv;
    }
    @RequestMapping(value="/insert",method=RequestMethod.POST)
    public ModelAndView insertUser(MemberVO vo,ModelAndView mv) {
        System.out.println("Controller.insertUser() 호출");
        System.out.println(vo.toString());
        memberService.insertMember(vo);
        mv.setView(new RedirectView("/pms/home"));
        return mv;
    }

}
