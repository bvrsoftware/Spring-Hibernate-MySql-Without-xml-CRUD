package bvrsoftware.com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bvrsoftware.com.model.Student;

@Repository
@Transactional
public class MyDao implements MyDaoIn  {

	@Autowired
	private SessionFactory sessionfactory;

	@Override
	@Transactional
	public void InserOrUpdate(Student s) {
		// TODO Auto-generated method stub
		Session s1=sessionfactory.getCurrentSession();
		s1.saveOrUpdate(s);
	}

	@Override
	@Transactional
	public Student getById(int id) {
		// TODO Auto-generated method stub
		Session s=sessionfactory.getCurrentSession();
		Student st=s.get(Student.class, new Integer(id));
		return st;
	}

	@Override
	@Transactional
	public List<Student> getAllstudent() {
		// TODO Auto-generated method stub
		Session s=sessionfactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Student> list=s.createQuery("from Student").getResultList();
		return list;
	}

	@Override
	public Student DeleteById(int id) {
		// TODO Auto-generated method stub
		Session s=sessionfactory.getCurrentSession();
		Student st=s.get(Student.class, new Integer(id));
		s.delete(st);
		return st;
	}
}
