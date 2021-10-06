package com.capgemini.shopping.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.shopping.entity.Product;
import com.capgemini.shopping.repository.IProductRepository;

@Service
public class IProductServiceImpl implements IProductRepository {

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product removeProduct(int pId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product viewProduct(int pId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> viewAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> viewProductByCategory(String cName) {
		// TODO Auto-generated method stub
		return null;
	}

}
