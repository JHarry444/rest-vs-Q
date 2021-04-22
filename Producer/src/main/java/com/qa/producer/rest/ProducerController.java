package com.qa.producer.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.producer.service.ProducerService;

@RestController
public class ProducerController {

	private ProducerService service;

	public ProducerController(ProducerService service) {
		super();
		this.service = service;
	}

	@PutMapping("/addToQ/{message}")
	public void sendToQ(@PathVariable String message) {
		this.service.sendMessage(message);
	}
}
