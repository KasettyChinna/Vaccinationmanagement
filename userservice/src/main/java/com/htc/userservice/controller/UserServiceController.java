package com.htc.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htc.userservice.model.User;
import com.htc.userservice.service.UserServiceRepository;

@RestController
@RequestMapping("/api")
public class UserServiceController {

	@Autowired
	UserServiceRepository userServiceInterface;
	
	@PostMapping("/adduser") 
	public User createNewUser(@RequestBody User userService) {
		   
		 return userServiceInterface.save(userService);
		 
	}
	
}
