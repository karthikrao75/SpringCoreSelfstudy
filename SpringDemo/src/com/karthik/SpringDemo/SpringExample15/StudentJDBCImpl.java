package com.karthik.SpringDemo.SpringExample15;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCImpl implements StudentDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	@Override
	public void setDataSource(DataSource source) {
		this.dataSource = source;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void createStudent(String name, int age) {
		String sql = "INSERT INTO STUDENT(name,age) VALUES (?,?)";
		jdbcTemplate.update(sql, name, age);
		System.out.println("Created Student: name=" + name + " Age=" + age);
	}

	@Override
	public Student getStudent(int id) {
		String sql = "SELECT * FROM Student where id=?";
		Student student = jdbcTemplate.queryForObject(sql, new Object[] { id }, new StudentRowMapper());
		return student;
	}

	@Override
	public List<Student> listStudent() {
		String sql = "SELECT * FROM Student";
		List<Student> students = jdbcTemplate.query(sql, new StudentRowMapper());
		return students;
	}

	@Override
	public void deleteStudent(int id) {
		String sql = "DELETE FROM Student where id=?";
		jdbcTemplate.update(sql, id);
		System.out.println("deleted student with Id:" + id);

	}

	@Override
	public void update(Integer id, Integer age) {
		String sql = "UPDATE student SET age=? where id=?";
		jdbcTemplate.update(sql,age,id);
		System.out.println("updated Student id="+id);

	}

	@Override
	public void createTable() {
		// TODO Auto-generated method stub
		String sql = "CREATE TABLE Student(ID INT NOT NULL AUTO_INCREMENT,NAME VARCHAR(20) NOT NULL,AGE INT NOT NULL,PRIMARY KEY(ID))";
		jdbcTemplate.execute(sql);
		System.out.println("table created");
	}

}
