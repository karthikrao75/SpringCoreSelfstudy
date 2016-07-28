package com.karthik.SpringDemo.SpringExample16;

import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	static Logger log = Logger.getLogger(MainClass.class.getName());

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring13.xml");
		log.info("loading HelloWorld Bean");
		Helloworld helloworld = (Helloworld) context.getBean("helloWorld");
		helloworld.getMessage();
		log.info("Exiting Application");
		context.close();

	}

}
