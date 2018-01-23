package com.bim5ths.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.bim5ths.demo.entity.Customer;
import com.bim5ths.demo.service.CustomerService;


@RestController
@RequestMapping("customers")
public class CustomerController {
@Autowired 
CustomerService customerServics;
	@RequestMapping(method=RequestMethod.GET,value="/all")
	public ResponseEntity<List<Customer>> getAllCustomer(){
		List<Customer> res=customerServics.allCustomer();
		if(res==null||res.isEmpty()){
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Customer>>(res, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="customer/{id}")	
	public ResponseEntity<Customer> getCustomer(@PathVariable ("id") int id){
	Customer cus=customerServics.oneCustomer(id);
	if(cus==null){
		return new ResponseEntity<Customer>(HttpStatus.NO_CONTENT);
	}
	return new ResponseEntity<Customer>(cus,HttpStatus.OK);
	}
	
	//adding data in a database
	@RequestMapping(method=RequestMethod.POST)	
	public ResponseEntity<Customer> create(@RequestBody Customer customer){
		Customer cus=customerServics.createCustomer(customer);					
		return new ResponseEntity<Customer>(cus,HttpStatus.CREATED);
	}
	
//	//Deleting data from database
//	@RequestMapping(method=RequestMethod.DELETE, value="/delete")	
//	public List<Customer> removeCustomer(@RequestParam int id){	
//		customerDao.delete(id);
//		return customerDao.findAll();
//	}
}
