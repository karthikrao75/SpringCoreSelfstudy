package com.karthik.SpringDemo.SpringExample10;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {
// dependency injection explanation.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.register(DetailsConfig.class);
		context.refresh();
		User user=context.getBean(User.class);
		
/*		Inside Address contructor
		Inside User constructor*/

	}

}
