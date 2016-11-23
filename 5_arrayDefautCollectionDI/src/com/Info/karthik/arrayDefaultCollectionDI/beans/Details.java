package com.Info.karthik.arrayDefaultCollectionDI.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Details {
private String [] names;
private Address [] address;
private List<String> fruits;
private Set<String> cricketers;
private Map<String, String> countries;
public Details() {
	super();
	// TODO Auto-generated constructor stub
}
public Details(String[] names, Address[] address, List<String> fruits, Set<String> cricketers,
		Map<String, String> countries) {
	super();
	this.names = names;
	this.address = address;
	this.fruits = fruits;
	this.cricketers = cricketers;
	this.countries = countries;
}
public String[] getNames() {
	return names;
}
public void setNames(String[] names) {
	this.names = names;
}
public Address[] getAddress() {
	return address;
}
public void setAddress(Address[] address) {
	this.address = address;
}
public List<String> getFruits() {
	return fruits;
}
public void setFruits(List<String> fruits) {
	this.fruits = fruits;
}
public Set<String> getCricketers() {
	return cricketers;
}
public void setCricketers(Set<String> cricketers) {
	this.cricketers = cricketers;
}
public Map<String, String> getCountries() {
	return countries;
}
public void setCountries(Map<String, String> countries) {
	this.countries = countries;
}


}
