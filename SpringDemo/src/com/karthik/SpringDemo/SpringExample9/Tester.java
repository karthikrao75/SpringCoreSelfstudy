package com.karthik.SpringDemo.SpringExample9;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// AnnotationConfigApplicationContext context=new
		// AnnotationConfigApplicationContext(HelloConfig.class);

		// above context can be used if only one config class is there if not

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		//below method takes variable args 
		context.register(HelloConfig.class, WelcomeConfig.class);
		context.refresh();
		HelloWorld world=context.getBean(HelloWorld.class);		
		world.setMessage("Hi world");
		
		Welcome welcome=context.getBean(Welcome.class);
		welcome.setMessage("welcome to spring");
		
		System.out.println(world.getMessage());
		System.out.println(welcome.getMessage());
	}

}
