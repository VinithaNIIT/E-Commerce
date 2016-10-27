package com.niit.controller;

import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.UserDAO;
import com.niit.model.User;

@Controller
public class UserController {
	
	@Autowired
	UserDAO userDAO;
	
	@RequestMapping("/isValidUser")
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
		
	}
	
	
	@RequestMapping("/Registrationsuccess")
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
	}
	/* public int insertRow(User u) {
		  return userDAO.insertRow(u);
		 }
	
	@RequestMapping("/Registrationsuccess")
	public ModelAndView registrationsuccess(@ModelAttribute User u,BindingResult result)
	{
		userDAO.insertRow(u);
		
		ModelAndView mv=new ModelAndView("registrationsuccess");
		return mv;
	}*/

}
