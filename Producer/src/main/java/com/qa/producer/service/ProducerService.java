package com.qa.producer.service;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

	private JmsTemplate jms;

	public ProducerService(JmsTemplate jms) {
		super();
		this.jms = jms;
	}

	public void sendMessage(String message) {
		jms.convertAndSend("first-queue", message);
	}
}
