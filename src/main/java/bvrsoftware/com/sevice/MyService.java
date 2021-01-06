package bvrsoftware.com.sevice;

import java.util.List;

import bvrsoftware.com.model.Student;

public interface MyService {

	public void InserOrUpdate(Student s);
	public Student getById(int id);
	public Student DeleteById(int id);
	public List<Student> getAllstudent();	
}
