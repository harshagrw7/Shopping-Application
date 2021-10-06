package com.capgemini.shopping.repository;

import java.time.LocalDate;
import java.util.List;

import com.capgemini.shopping.entity.Order;

public interface IOrderRepository {
	Order addOrder(Order order);
	Order updateOrder(Order order);
	Order removeOrder(Order order);
	Order viewOrder(Order order);
	List<Order> viewAllOrders(LocalDate date);
	List<Order> viewAllOrdersbyLocation(String loc);
	List<Order> viewAllOrdersbyUserId(String UserId);
	

}
