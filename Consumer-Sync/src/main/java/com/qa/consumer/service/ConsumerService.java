package com.qa.consumer.service;

import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

	public void receiveMessage(String message) {
		try {
			Thread.sleep(10_000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("RECEIVED: <" + message + ">");
	}
}
