package com.capgemini.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.shopping.services.ILoginServiceImpl;

@RestController
public class UserLoginBean {
	
	@Autowired
	private ILoginServiceImpl service;

}
