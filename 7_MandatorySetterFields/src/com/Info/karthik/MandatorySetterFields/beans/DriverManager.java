package com.Info.karthik.MandatorySetterFields.beans;

import org.springframework.beans.factory.annotation.Required;

public class DriverManager {

	
	private String driverClass;
	private String url;
	
	private String username;
	private String password;
	public DriverManager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DriverManager(String driverClass, String url, String username, String password) {
		super();
		this.driverClass = driverClass;
		this.url = url;
		this.username = username;
		this.password = password;
	}
	public String getDriverClass() {
		return driverClass;
	}
	@Required
	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}
	public String getUrl() {
		return url;
	}
	@Required
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
