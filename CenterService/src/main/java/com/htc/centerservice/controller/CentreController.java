package com.htc.centerservice.controller;

import java.util.List;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.htc.centerservice.dao.CentreRepository;
import com.htc.centerservice.model.Centre;
import com.rabbitmq.client.AMQP.Exchange;

@RestController
@Component
public class CentreController {
	
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	@Autowired
	private Exchange exchange;

	@Value("${data_sendingVia.routingKey}")
	private String routingKey;

	@Autowired
	private CentreRepository centreRepository;
	
	@PostMapping("/centre/create")
	public Centre createCentre(@RequestBody Centre centre) {
		rabbitTemplate.convertSendAndReceive(exchange.toString(), routingKey, centre);
		return centreRepository.save(centre);
	}
	
	@GetMapping("/centre/{centreId}")
	public Centre getCentrebyId(@PathVariable Long centreId) {
		return centreRepository.findById(centreId).get();
	}
	
	@GetMapping("/vaccination/centre/{pincode}")
	public List<Centre> getCentrebypinCode(@PathVariable Long pincode) {
		return centreRepository.findByPincode(pincode);
	}
}
