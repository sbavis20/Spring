package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionAnnotationsExample {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext appCon = new AnnotationConfigApplicationContext();
		
		appCon.scan("com.example");
		
		appCon.refresh();
		
		MyClient client = (MyClient) appCon.getBean("client1");
		client.doSomething();

	}

}
