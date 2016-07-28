package com.karthik.SpringDemo.SpringExample2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		/*
		 * point A:(x,y)(0,0) point B:(x,y)(20,0) point C:(x,y)(-20,0)
		 */

		// inner bean example, no per performance improvement
		Triangle triangle1 = (Triangle) context.getBean("triangle1");
		triangle1.draw();
		/*
		 * point A:(x,y)(0,0) point B:(x,y)(20,0) point C:(x,y)(-20,0)
		 */

		// alias tag example
		Triangle triangle2 = (Triangle) context.getBean("alias-triangle");
		triangle2.draw();
		/*
		 * point A:(x,y)(0,0) point B:(x,y)(20,0) point C:(x,y)(-20,0)
		 */

		Triangle triangle3 = (Triangle) context.getBean("triangle3");
		triangle3.draw();
		/*
		 * point A:(x,y)(0,0) point B:(x,y)(20,0) point C:(x,y)(-20,0)
		 */
	}

}
