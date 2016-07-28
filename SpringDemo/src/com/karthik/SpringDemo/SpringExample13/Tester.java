package com.karthik.SpringDemo.SpringExample13;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
 public static void main(String [] args){
	 ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("spring10.xml");
	 CustomEventPublisher publisher=(CustomEventPublisher)context.getBean("customPublisher");
	 publisher.publish();
 }
}
