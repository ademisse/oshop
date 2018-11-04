package com.ashe.oshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	@RequestMapping(value = { "/", "/index", "/home" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", "Welcome to Spring MVC!");
		return mv;
	}
	
	@RequestMapping(value="/test/{greeting}" ,method=RequestMethod.GET)
	public ModelAndView test(@PathVariable("greeting")String gr)
	{
		if(gr==null)
			gr="myGod";
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting",gr);
		return mv;
	}

}
