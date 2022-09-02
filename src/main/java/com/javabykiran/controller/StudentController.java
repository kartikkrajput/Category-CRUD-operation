package com.javabykiran.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javabykiran.dao.StudentDaoImpl;
import com.javabykiran.studentservice.StudentService;
import com.javabykiran.studentservice.StudentServiceImpl;

@RestController
public class StudentController {
	
//	@Autowired
//	SessionFactory sessionFactory;
//	
	@Autowired
	StudentServiceImpl studentServiceImpl;
	
//	@Qualifier("Second entry")
//	
//	@Autowired
//	Employee employee;
//	
	@Value("${jbk.valueEx}")
	int value;
	
//	@GetMapping("/showEmployee")
//	Employee getEmployee(){
//		System.out.println("The value is:"+value);
//			return employee;
//	}
	
	@GetMapping("/getstudent/{id}")
	Student getStudent(@PathVariable int id ){
		return studentServiceImpl.getStudentService(id);
	}
	
	@GetMapping("/getstudents")
	List<Student> getStudents(){
		return studentServiceImpl.getStudentsService();	
	}
	
	@PostMapping("/addstudent")
	String addstudent(@RequestBody Student student){
		return studentServiceImpl.addStudentservice(student);
	}
	
	@DeleteMapping("/deleteStudent/{emid}")
	String deleteStudent(@PathVariable int emid){
		return studentServiceImpl.deleteStudentservice(emid);
	}
	
	@PutMapping("/updateStudent/{emid}")
	String updateStudent(@PathVariable int emid,@RequestBody Student student){
		return studentServiceImpl.updateStudentservice(emid, student);
	}
	
//	@GetMapping("/getStudent")	
//	Student getStudent(){
//		Session session = sessionfactory.openSession();
//		Student student = session.get(Student.class, 333);
//		return student;
//	}
	
//	@PostMapping("/addStudent")	
//	String addStudent(){
//		Session session = sessionFactory.openSession();
//		Student student = new Student (1,"AR",18);
//		session.save(student);
//		session.beginTransaction().commit();
//		return "Student added";
//	
//	}		

}
