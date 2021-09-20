package com.htc.userservice.receiver;

import java.time.LocalDateTime;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.htc.userservice.dto.CentreDto;

@Component
public class Receiver {

		@RabbitListener(queues = "userservice")
		public void receivesFromQueue(CentreDto centre) {
			System.out.println("Recieved details Of Center @" + LocalDateTime.now() + " " +centre.toString());
		}
	}
