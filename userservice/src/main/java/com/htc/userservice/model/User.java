package com.htc.userservice.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userService")
public class User implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4209191411223390461L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userId;
	private String userName;
	private long phoneNumber;
	private String emailAddress;
	private long age;
	private String gender;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String userName, long phoneNumber, String emailAddress, long age, String gender) {
		super();
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.age = age;
		this.gender = gender;
	}
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public long getAge() {
		return age;
	}
	public void setAge(long age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(phoneNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return phoneNumber == other.phoneNumber;
	}

	@Override
	public String toString() {
		return "UserService [userName=" + userName + ", phoneNumber=" + phoneNumber + ", emailAddress=" + emailAddress
				+ ", age=" + age + ", gender=" + gender + "]";
	}
}
