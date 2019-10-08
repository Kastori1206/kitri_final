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
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String homeView() {		
		
		return "home";
	}
	
}
