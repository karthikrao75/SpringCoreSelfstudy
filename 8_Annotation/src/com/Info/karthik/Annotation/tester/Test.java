package com.Info.karthik.Annotation.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Info.karthik.Annotation.cab.Car;

public class Test {

	public static void main(String []args){
		ApplicationContext context=new ClassPathXmlApplicationContext("resources/spring.xml");
		Car car=context.getBean(Car.class);
		System.out.println(car.getEngine().getModelNumber());
	}
}
