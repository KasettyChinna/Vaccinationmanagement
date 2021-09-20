package com.htc.centerservice.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

@Configuration
public class SenderConfiguration {

	@Value("${data_receiver.queue}")
	private String queueName;
	
	@Value("${data_sender.exchange}")
	private String exchangeName;
	
	@Value("${data_sendingVia.routingKey}")
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
	public Binding buildConnection(Queue queueName,DirectExchange exchangeName) {
		return BindingBuilder.bind(queueName).to(exchangeName).with(routingKey);
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
