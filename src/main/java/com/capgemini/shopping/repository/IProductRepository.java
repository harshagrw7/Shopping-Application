package com.capgemini.shopping.repository;

import java.util.List;

import com.capgemini.shopping.entity.Product;

public interface IProductRepository {
	
	Product addProduct(Product product);
	Product updateProduct(Product product);
	Product removeProduct(int pId);
	Product viewProduct(int pId);
	List<Product> viewAllProducts();
	List<Product> viewProductByCategory(String cName);

}
