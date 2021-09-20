package com.htc.userservice.configuration;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ReceiverConfiguration {

	
	@Value("${details_receiver.queue}")
	private String queueName;
	
	@Value("${details_sender.exchange}")
	private String exchangeName;
	
	@Value("${details_sendingVia.routingKey}")
	private String routingKey;
	
	@Bean
	public Queue toQueue() {
		return new Queue(queueName);
	}
	
	@Bean
	public DirectExchange fromExchange() {
		return new DirectExchange(exchangeName);
	}
	
	@Bean
	public MessageConverter convertsMessagetoJson() {
		return new Jackson2JsonMessageConverter();
	}
	
	@Bean
	public AmqpTemplate amqptemplate(ConnectionFactory connectionFactory) {
		 RabbitTemplate rabbitTemplate =new RabbitTemplate(connectionFactory);
		 rabbitTemplate.setMessageConverter(convertsMessagetoJson());     
		return rabbitTemplate;
	}
}