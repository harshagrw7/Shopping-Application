package com.capgemini.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.shopping.services.IAddressServiceImpl;

@RestController
public class AddressControllerBean {
	
	@Autowired
	private IAddressServiceImpl service;

}
