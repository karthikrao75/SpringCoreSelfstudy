package com.karthik.SpringhibernateDemo.Tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.karthik.SpringhibernateDemo.DAO.EmployeeDao;
import com.karthik.SpringhibernateDemo.Entity.Employee;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDao dao = (EmployeeDao) context.getBean("d");
		Employee e = new Employee();
		e.setId(114);
		e.setName("varun");
		e.setSalary(50000);
		dao.saveEmployee(e);
	}
}