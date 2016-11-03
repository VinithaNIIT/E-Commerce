package com.niit.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
		System.out.println("Inside controller"+supplier);
		return new ModelAndView("redirect:/viewsupplier");
	}
	
	/*@RequestMapping("/Supplierdetails")
	public ModelAndView supplierdetails(@RequestParam("suppliername") String suppliername, @RequestParam("supplierdescription") String supplierdescription)
	{
	   Supplier supplier=new Supplier();
	   supplier.setSuppliername(suppliername);
	   supplier.setSupplierdescription(supplierdescription);
		supplierDAO.insertSupplier(supplier);
		System.out.println("Inside controller"+supplier);
		return new ModelAndView("error");
	}*/
	
	@RequestMapping("/viewsupplier")
	public ModelAndView viewsupplier()
	{
		
		List<Supplier> vlist=supplierDAO.getSupplier();
		return new ModelAndView("viewsupplier","vlist",vlist);
	}
	
	@RequestMapping("/supplier")
	public ModelAndView addsupplier()
	{
	  ModelAndView mv=new ModelAndView("supplier","command",new Supplier());	
	  return mv;
	}
	@RequestMapping(value="/editsupplier1/{supplierid}")
	public ModelAndView editsupplier(@PathVariable String supplierid)
	{
		Supplier supplier=supplierDAO.getSupplierById(supplierid);
		return new ModelAndView("editsupplier","command",supplier);
	}
	@RequestMapping(value="/editsave")
	public ModelAndView editsave(@ModelAttribute("supplier")Supplier supplier)
	{
		
		supplierDAO.updateSupplier(supplier);
		return new ModelAndView("redirect:/viewsupplier");
	}
	@RequestMapping("/deletesupplier/{supplierid}")
	public ModelAndView deletesupplier(@PathVariable String supplierid)
	{
		System.out.println("deletesupplier controller"+supplierid);
		supplierDAO.deleteSupplier(supplierid);
		System.out.println("deletesupplier controller1"+supplierid);
		return new ModelAndView("redirect:/viewsupplier");
		
	}

}
