package com.bim5ths.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bim5ths.demo.dao.OrderDAO;
import com.bim5ths.demo.entity.Order;
@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	OrderDAO orderDAO;
	@Override
	public List<Order> allOrder() {
		
		return orderDAO.findAll() ;
	}

	@Override
	public Order oneOrder(int id) {
		
		return orderDAO.findOne(id);
	}

	@Override
	public Order createOrder(Order order) {
		
		return orderDAO.save(order);
	}

}
