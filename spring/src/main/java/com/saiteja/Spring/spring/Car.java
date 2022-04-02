package com.saiteja.Spring.spring;

import org.springframework.stereotype.Component;

@Component
public class Car implements vehicle{
	
	
	public void drive() {
		System.out.println("chal raha hai");
	}
}