package com.shreya.SportyShoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shreya.SportyShoes.service.CategoriesService;

@Controller
public class CategoriesController {

	@Autowired
	private CategoriesService catserv;
	@RequestMapping("/listcat")
	public String viewListPage(Model model)
	{
		List<CategoriesController> listCategories= catserv.listAll();
		model.addAttribute("listCategories", listCategories);
		return "manage";
	}
	@RequestMapping("/new")
	public String addNewCatPage(Model model)
	{
		CategoriesController categories= new CategoriesController();
		model.addAttribute("categories", categories);
		return "new_category";
	}
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveCategory(@ModelAttribute("categories") CategoriesController categories, Model m) 
	{   
		catserv.save(categories);
		List<CategoriesController> listCategories= catserv.listAll();
		m.addAttribute("listCategories", listCategories);
	return "manage";
	}	
	@RequestMapping("/delete/{id}")
	public String deleteCategory(@PathVariable(name ="id") long id, Model m)
	{
		catserv.delete(id);
		List<CategoriesController> listCategories= catserv.listAll();
		m.addAttribute("listCategories", listCategories);
		return "manage";
	}
}
