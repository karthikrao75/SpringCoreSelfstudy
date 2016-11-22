package com.Info.karthik.IOC_InnerBean.bean;

public class Employee {
	public String name;
	public Address address;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
