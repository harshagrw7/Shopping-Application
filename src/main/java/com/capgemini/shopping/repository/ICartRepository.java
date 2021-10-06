package com.capgemini.shopping.repository;

import com.capgemini.shopping.entity.Cart;
import com.capgemini.shopping.entity.Product;

public interface ICartRepository {
	Cart addProductToCart(Cart cart,Product p, int quantity);
	Cart removeProductFromCart(Cart cart, Product product);
	Cart updateProductQuantity(Cart cart,Product p, int quantity);
	Cart removeAllProducts(Cart cart);
	Cart viewAllProducts(Cart cart);
}
