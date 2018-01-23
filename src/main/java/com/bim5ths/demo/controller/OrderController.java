package com.bim5ths.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.bim5ths.demo.entity.Order;
import com.bim5ths.demo.service.OrderService;

@RestController
@RequestMapping("orders")
public class OrderController {
	
	@Autowired 
	OrderService orderService;
		@RequestMapping(method=RequestMethod.GET,value="/all")
		public ResponseEntity<List<Order>> getAllOrder(){
			List<Order> res=orderService.allOrder();
			if(res==null||res.isEmpty()){
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<List<Order>>(res, HttpStatus.OK);
		}
		
		@RequestMapping(method=RequestMethod.GET, value="/order/{id}")	
		public ResponseEntity<Order> getOrder(@PathVariable ("id") int id){
			Order ord=orderService.oneOrder(id);
		if(ord==null){
			return new ResponseEntity<Order>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Order>(ord,HttpStatus.OK);
		}
		
		//adding data in a database
		@RequestMapping(method=RequestMethod.POST)	
		public ResponseEntity<Order> create(@RequestBody Order order){
			Order ord=orderService.createOrder(order);					
			return new ResponseEntity<Order>(ord,HttpStatus.CREATED);
		}
		

	
}
