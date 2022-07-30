package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerOperationController {
	
	@Value("${dbuser}")
	private String user;

	@Value("${dbpassword}")
	private String pass;
	
	@GetMapping("/display")
	public String displayData() {
		return "(Customer)Data collected through config server::" + user + "::"+pass;
	}

}