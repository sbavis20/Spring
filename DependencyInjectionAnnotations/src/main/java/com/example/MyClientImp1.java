package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("client1")
public class MyClientImp1 implements MyClient {

	@Autowired
	private MyService service;
	
	
	public void doSomething() {
		String info = service.getInfo();
		System.out.println(info);
	}

}
