package com.qa.consumer.config;

import javax.jms.ConnectionFactory;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;

@Configuration
@EnableJms
// kind of like @RestController - allows you to use @Listener to create listeners
public class AppConfig {

	@Bean
	public ConnectionFactory activeMqConnectionFactory() {
		// creates connections to the activemq server (using defaults)
		return new ActiveMQConnectionFactory();
	}

	@Bean
	public DefaultJmsListenerContainerFactory listenerContainer() {
		DefaultJmsListenerContainerFactory jmsListenerFactory = new DefaultJmsListenerContainerFactory();
		// creates 'listeners' that wait for messages to be added to the queue

		jmsListenerFactory.setConnectionFactory(activeMqConnectionFactory());

		return jmsListenerFactory;
	}
}
