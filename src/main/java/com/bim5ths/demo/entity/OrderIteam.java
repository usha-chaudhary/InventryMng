package com.bim5ths.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderIteam {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	private int orderId;
	private int productId;
	private double unitPrice;
	private int quantity;
	
	public OrderIteam(){
		
	}
	
	public OrderIteam(int orderId,int productId,double unitPrice,int quantity){
		
		this.orderId=orderId;
		this.productId=productId;
		this.unitPrice=unitPrice;
		this.quantity=quantity;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
