package com.Info.karthik.arrayDefaultColectionDI.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Info.karthik.arrayDefaultCollectionDI.beans.Details;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("resources/spring.xml");
		Details details=(Details)context.getBean("details");
		System.out.println(details.getNames());
		System.out.println(details.getAddress());
		System.out.println(details.getFruits());
		System.out.println(details.getCricketers());
		System.out.println(details.getCountries());
	}

}
