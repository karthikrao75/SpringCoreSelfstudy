package com.karthik.SpringDemo.SpringExample4;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware {
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context = null;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {

		this.setPointA((Point) context.getBean("pointA"));
		this.setPointB((Point) context.getBean("pointB"));
		this.setPointC((Point) context.getBean("pointC"));
		System.out.println("point A:(x,y)(" + this.getPointA().getX() + "," + this.getPointA().getY() + ")");

		System.out.println("point B:(x,y)(" + this.getPointB().getX() + "," + this.getPointB().getY() + ")");

		System.out.println("point C:(x,y)(" + this.getPointC().getX() + "," + this.getPointC().getY() + ")");
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {

		this.context = context;

	}

	@Override
	public void setBeanName(String name) {
		System.out.println("bean name: "+name);
	}
}
