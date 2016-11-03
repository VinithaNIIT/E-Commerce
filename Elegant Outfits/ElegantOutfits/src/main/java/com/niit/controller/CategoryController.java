package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.CategoryDAO;
import com.niit.model.Category;


@Controller
public class CategoryController {

	@Autowired
	CategoryDAO categoryDAO;
	
	@RequestMapping("/category")
	public ModelAndView addcategory()
	{
	  ModelAndView mv=new ModelAndView("category","command",new Category());	
	  return mv;
	}
	@RequestMapping("/categorydetails")
	public ModelAndView categorydetails(@ModelAttribute Category category )
	{
		categoryDAO.insertCategory(category);
		return new ModelAndView("redirect:/viewcategory");
		
	}
	@RequestMapping("/viewcategory")
	public ModelAndView viewcategory()
	{
		List<Category> list=categoryDAO.getCategory();
		return new ModelAndView("viewcategory","list",list);
	}
	
	@RequestMapping("/editcategory/{categoryid}")
	public ModelAndView editcategory(@PathVariable String categoryid)
	{
		Category category=categoryDAO.getCategoryById(categoryid);
		return new ModelAndView("editcategory","command",category);
		
	}
	@RequestMapping("/categorysave")
	public ModelAndView categorysave(@ModelAttribute Category category)
	{
		categoryDAO.updateCategory(category);
		return new ModelAndView("redirect:/viewcategory");
	}
	@RequestMapping("/deletecategory/{categoryid}")
	public ModelAndView deletecategory(@PathVariable String categoryid)
	{
		categoryDAO.deleteCategory(categoryid);
		return new ModelAndView("redirect:/viewcategory");
	}
	
	
	
}
