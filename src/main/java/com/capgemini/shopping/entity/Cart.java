package com.capgemini.shopping.entity;

import java.util.Map;

public class Cart {
	private String cartId;
	private Customer customer;
	private Map<Integer,Product> products;
	public String getCartId() {
		return cartId;
	}
	public void setCartId(String cartId) {
		this.cartId = cartId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Map<Integer, Product> getProducts() {
		return products;
	}
	public void setProducts(Map<Integer, Product> products) {
		this.products = products;
	}
	
	

}
