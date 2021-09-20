package com.htc.centerservice.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "centre")
public class Centre implements Serializable{

	
	
	private static final long serialVersionUID = 8992090119454839666L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long centreId;
	private String address;
	private long pincode;
	private LocalDateTime dateandtime;
	
	public Centre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Centre(long centreId, String address, long pincode, LocalDateTime dateandtime) {
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

	public LocalDateTime getDateandTime() {
		return dateandtime;
	}

	public void setDateandTime(LocalDateTime dateandtime) {
		this.dateandtime = dateandtime;
	}

	@Override
	public int hashCode() {
		return Objects.hash(centreId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Centre other = (Centre) obj;
		return centreId == other.centreId;
	}

	@Override
	public String toString() {
		return "Centre [centreId=" + centreId + ", address=" + address + ", pincode=" + pincode + ", dateandtime="
				+ dateandtime + "]";
	}
	
	
}
