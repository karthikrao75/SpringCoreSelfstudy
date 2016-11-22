package com.Info.karthik.IOC_InnerBean.bean;

public class Address {
private String AddLine1;
private String AddLine2;
private int pincode;


public Address() {
	super();
	// TODO Auto-generated constructor stub
}

public Address(String addLine1, String addLine2, int pincode) {
	super();
	AddLine1 = addLine1;
	AddLine2 = addLine2;
	this.pincode = pincode;
}

public String getAddLine1() {
	return AddLine1;
}
public void setAddLine1(String addLine1) {
	AddLine1 = addLine1;
}
public String getAddLine2() {
	return AddLine2;
}
public void setAddLine2(String addLine2) {
	AddLine2 = addLine2;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}


}
