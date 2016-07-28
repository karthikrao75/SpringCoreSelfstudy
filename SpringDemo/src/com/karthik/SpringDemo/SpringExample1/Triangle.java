package com.karthik.SpringDemo.SpringExample1;

public class Triangle {

	private String type;
	private int height;
	
	
	
	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Triangle(String type) {

		this.type = type;
	}

	public Triangle(int height) {
		super();
		this.height = height;
	}


	public Triangle(String type, int height) {
		super();
		this.type = type;
		this.height = height;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}

	
	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public void draw(){
		System.out.println("type of triangle: "+ this.getType()+", with height "+this.getHeight());
	}
}
