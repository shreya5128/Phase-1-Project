package com.shreya.SportyShoes.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shreya.SportyShoes.entity.Product;
import com.shreya.SportyShoes.service.ProductService;

public class ProductController {

	@Autowired
	public ProductService prodserv;
	
	@RequestMapping("/listprod")
	public String viewListProductPage(Model model)
	{
		List<Product>listProduct= prodserv.listAll();
		model.addAttribute("listProduct", listProduct);
		return"product_manage";
		
	}
	
	@RequestMapping("/newproduct")
	public String addNewProductPage(Model model)
	{
		Product product= new Product();
		model.addAttribute("product", product);
		
		return"new_product";
	}
	
	@RequestMapping(value = "/saveproduct", method = RequestMethod.POST)
	public String saveCategory(@ModelAttribute("product") Product product, Model md) 
	{   
		
		prodserv.save(product);
		List<Product>listProduct= prodserv.listAll();
		md.addAttribute("listProduct", listProduct);
		
		return"product_manage";
	
	}

}
