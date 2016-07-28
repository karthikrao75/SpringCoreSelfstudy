package com.karthik.SpringDemo.SpringExample3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	
	//bean scopes 
	// 2 types : 
	//singleton scope --one bean per spring container. --default.
	//prototype--new bean for every request.
	//some other are :
	//web aware context bean scope:Request-new bean per request
	//session- per session
	//Global session- per http request.
//to implement scope write scope="prototype" in bean tag	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring3.xml");
		Triangle triangle=(Triangle)context.getBean("triangle");
		triangle.draw();
		/*
		 * 0,0 20,0 -20,0
		 */
	}

}
