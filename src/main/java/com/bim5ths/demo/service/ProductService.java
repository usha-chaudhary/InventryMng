package com.bim5ths.demo.service;

import java.util.List;

import com.bim5ths.demo.entity.Product;

public interface ProductService {
	List<Product> allProduct();
	Product oneProduct(int id);
	Product createProduct(Product product);
	

}
