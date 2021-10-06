package com.capgemini.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//
//import com.capgemini.shopping.services.ICustomerServiceImpl;

import com.capgemini.shopping.services.ICustomerServiceImpl;

@RestController
public class CustomerControllerBean {
	
	@Autowired
	private ICustomerServiceImpl customerService;
	
	@RequestMapping("/hello")
	public String  sayHi()
	{
		return "HI";
	}

}
