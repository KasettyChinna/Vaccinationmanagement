package com.htc.userservice.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.htc.userservice.model.User;

public interface UserServiceRepository  extends JpaRepository<User, Long>{
	
	

}
