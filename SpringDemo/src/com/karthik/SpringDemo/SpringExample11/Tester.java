package com.karthik.SpringDemo.SpringExample11;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.register(SecondConfig.class);
		context.refresh();
		A a=context.getBean(A.class);
		B b=context.getBean(B.class);
		
		//inside B constructor
		//Inside A constructor
	}

}
