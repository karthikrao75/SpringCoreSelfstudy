package com.karthik.SpringDemo.SpringExample10;

public class Address {
public String city;

public Address() {
	super();

	System.out.println("Inside Address contructor");
	// TODO Auto-generated constructor stub
}

public Address(String city) {
	super();
	this.city = city;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

}
