package com.saiteja.Spring.spring;

import org.springframework.stereotype.Component;

@Component
public class Bike implements vehicle{
	
	public void drive() {
		System.out.println("bhag raha hai");
	}
}
