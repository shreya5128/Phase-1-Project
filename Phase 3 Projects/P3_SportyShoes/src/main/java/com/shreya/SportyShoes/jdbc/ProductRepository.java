package com.shreya.SportyShoes.jdbc;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shreya.SportyShoes.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
