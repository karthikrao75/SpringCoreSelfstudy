package com.Info.karthik.IOC_PrivateConstructor.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Client {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		// ApplicationContext factory=new
		// ClassPathXmlApplicationContext("resources/spring.xml");
		// this how IOC works for private and parameterized constructors
		try {
			Class cs = Class.forName("com.Info.karthik.IOC_PrivateConstructor.bean.Test");
			Constructor[] con = cs.getDeclaredConstructors();
			con[0].setAccessible(true);
			con[0].newInstance();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

}
