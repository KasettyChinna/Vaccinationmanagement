package com.htc.bookingservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.htc.bookingservices.entity.CentreService;
import com.htc.bookingservices.externalservices.UserServiceInterface;
import com.htc.bookingservices.externalservices.VaccinationCentreService;

@RestController
public class Booking_controller {

	@Autowired
	UserServiceInterface userServices;
	
	@Autowired
	VaccinationCentreService vaccinationCentreServices;
	
	@PostMapping("/Booking/user") 
	public UserServiceInterface createNewUser(@RequestBody UserServiceInterface userService) {
		
		return userServices.createNewUser(userService);
	}
	
	@GetMapping("/Booking/Search/{pincode}")
	public List<CentreService> getCentreDetailsBypinCode(@PathVariable Long pincode){
		return vaccinationCentreServices.getCentrebypinCode(pincode);
	}
	
}
