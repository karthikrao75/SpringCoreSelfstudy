package com.Info.karthik.MandatorySetterFields.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("resources/spring.xml");
		context.getBean("driverManager");
	}

}
