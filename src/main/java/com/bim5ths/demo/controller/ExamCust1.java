package com.bim5ths.demo.controller;

	import java.util.ArrayList;
	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.bind.annotation.RestController;

	import com.bim5ths.demo.dao.CustomerDAO;
	import com.bim5ths.demo.entity.Customer;
	import com.bim5ths.demo.entity.OrderIteam;
	import com.bim5ths.demo.entity.Supplier;


	@RestController
	@RequestMapping("customers")
	public class ExamCust1 {
	@Autowired 
	CustomerDAO customerDao;
		@RequestMapping(method=RequestMethod.GET)
		public List<Customer> getAllCustomer(){
			return customerDao.findAll();
			
		}
		
		@RequestMapping(method=RequestMethod.GET, value="/customer")	
		public Customer getCustomer(@RequestParam int id){
		Customer i=customerDao.findOne(id);
		return i;
		}
		
		//adding data in a database
		@RequestMapping(method=RequestMethod.POST, value="/add")	
		public void add(){
			List<Customer> supp=new ArrayList<>();
			supp.add(new Customer("Renu","Makaju","Bhaktapur","Nepal","0987654321"));			
			customerDao.save(supp);
		}
		
		//Deleting data from database
		@RequestMapping(method=RequestMethod.DELETE, value="/delete")	
		public List<Customer> removeCustomer(@RequestParam int id){	
			customerDao.delete(id);
			return customerDao.findAll();
		}
	}



