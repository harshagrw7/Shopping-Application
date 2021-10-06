package com.capgemini.shopping.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.shopping.entity.Order;
import com.capgemini.shopping.repository.IOrderRepository;

@Service
public class IOrderServiceImpl implements IOrderRepository {

	@Override
	public Order addOrder(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order updateOrder(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order removeOrder(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order viewOrder(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> viewAllOrders(LocalDate date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> viewAllOrdersbyLocation(String loc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> viewAllOrdersbyUserId(String UserId) {
		// TODO Auto-generated method stub
		return null;
	}

}
