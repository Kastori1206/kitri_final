package com.kitri.pms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView loginView() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView mainView() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");
		return mv;
	}
	@RequestMapping(value="/calendar", method=RequestMethod.GET)
	public ModelAndView calendarView() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("calendar");
		return mv;
	}
	
	
}