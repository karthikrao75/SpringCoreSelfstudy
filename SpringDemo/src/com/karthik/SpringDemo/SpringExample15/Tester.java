package com.karthik.SpringDemo.SpringExample15;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	public static void main(String []args){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring12.xml");
		StudentJDBCImpl impl = (StudentJDBCImpl) context.getBean("StudentJDBCImpl");
		//impl.createTable();
		//impl.createStudent("karthik", 24);
		//impl.createStudent("srikanth", 22);
		//impl.createStudent("babishan", 23);
		
		List<Student> student=impl.listStudent();
		System.out.println(student);
		
		System.out.println(impl.getStudent(1));
		
		impl.update(3, 21);
		
		impl.deleteStudent(3);
	}
	

}
