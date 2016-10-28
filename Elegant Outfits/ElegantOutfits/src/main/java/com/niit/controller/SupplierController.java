package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.SupplierDAOImpl;
import com.niit.model.Supplier;

@Controller
public class SupplierController {
	
	@Autowired
	SupplierDAOImpl supplierDAO;
	
	@RequestMapping("/Supplierdetails")
	public ModelAndView supplierdetails(@ModelAttribute Supplier supplier)
	{
		supplierDAO.insertSupplier(supplier);
		ModelAndView mv=new ModelAndView("suppliersuccess");
		return mv;
	}

}
