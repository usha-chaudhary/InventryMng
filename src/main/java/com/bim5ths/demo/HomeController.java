package com.bim5ths.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("h")
public class HomeController {
 @RequestMapping(method=RequestMethod.GET)
	public String display(){
		
		return "Hello";
	}
}
