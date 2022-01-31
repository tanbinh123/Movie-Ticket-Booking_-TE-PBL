package com.group5.pbl.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.group5.pbl.entity.User;
import com.group5.pbl.exception.userNotFoundException;
import com.group5.pbl.service.userService;

@RestController
public class userController {
	
	@Autowired
	userService service;
	
	
	@PostMapping("/addUser")
	public String registerUserr(@RequestBody User user) {
		service.addUser(user);
		System.out.println(user);
		String hi = "User Registered";
		return hi;
	}
	
//	@PostMapping("/login")
//	public User registerUser(@RequestBody User user) throws userNotFoundException {
//		System.out.println(user);
//		User userObj = service.loginValidation(user); 
//		return user;
//	}
	}

	
	

