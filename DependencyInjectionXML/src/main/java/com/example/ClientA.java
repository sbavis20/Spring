package com.example;

public class ClientA implements Client {
	
	Service service;
	
	public ClientA(Service service) {
		this.service = service;
	}
	
	
	public void doSomething() {
		// TODO Auto-generated method stub
		String info = service.getInfo();
		System.out.println(info);
	}

	public void setService(Service service) {
		this.service = service;
	}
}
