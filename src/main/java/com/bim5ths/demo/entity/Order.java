package com.bim5ths.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products_order")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	private String orderDate;
	private String orderNumber;
	private int customerId;
	private double totalAmount;
	
	public Order(){
		
	}
	
	public Order(String orderDate,String orderNumber,int customerId,double totalAmount){
		this.orderDate=orderDate;
		this.orderNumber=orderNumber;
		this.customerId=customerId;
		this.totalAmount=totalAmount;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}
}
