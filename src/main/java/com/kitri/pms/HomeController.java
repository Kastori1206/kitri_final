package com.kitri.pms;

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
		model.addAttribute("viewFile","/WEB-INF/views/dashboard/dashboard.jsp");
		return "layout";
	}
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home1View(Model model) {		
		model.addAttribute("viewFile","/WEB-INF/views/dashboard/dashboard.jsp");
		return "layout";
	}
	@RequestMapping(value = "/board", method = RequestMethod.GET)
	public String boardView(Model model) {		
		model.addAttribute("viewFile","/WEB-INF/views/board/board.jsp");

		return "layout";
	}
	
	@RequestMapping(value = "/calendar", method = RequestMethod.GET)
	public String calendarView(Model model) {		
		model.addAttribute("viewFile","/WEB-INF/views/calendar/calendar.jsp");

		return "layout";
	}
	
}
