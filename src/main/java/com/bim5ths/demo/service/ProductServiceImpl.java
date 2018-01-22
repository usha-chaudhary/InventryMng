package com.bim5ths.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bim5ths.demo.dao.CustomerDAO;
import com.bim5ths.demo.dao.ProductDAO;
import com.bim5ths.demo.entity.Product;
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductDAO productDAO;
	@Override
	public List<Product> allProduct() {
		// TODO Auto-generated method stub
		return productDAO.findAll();
	}

	@Override
	public Product oneProduct(int id) {
		// TODO Auto-generated method stub
		return productDAO.findOne(id);
	}

	@Override
	public Product createProduct(Product product) {
		// TODO Auto-generated method stub
		return productDAO.save(product);
	}

}
