package com.capgemini.shopping.entity;

import java.time.LocalDate;
import java.util.Map;

public class Order {
	private String orderId;
	private String orderStatus;
	private LocalDate orderDate;
	private Customer customer;
	private Map<Integer,Product>productList;
	private Address address;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Map<Integer, Product> getProductList() {
		return productList;
	}
	public void setProductList(Map<Integer, Product> productList) {
		this.productList = productList;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	

}
