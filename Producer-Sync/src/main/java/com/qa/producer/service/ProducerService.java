package com.qa.producer.service;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProducerService {

	private RestTemplate rest;

	public ProducerService(RestTemplateBuilder restBuilder) {
		super();
		this.rest = restBuilder.build();
	}

	public void sendMessage(String message) {
		rest.put("http://localhost:8081/receiveMessage/" + message, null);
	}
}
