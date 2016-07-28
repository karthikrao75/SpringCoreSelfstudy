package com.karthik.SpringDemo.SpringExample12;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class CClosedEventHandler implements ApplicationListener<ContextClosedEvent> {

	@Override
	public void onApplicationEvent(ContextClosedEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("context has been closed");
		System.out.println("RequestHandledEvent is used for web based Http request");
	}

}
