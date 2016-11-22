package com.Info.karthik.IOC_InnerBean.Tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Info.karthik.IOC_InnerBean.bean.Address;
import com.Info.karthik.IOC_InnerBean.bean.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/spring.xml");
		Employee employee=(Employee)context.getBean("emp");
		Address add=employee.getAddress();
		System.out.println(add.getPincode());
	}

}
