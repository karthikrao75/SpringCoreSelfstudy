package com.karthik.SpringDemo.SpringExample2;

public class Triangle {
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
}
