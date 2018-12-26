package org.spring.testing.services;
import org.springframework.stereotype.Service;
 
@Service("MyHobby")
public class MyHobby {
 
	private String name;
 
	public void setName(String name) {
		this.name = name;
	}
 
	public String sayHello() {
		return "Hello! " + name;
	}
}