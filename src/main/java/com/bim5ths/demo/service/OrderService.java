package com.bim5ths.demo.service;

import java.util.List;

import com.bim5ths.demo.entity.Order;

public interface OrderService  {
List<Order> allOrder();
Order oneOrder(int id);
Order createOrder(Order order);
	
}
