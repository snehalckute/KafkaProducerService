/**
 * 
 */
package com.kafka.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.model.MessageDTO;

/**
 * @author Snehooooo
 *
 */
@RestController
public class KafkaProducerController {
	
	@Autowired
	KafkaTemplate<String, MessageDTO> kafkaTemplate;
	
	static final String TOPIC="TestTopic"; 
	
	@GetMapping(value ="/produce/{message}")
	public String publish(@PathVariable String message) {
		
		Message<MessageDTO> messageToPost = MessageBuilder
	            .withPayload(new MessageDTO("1","Snehal", message))
	            .setHeader(KafkaHeaders.TOPIC, TOPIC)
	            //.setHeader(KafkaHeaders.ACKNOWLEDGMENT, false)
	            .build();
		
		kafkaTemplate.send(messageToPost);
		System.out.println("Message Published - "+message);
		return "Message - "+message+ " Published on topic - "+TOPIC;
	}

}
