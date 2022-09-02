package com.javabykiran.studentservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabykiran.controller.Student;
import com.javabykiran.dao.StudentDao;
import com.javabykiran.dao.StudentDaoImpl;

@Service
public class StudentService implements StudentServiceImpl {
	
//	@Autowired
//	StudentDao studentDao;
	
	@Autowired
	StudentDaoImpl studentDaoImpl;
	
	public Student getStudentService(int id){
		return studentDaoImpl.getstudentDao(id);
	}		
	public List<Student> getStudentsService(){
		return studentDaoImpl.getStudentDao();
	}
	public String addStudentservice(Student student){
		return studentDaoImpl.addStudentDao(student);
	}
	public String deleteStudentservice(int emid){
		return studentDaoImpl.deleteStudentDao(emid);
	}
	public String updateStudentservice(int emid, Student student){
		return studentDaoImpl.updateStudentDao(emid, student);
	}

}
