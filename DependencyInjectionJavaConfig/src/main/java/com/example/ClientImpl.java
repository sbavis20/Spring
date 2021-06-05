package com.example;

public class ClientImpl implements Client {
	
	private Service service;
	
	public ClientImpl(Service b) {
		this.service = b;
		
	}
	
	public void doSomething() {
		String info = service.getInfo();
		System.out.println(info);
	}
}
