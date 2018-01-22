package com.bim5ths.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bim5ths.demo.dao.OrderDAO;
import com.bim5ths.demo.entity.Customer;
import com.bim5ths.demo.entity.Order;
import com.bim5ths.demo.entity.OrderIteam;

@RestController
@RequestMapping("orders")
public class OrderController {
	
}
