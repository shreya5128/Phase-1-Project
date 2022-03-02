package com.shreya.SportyShoes.service;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shreya.SportyShoes.controller.CategoriesController;
import com.shreya.SportyShoes.jdbc.CategoriesRepository;

@Service
@Transactional

public class CategoriesService {

	@Autowired
	private CategoriesRepository catrepo;
	public List<CategoriesController> listAll()
	{
		return catrepo.findAll();
	}
	public void save(CategoriesController categories)
	{
		catrepo.save(categories);
	}
		public CategoriesController get(long id)
	{
		return catrepo.findById(id).get();
	}
	public void delete(long id)
	{
		catrepo.deleteById(id);
	}

}
