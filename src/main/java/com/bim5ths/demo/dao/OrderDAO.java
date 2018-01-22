package com.bim5ths.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.bim5ths.demo.entity.Order;

public interface OrderDAO extends JpaRepository<Order,Integer>{

	
	
	
}
