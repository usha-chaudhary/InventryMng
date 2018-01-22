package com.bim5ths.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bim5ths.demo.entity.Product;

public interface ProductDAO extends JpaRepository<Product, Integer>{
	

}
