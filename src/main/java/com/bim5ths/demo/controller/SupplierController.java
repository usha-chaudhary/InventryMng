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
import com.bim5ths.demo.entity.Supplier;
import com.bim5ths.demo.service.SupplierService;

@RestController
@RequestMapping("suppliers")
public class SupplierController {
	@Autowired 
	SupplierService suppierService;
		@RequestMapping(method=RequestMethod.GET,value="/all")
		public ResponseEntity<List<Supplier>> getAllSupplier(){
			List<Supplier> res=suppierService.allSupplier();
			if(res==null||res.isEmpty()){
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<List<Supplier>>(res, HttpStatus.OK);
		}
		
		@RequestMapping(method=RequestMethod.GET, value="/supplier/{id}")	
		public ResponseEntity<Supplier> getSupplier(@PathVariable ("id") int id){
			Supplier supp=suppierService.oneSupplier(id);
		if(supp==null){
			return new ResponseEntity<Supplier>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Supplier>(supp,HttpStatus.OK);
		}
		
		//adding data in a database
		@RequestMapping(method=RequestMethod.POST)	
		public ResponseEntity<Supplier> create(@RequestBody Supplier supplier){
			Supplier supp=suppierService.createSupplier(supplier);					
			return new ResponseEntity<Supplier>(supp,HttpStatus.CREATED);
		}
	
	
}
