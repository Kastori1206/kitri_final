package com.kitri.pms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.kitri.pms.domain.MemberVO;
import com.kitri.pms.persistence.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public ModelAndView loginView(ModelAndView mv) {
		mv.setViewName("login");
		return mv;
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
 
    @RequestMapping(value="/insert",method=RequestMethod.POST)
    public ModelAndView insertUser(MemberVO vo,ModelAndView mv) {
        System.out.println("Controller.insertUser() 호출");
        System.out.println(vo.toString());
        memberService.insertMember(vo);
        mv.setView(new RedirectView("/pms/home"));
        return mv;
    }

}
