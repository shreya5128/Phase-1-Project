package com.shreya.SportyShoes.jdbc;

import org.springframework.data.jpa.repository.JpaRepository;
import com.shreya.SportyShoes.controller.CategoriesController;

public interface CategoriesRepository extends JpaRepository<CategoriesController, Long>  {

}
