package com.karthik.SpringDemo.SpringExample12;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {

		// to use ApplicationListner and ContextEvent use
		// ConfigurableApplicationContext interface
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring9.xml");
		//context.start(); //start() will call refresh and then start event 
		//context.refresh();//refresh() will only call refresh event
		HelloWorld helloWorld = (HelloWorld) context.getBean("hello");
		System.out.println(helloWorld.getMessage());
		//context.stop();
		context.close();

	}
}
