package com.karthik.SpringDemo.SpringExample8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring8.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
/*		My bean factory post processor is called:
   		point A:(x,y)(0,0)
		point B:(x,y)(20,0)
		point C:(x,y)(-20,0)*/


	}

}
