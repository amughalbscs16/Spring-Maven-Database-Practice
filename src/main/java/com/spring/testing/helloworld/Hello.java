package com.spring.testing.helloworld;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.spring.testing.services.HelloWorldService;
import org.spring.testing.services.MyHobby;
/*
 * By Ali Hassaan Mughal
 * */ 

public class Hello {
 
	@SuppressWarnings("resource")
	public static void main(String[] args) {
 
		
		// loading the definitions from the given XML file
		//Getting the Application Context.
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		//Cast the bean into the class object
		HelloWorldService service = (HelloWorldService) context
				.getBean("helloWorldService");
		//Cast The the bean with id MyHobby into an object of MyHobby Class
		MyHobby hobby = (MyHobby) context
				.getBean("MyHobby");
		String message = service.sayHello();
		
		System.out.println(message);
		
		//set a new name
		service.setName("Spring");
		message = service.sayHello();
		System.out.println(message);
		System.out.println(hobby.sayHello());
	}
}