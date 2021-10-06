package com.capgemini.shopping.repository;

import java.util.List;

import com.capgemini.shopping.entity.Customer;


public interface ICustomerRepository {
	Customer addCustomer(Customer cust);
	Customer updateCustomer(Customer cust);
	Customer removerCustomer(Customer cust);
	Customer viewCustomer(Customer cust);
	List<Customer> viewAllCustomers(String location);
	

}
