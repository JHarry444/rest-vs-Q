package com.qa.consumer.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.consumer.service.ConsumerService;

@RestController
public class ConsumerRest {

	private ConsumerService service;

	public ConsumerRest(ConsumerService service) {
		super();
		this.service = service;
	}

	@PutMapping("/receiveMessage/{message}")
	public void sendMessage(@PathVariable String message) {
		this.service.receiveMessage(message);
	}
}
