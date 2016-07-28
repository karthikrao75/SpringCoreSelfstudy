package com.karthik.SpringDemo.SpringExample1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		
		//depricated in spring 4
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
		Triangle triangle=(Triangle)context.getBean("triangle");
		triangle.draw();
		
		
		Triangle triangle1=(Triangle)context.getBean("triangle1");
		triangle1.draw();
		
		
		Triangle triangle2=(Triangle)context.getBean("triangle2");
		triangle2.draw();
		
		Triangle triangle3=(Triangle)context.getBean("triangle3");
		triangle3.draw();
	}

}
