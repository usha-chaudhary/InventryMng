package com.bim5ths.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bim5ths.demo.dao.CustomerDAO;
import com.bim5ths.demo.entity.Customer;
@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	CustomerDAO customerDAO;

	@Override
	public List<Customer> allCustomer() {		
		return customerDAO.findAll();
	}

	@Override
	public Customer oneCustomer(int id) {		
		return customerDAO.findOne(id);
	}

	@Override
	public Customer createCustomer(Customer customer) {
		return customerDAO.save(customer);
	}


}
