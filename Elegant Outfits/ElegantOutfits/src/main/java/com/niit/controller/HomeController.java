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
	@RequestMapping("/Supplierfront")
	public ModelAndView supplier()
	{
	  ModelAndView mv=new ModelAndView("supplierfront");	
	  return mv;
	}
	
	
	
	@RequestMapping("/categoryfront")
	public ModelAndView category()
	{
	  ModelAndView mv=new ModelAndView("categoryfront");	
	  return mv;
	}
	
	@RequestMapping("/productfront")
	public ModelAndView product()
	{
	  ModelAndView mv=new ModelAndView("productfront");	
	  return mv;
	}
	
	@RequestMapping("/adminlogin")
	public ModelAndView adminlogin()
	{
	  ModelAndView mv=new ModelAndView("adminlogin");	
	  return mv;
	}
	@RequestMapping("/Admin")
	public ModelAndView admin()
	{
	  ModelAndView mv=new ModelAndView("admin");	
	  return mv;
	}
	
	@RequestMapping("/adminloginerror")
	public ModelAndView adminloginerror()
	{
	  ModelAndView mv=new ModelAndView("adminloginerror");	
	  return mv;
	}

}
