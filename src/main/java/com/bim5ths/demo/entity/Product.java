package com.bim5ths.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String productName;
	private int supplierId;
	private Float unitPrice;
	private String packaging;
	private String isDiscontinued;
	
	public Product(){
		
	}
	
	public Product(String productName,int supplierId,float unitPrice,String packaging,String isDiscontinued){
		this.productName=productName;
		this.supplierId=supplierId;
		this.unitPrice=unitPrice;
		this.packaging=packaging;
		this.isDiscontinued=isDiscontinued;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public Float getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(Float unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getPackaging() {
		return packaging;
	}
	public void setPackaging(String packaging) {
		this.packaging = packaging;
	}
	public String getIsDiscontinued() {
		return isDiscontinued;
	}
	public void setIsDiscontinued(String isDiscontinued) {
		this.isDiscontinued = isDiscontinued;
	}
}
