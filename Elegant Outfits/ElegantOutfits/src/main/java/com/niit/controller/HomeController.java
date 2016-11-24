package com.niit.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.CategoryDAOImpl;
import com.niit.model.Category;

@Controller
public class HomeController {
	
	
	@Autowired
	CategoryDAOImpl categoryDAOImpl;
	
	@Autowired
	Category category;
	@RequestMapping("/")
	public ModelAndView index(HttpSession session)
	{
	  ModelAndView mv=new ModelAndView("index");
	// session.setAttribute("category",category);
	  List<Category> categorylist=categoryDAOImpl.getCategory();
	  System.out.println("category list"+categorylist);
		mv.addObject("categorylist", categorylist);
		//session.setAttribute("categorylist", categorylist);
	  return mv;
	}
	
	@RequestMapping("/header")
	public ModelAndView header()
	{
	  ModelAndView mv=new ModelAndView("header");
	// session.setAttribute("category",category);
	  List<Category> categorylist=categoryDAOImpl.getCategory();
	  System.out.println("category list"+categorylist);
		mv.addObject("categorylist", categorylist);
		//session.setAttribute("categorylist", categorylist);
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
	  ModelAndView mv=new ModelAndView("adminhome");	
	  return mv;
	}
	
	@RequestMapping("/adminloginerror")
	public ModelAndView adminloginerror()
	{
	  ModelAndView mv=new ModelAndView("adminloginerror");	
	  return mv;
	}

}
