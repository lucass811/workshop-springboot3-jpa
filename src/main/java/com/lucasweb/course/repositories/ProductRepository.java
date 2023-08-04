package com.lucasweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasweb.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
