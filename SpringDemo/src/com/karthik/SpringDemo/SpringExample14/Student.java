package com.karthik.SpringDemo.SpringExample14;

public class Student {
private String name;
private String age;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(String name, String age) {
	super();
	this.name = name;
	this.age = age;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public void printThrowException(){
	System.out.println("Exception:");
	throw new IllegalArgumentException();
}
}
