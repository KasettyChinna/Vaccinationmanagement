package com.htc.userservice.dto;

public class UserDto {


		private String userName;
		private long phoneNumber;
		private String emailAddress;
		private long age;
		private String gender;
		
		public UserDto() {
			super();
			// TODO Auto-generated constructor stub
		}
		public UserDto(String userName, long phoneNumber, String emailAddress, long age, String gender) {
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
		public String toString() {
			return "UserService [userName=" + userName + ", phoneNumber=" + phoneNumber + ", emailAddress=" + emailAddress
					+ ", age=" + age + ", gender=" + gender + "]";
		}
}
