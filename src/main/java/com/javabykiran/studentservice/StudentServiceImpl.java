package com.javabykiran.studentservice;

import java.util.List;

import com.javabykiran.controller.Student;

public interface StudentServiceImpl {
	Student getStudentService(int id);
	List<Student> getStudentsService();
	String addStudentservice(Student student);
	String deleteStudentservice(int emid);
	String updateStudentservice(int emid, Student student);

}
