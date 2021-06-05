package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionJavaConfigExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Client client1 = (Client) appContext.getBean("client1");
        client1.doSomething();
         
        Client client2 = (Client) appContext.getBean("client2");
        client2.doSomething();
         
        Service service = (Service) appContext.getBean("srv");
        System.out.println(service.getInfo());
	}
	
}
