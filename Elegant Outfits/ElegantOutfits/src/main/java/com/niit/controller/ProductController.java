package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.niit.dao.ProductDAOImpl;
import com.niit.model.Product;

@Controller
public class ProductController {
	
	@Autowired
	ProductDAOImpl productDAOImpl;
	
	@RequestMapping(value="/viewproductdetails/{categoryid}")
	public ModelAndView viewproductdetails(@PathVariable String categoryid)
	{
		Gson gson=new Gson();
		String list=gson.toJson(productDAOImpl.getAllProductByCategoryId(categoryid));
		System.out.println("Categoryid"+categoryid);
		ModelAndView mv=new ModelAndView("viewproductdetails");
		mv.addObject("list",list);
		System.out.println("View Product details"+list);
		return mv;
	
	}
	
	@RequestMapping(value="/productdetails/{productid}")
	public ModelAndView productdetails(@PathVariable String productid)
	{
		ModelAndView mv=new ModelAndView("productdetails");
		Product p=productDAOImpl.getProductById(productid);
		mv.addObject("p",p);
		return mv;
	}
	
	
	
}
