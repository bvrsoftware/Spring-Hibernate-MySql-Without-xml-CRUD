package bvrsoftware.com.dao;

import java.util.List;

import bvrsoftware.com.model.Student;

public interface MyDaoIn {

	public void InserOrUpdate(Student s);
	public Student getById(int id);
	public Student DeleteById(int id);
	public List<Student> getAllstudent();	
}
