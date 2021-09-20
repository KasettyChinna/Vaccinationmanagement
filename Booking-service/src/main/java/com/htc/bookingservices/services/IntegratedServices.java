package com.htc.bookingservices.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.htc.bookingservices.entity.Booking;
import com.htc.bookingservices.entity.Userservice;
import com.htc.bookingservices.externalservices.UserServiceInterface;
import com.htc.bookingservices.externalservices.VaccinationCentreService;


public interface IntegratedServices {
	
	/*
	 * @Autowired UserServiceInterface userServiceInterface;
	 * 
	 * @Autowired VaccinationCentreService vaccinationCentreService;
	 * 
	 * 
	 * public Booking getBookingInformation(long bookingId) { Booking info=new
	 * Booking();
	 * 
	 * 
	 * List<Userservice> userService= new ArrayList<>();
	 * userService.addAll(userServiceInterface);
	 * prod.setRecommendations(recomendations); prod.setWeight(product.getWeight());
	 * 
	 * return prod;
	 * 
	 * }
	 */
}
