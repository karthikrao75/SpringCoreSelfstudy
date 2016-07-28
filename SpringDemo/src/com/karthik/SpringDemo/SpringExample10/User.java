package com.karthik.SpringDemo.SpringExample10;

public class User {
public Address userAddress;

public User() {
	super();
	// TODO Auto-generated constructor stub
}

public User(Address userAddress) {
	super();
	System.out.println("Inside User constructor");
	this.userAddress = userAddress;
}

public Address getUserAddress() {
	return userAddress;
}

public void setUserAddress(Address userAddress) {
	this.userAddress = userAddress;
}


}
