package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appCon = 
				new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		Client client = (Client) appCon.getBean("client1");
		client.doSomething();
	}

}
