package com.javabykiran.dao;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javabykiran.controller.Student;

@Repository
public class StudentDao implements StudentDaoImpl {
	
	@Autowired
	SessionFactory sessionFactory;
	
		public Student getstudentDao(int id){
			Session session = sessionFactory.openSession();
			Student student = session.get(Student.class, id);
			return student;
					

	}
		public List<Student> getStudentDao(){
			Session session = sessionFactory.openSession();
			Criteria criteria = session.createCriteria(Student.class);
			List<Student>students = criteria.list();
			return students;
		}
		
		public String addStudentDao(Student student){
			Session session = sessionFactory.openSession();
			
			session.save(student);
			session.beginTransaction().commit();
			return "Student added";
		}
		
		public String deleteStudentDao(int emid){
			Session session = sessionFactory.openSession();
			Student student = session.get(Student.class,emid);
			
			if(student == null){
				return "Student not found";
			}	
			session.delete(student);
			session.beginTransaction().commit();
			return "Student deleted";
			
		}
		
		public String updateStudentDao(int emid, Student student){
			Session session = sessionFactory.openSession();
			Student student1 = session.get(Student.class,emid);
			
			if(student1 == null){
				return "Student not found";
			}
			student1.setEmname(student.getEmname());
			student1.setEmage(student.getEmage());
			
			session.update(student1);
			session.beginTransaction().commit();
			return "Student updated";
			
		}
			
		
	     
}
