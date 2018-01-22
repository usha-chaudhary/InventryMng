package com.bim5ths.demo.service;

import java.util.List;

import com.bim5ths.demo.entity.Customer;

public interface CustomerService {
    List<Customer> allCustomer();
	Customer oneCustomer(int id);
	Customer createCustomer(Customer customer);
}
