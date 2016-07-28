package com.karthik.SpringDemo.SpringExample13;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomEventPublisher implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher publisher;
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		// TODO Auto-generated method stub
		this.publisher=publisher;
	}

	public void publish(){
		CustomEvent event=new CustomEvent(publisher);
		publisher.publishEvent(event);
	}
}
