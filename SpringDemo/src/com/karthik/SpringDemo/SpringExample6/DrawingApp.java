package com.karthik.SpringDemo.SpringExample6;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// will close context when program ends (destroy) 
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring6.xml");
		//this line 
		context.registerShutdownHook();
/*		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();*//*
		intializing triangle bean
		point A:(x,y)(0,0)
		point B:(x,y)(20,0)
		point C:(x,y)(-20,0)
		destroying triangle bean*/
	Triangle triangle1 = (Triangle) context.getBean("triangle1");
		triangle1.draw();/*
		intializing triangle bean
		point A:(x,y)(0,0)
		point B:(x,y)(20,0)
		point C:(x,y)(-20,0)
		destroying triangle bean*/
	}

}
