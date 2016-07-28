package com.karthik.SpringDemo.SpringExample13;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {

	public CustomEvent(Object source) {
		super(source);
	}
	
	public String toString(){
		return "My custom publisher";
	}

}
