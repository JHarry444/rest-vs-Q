package com.qa.consumer.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class LogService {

	// setting up a listener - needs the @EnableJMS to be present in the app for it
	// to work
	@JmsListener(destination = "hello-q")
	public void receiveMessage(String message) {
		System.out.println("Received: <" + message + ">");
	}
}
