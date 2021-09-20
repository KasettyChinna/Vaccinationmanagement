package com.htc.centerservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.htc.centerservice.model.Centre;


public interface CentreRepository extends JpaRepository<Centre, Long> {
	
	@Query(value = "SELECT centre_id,address,pincode,dateandtime FROM centre WHERE pincode=?1",nativeQuery = true)
	public List<Centre> findByPincode(long pincode);

}
