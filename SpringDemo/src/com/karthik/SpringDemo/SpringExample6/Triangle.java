package com.karthik.SpringDemo.SpringExample6;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle 
//implements InitializingBean, DisposableBean
{
	private Point pointA;
	private Point pointB;
	private Point pointC;

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
		System.out.println("point A:(x,y)(" + this.getPointA().getX() + "," + this.getPointA().getY() + ")");

		System.out.println("point B:(x,y)(" + this.getPointB().getX() + "," + this.getPointB().getY() + ")");

		System.out.println("point C:(x,y)(" + this.getPointC().getX() + "," + this.getPointC().getY() + ")");
	}
	


	/*@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("intializing triangle bean");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("destroying triangular bean");
	}*/
	
	public void myInit(){
		System.out.println("intializing triangle bean");
	}
	
	public void myDestroy(){
		System.out.println("destroying triangle bean");
	}
}
