package com.bim5ths.demo.service;

import java.util.List;

import com.bim5ths.demo.entity.OrderIteam;

public interface OrderIteamService {
List<OrderIteam> allOrderIteam();	
OrderIteam oneOrderIteam(int id);
OrderIteam createOrderIteam(OrderIteam orderIteam);

}
