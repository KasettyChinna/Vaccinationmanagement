package com.htc.bookingservices.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


public class Booking {

	private long booking_id;
	private List<Userservice> userdetails;
	private List<CentreService> centredetails;
	
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Booking(long booking_id, List<Userservice> userdetails, List<CentreService> centredetails) {
		super();
		this.booking_id = booking_id;
		this.userdetails = userdetails;
		this.centredetails = centredetails;
	}

	public long getBooking_id() {
		return booking_id;
	}

	public void setBooking_id(long booking_id) {
		this.booking_id = booking_id;
	}

	public List<Userservice> getUserdetails() {
		return userdetails;
	}

	public void setUserdetails(List<Userservice> userdetails) {
		this.userdetails = userdetails;
	}

	public List<CentreService> getCentredetails() {
		return centredetails;
	}

	public void setCentredetails(List<CentreService> centredetails) {
		this.centredetails = centredetails;
	}

	
	
	
}
