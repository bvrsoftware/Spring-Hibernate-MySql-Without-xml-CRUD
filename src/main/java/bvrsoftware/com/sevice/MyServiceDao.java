package bvrsoftware.com.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bvrsoftware.com.dao.MyDaoIn;
import bvrsoftware.com.model.Student;

@Service
public class MyServiceDao implements MyService{

	@Autowired
	private MyDaoIn dao;

	public void InserOrUpdate(Student s) {
		// TODO Auto-generated method stub
		dao.InserOrUpdate(s);
	}

	public Student getById(int id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	public List<Student> getAllstudent() {
		// TODO Auto-generated method stub
		return dao.getAllstudent();
	}

	@Override
	public Student DeleteById(int id) {
		// TODO Auto-generated method stub
		return dao.DeleteById(id);
	}
}
