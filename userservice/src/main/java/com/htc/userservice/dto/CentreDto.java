package com.htc.userservice.dto;

import java.time.LocalDateTime;

public class CentreDto {

	private long centreId;
	private String address;
	private long pincode;
	private LocalDateTime dateandtime;
	public CentreDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CentreDto(long centreId, String address, long pincode, LocalDateTime dateandtime) {
		super();
		this.centreId = centreId;
		this.address = address;
		this.pincode = pincode;
		this.dateandtime = dateandtime;
	}
	public long getCentreId() {
		return centreId;
	}
	public void setCentreId(long centreId) {
		this.centreId = centreId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public LocalDateTime getDateandtime() {
		return dateandtime;
	}
	public void setDateandtime(LocalDateTime dateandtime) {
		this.dateandtime = dateandtime;
	}
	@Override
	public String toString() {
		return "Centre [centreId=" + centreId + ", address=" + address + ", pincode=" + pincode + ", dateandtime="
				+ dateandtime + "]";
	}
	
	
}
