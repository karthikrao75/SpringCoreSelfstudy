package com.karthik.SpringDemo.SpringExample15;

import javax.sql.DataSource;
import java.util.List;

public interface StudentDAO {
	
	public void setDataSource(DataSource source);
	public void createTable();
	public void createStudent(String name,int age);
	
	public Student getStudent(int id);
	public List<Student> listStudent();
	public void deleteStudent(int id);
	public void update(Integer id,Integer age);

}
