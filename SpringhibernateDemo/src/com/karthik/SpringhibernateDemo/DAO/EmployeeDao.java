package com.karthik.SpringhibernateDemo.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.karthik.SpringhibernateDemo.Entity.Employee;

@Transactional
public class EmployeeDao {
	
	SessionFactory sessionFactory;  
 
	public EmployeeDao() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeDao(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	//method to save employee  
	public void saveEmployee(Employee e){  
	    Session session=sessionFactory.getCurrentSession();
	    session.save(e);  
	}  
	//method to update employee  
	public void updateEmployee(Employee e){  
		sessionFactory.getCurrentSession().update(e);  
	}  
	//method to delete employee  
	public void deleteEmployee(Employee e){  
		sessionFactory.getCurrentSession().delete(e);  
	}  
	//method to return one employee of given id  
	public Employee getById(int id){  
	    Employee e=(Employee)sessionFactory.getCurrentSession().get(Employee.class,id);  
	    return e;  
	}  
	//method to return all employees  
	public List<Employee> getEmployees(){  
	    List<Employee> list=new ArrayList<Employee>();  
	  //  list=sessionFactory.getCurrentSession().loadAll(Employee.class);  
	    return list;  
	}  
}
