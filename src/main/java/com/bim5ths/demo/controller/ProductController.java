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
import com.bim5ths.demo.entity.Product;
import com.bim5ths.demo.service.ProductService;

@RestController
@RequestMapping("products")
public class ProductController {
	@Autowired 
	ProductService productService;
		@RequestMapping(method=RequestMethod.GET,value="/all")
		public ResponseEntity<List<Product>> getAllProduct(){
			List<Product> res=productService.allProduct();
			if(res==null||res.isEmpty()){
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<List<Product>>(res, HttpStatus.OK);
		}
		
		@RequestMapping(method=RequestMethod.GET, value="/product/{id}")	
		public ResponseEntity<Product> getProduct(@PathVariable ("id") int id){
			Product cus=productService.oneProduct(id);
		if(cus==null){
			return new ResponseEntity<Product>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Product>(cus,HttpStatus.OK);
		}
		
		//adding data in a database
		@RequestMapping(method=RequestMethod.POST)	
		public ResponseEntity<Product> create(@RequestBody Product product){
			Product cus=productService.createProduct(product);					
			return new ResponseEntity<Product>(cus,HttpStatus.CREATED);
		}
}





