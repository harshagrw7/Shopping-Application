package com.capgemini.shopping.services;

import org.springframework.stereotype.Service;

import com.capgemini.shopping.entity.Cart;
import com.capgemini.shopping.entity.Product;
import com.capgemini.shopping.repository.ICartRepository;

@Service
public class ICartServiceImpl implements ICartRepository {

	@Override
	public Cart addProductToCart(Cart cart, Product p, int quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart removeProductFromCart(Cart cart, Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart updateProductQuantity(Cart cart, Product p, int quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart removeAllProducts(Cart cart) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart viewAllProducts(Cart cart) {
		// TODO Auto-generated method stub
		return null;
	}

}
