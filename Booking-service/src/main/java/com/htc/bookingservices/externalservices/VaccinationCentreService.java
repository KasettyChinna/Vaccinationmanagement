package com.htc.bookingservices.externalservices;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.htc.bookingservices.entity.CentreService;

@Component
@FeignClient(url = "http://localhost:4811",name="vaccination-centre-service")
public interface VaccinationCentreService {

	@GetMapping("/vaccination/centre/{pincode}")
	public List<CentreService> getCentrebypinCode(@PathVariable Long pincode);
}
