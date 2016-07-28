package com.karthik.SpringDemo.SpringExample14;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("spring11.xml");
		
		Student student = (Student) context.getBean("student");

	      student.getName();
	      student.getAge();
	      
	      student.printThrowException();
	      
	      /*
	      Going to setup student profile.
	      Student profile has been setup.
	      Returning:Zara
	      Going to setup student profile.
	      Student profile has been setup.
	      Returning:11
	      Going to setup student profile.
	      Exception:
	      Student profile has been setup.
	      There has been an exception: java.lang.IllegalArgumentException .......*/
	 
	}

}
