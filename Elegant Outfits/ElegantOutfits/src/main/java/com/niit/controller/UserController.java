package com.niit.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.niit.dao.UserDAOImpl;
import com.niit.model.User;

@Controller
public class UserController {
	
	@Autowired
	UserDAOImpl userDAO;
	
	
	
	/*@RequestMapping("/isValidUser")
	public ModelAndView validateUser(HttpServletRequest request)
	{
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		boolean x=userDAO.validate(username, password);
		if(x)
		{
			return new ModelAndView("welcome");
		}
		else
		{
			return new ModelAndView("error");	
		}
		
	}*/
	
	
	/*@RequestMapping("/Registrationsuccess")
	public ModelAndView registrationsuccess(HttpServletRequest request)
	{
		ModelAndView mv=new ModelAndView("registrationsuccess");
		String firstname=request.getParameter("firstname");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		long mobile=Long.parseLong(request.getParameter("mobile"));
		userDAO.addUser(firstname, username, password, email, mobile);
		return mv;
	}*/
	
	@RequestMapping("/isValidUser")
	public ModelAndView validateUser(HttpServletRequest request,HttpSession session)
	{
		String role;
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		boolean x=userDAO.validate(username, password);
		if(x)
		{
			session.setAttribute("username", username);
			return new ModelAndView("index");
		}
		else
		{
			return new ModelAndView("error");	
		}
		
	}
	

	@RequestMapping("/Registrationsuccess")
	public ModelAndView registrationsuccess(@ModelAttribute User u)
	{
		u.setEnabled(true);
		u.setRole("ROLE_USER");
		userDAO.addUser(u);
		
		ModelAndView mv=new ModelAndView("registrationsuccess");
		return mv;
	}
	
	@RequestMapping("/logout1")
	public ModelAndView logout1(HttpServletRequest request)
	{
		ModelAndView mv=new ModelAndView("index");
		HttpSession session=request.getSession(false);
		session.invalidate();
		return mv;
	}
	
	
	
	
		


}
