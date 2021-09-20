package com.htc.bookingservices.externalservices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Component
@FeignClient(url = "http://localhost:4812",name="user-management-service")
public interface UserServiceInterface {
	
	@PostMapping("/insert/user") 
	public UserServiceInterface createNewUser(@RequestBody UserServiceInterface userService);
}
