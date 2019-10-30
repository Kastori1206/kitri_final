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
	

	@RequestMapping(value = "/home",method={RequestMethod.GET,RequestMethod.POST})
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
		int pageSize = 9;// 한페이지에 나오는 게시물 개수
	    int pageIndex = 0; //현재 선택한 페이지 number
	    
	    int startRow = (pageIndex - 1) * pageSize + 1;// 한 페이지의 시작글 번호
	    int endRow = pageIndex * pageSize;// 한 페이지의 마지막 글번호
	 


		출처: https://lee-mandu.tistory.com/371 [개발/일상_Mr.lee]
		return ".tiles/community/contact";
	}
}
