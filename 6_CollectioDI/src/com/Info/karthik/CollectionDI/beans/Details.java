package com.Info.karthik.CollectionDI.beans;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;

public class Details {
private Vector<String> fruits;
private HashSet<String> cricketers;
private TreeMap<String, String> countries;
public Details() {
	super();
	// TODO Auto-generated constructor stub
}
public Details(Vector<String> fruits, HashSet<String> cricketers, TreeMap<String, String> countries) {
	super();
	this.fruits = fruits;
	this.cricketers = cricketers;
	this.countries = countries;
}
public Vector<String> getFruits() {
	return fruits;
}
public void setFruits(Vector<String> fruits) {
	this.fruits = fruits;
}
public HashSet<String> getCricketers() {
	return cricketers;
}
public void setCricketers(HashSet<String> cricketers) {
	this.cricketers = cricketers;
}
public TreeMap<String, String> getCountries() {
	return countries;
}
public void setCountries(TreeMap<String, String> countries) {
	this.countries = countries;
}


}
