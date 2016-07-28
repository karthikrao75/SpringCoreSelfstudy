package com.karthik.SpringHibernateExample.DAO;

import java.util.List;

import com.karthik.SpringHibernateExample.Entity.Person;

public interface PersonDAO {
	public void save(Person p);

	public List<Person> list();
}
