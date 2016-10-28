package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	
	@RequestMapping("/")
	public ModelAndView index()
	{
	  ModelAndView mv=new ModelAndView("index");	
	  return mv;
	}
	
	@RequestMapping("/Index")
	public ModelAndView indexpage()
	{
	  ModelAndView mv=new ModelAndView("index");	
	  return mv;
	}
	@RequestMapping("/Aboutus")
	public ModelAndView aboutus()
	{
	  ModelAndView mv=new ModelAndView("aboutus");	
	  return mv;
	}
	@RequestMapping("/Contactus")
	public ModelAndView contactus()
	{
	  ModelAndView mv=new ModelAndView("contactus");	
	  return mv;
	}
	
	
	@RequestMapping("/Registration")
	public ModelAndView register()
	{
	  ModelAndView mv=new ModelAndView("registration");	
	  return mv;
	}
	@RequestMapping("/Login")
	public ModelAndView login()
	{
	  ModelAndView mv=new ModelAndView("login");	
	  return mv;
	}

}
