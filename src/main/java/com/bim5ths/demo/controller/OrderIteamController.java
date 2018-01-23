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
import com.bim5ths.demo.entity.OrderIteam;
import com.bim5ths.demo.service.OrderIteamService;

@RestController
@RequestMapping("orderiteams")
public class OrderIteamController {
	@Autowired 
	OrderIteamService orderIteamService;
		@RequestMapping(method=RequestMethod.GET,value="/all")
		public ResponseEntity<List<OrderIteam>> getAllOrderIteam(){
			List<OrderIteam> res=orderIteamService.allOrderIteam();
			if(res==null||res.isEmpty()){
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<List<OrderIteam>>(res, HttpStatus.OK);
		}
		
		@RequestMapping(method=RequestMethod.GET, value="/orderIteam/{id}")	
		public ResponseEntity<OrderIteam> getOrderIteam(@PathVariable ("id") int id){
			OrderIteam iteam=orderIteamService.oneOrderIteam(id);
		if(iteam==null){
			return new ResponseEntity<OrderIteam>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<OrderIteam>(iteam,HttpStatus.OK);
		}
		
		//adding data in a database
		@RequestMapping(method=RequestMethod.POST)	
		public ResponseEntity<OrderIteam> create(@RequestBody OrderIteam orderIteam){
			OrderIteam iteam=orderIteamService.createOrderIteam(orderIteam);					
			return new ResponseEntity<OrderIteam>(iteam,HttpStatus.CREATED);
		}
	
}
