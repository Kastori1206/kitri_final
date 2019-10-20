package com.kitri.pms.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String loginView() {	
		return "/login/login";
	}
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registerView() {	
		return "/login/register";
	}
	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public String homeView(Model model) {		
		model.addAttribute("title", "대시보드");
		return ".tiles/dashboard/dashboard";
	}
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home1View(Model model) {		
		model.addAttribute("title", "대시보드");
		return ".tiles/dashboard/dashboard";
	}
	@RequestMapping(value = "/board", method = RequestMethod.GET)
	public String boardView(Model model) {	
		model.addAttribute("title", "공지");
		return ".tiles/board/board";
	}
	
	@RequestMapping(value = "/calendar", method = RequestMethod.GET)
	public String calendarView(Model model) {		
		model.addAttribute("title", "일정");

		return ".tiles/calendar/calendar";
	}
	@RequestMapping(value = "/gantt", method = RequestMethod.GET)
	public String ganttView(Model model) {		
		model.addAttribute("title", "간트차트");

		return ".tiles/calendar/gantt";
	}
	@RequestMapping(value = "/community", method = RequestMethod.GET)
	public String communityView(Model model) {			
		model.addAttribute("title", "커뮤니티");
		return ".tiles/community/community";
	}
	
	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String contactView(Model model) {			
		
		return ".tiles/community/contact";
	}
}
