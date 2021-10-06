package com.capgemini.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.shopping.services.IProductServiceImpl;

@RestController
public class ProductControllerBean {
	
	@Autowired
	private IProductServiceImpl service;

}
