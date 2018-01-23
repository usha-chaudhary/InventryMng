package com.bim5ths.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bim5ths.demo.dao.OrderIteamDAO;
import com.bim5ths.demo.entity.OrderIteam;
@Service
public class OrderIteamServiceImpl implements OrderIteamService{
	@Autowired
	OrderIteamDAO orderIteamDAO;
	@Override
	public List<OrderIteam> allOrderIteam() {		
		return orderIteamDAO.findAll();
	}

	@Override
	public OrderIteam oneOrderIteam(int id) {		
		return orderIteamDAO.findOne(id);
	}

	@Override
	public OrderIteam createOrderIteam(OrderIteam orderIteam) {
		return orderIteamDAO.save(orderIteam);
	}

}
