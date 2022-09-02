package com.javabykiran.dao;

import java.util.List;

import com.javabykiran.controller.Student;

public interface StudentDaoImpl {
	Student getstudentDao(int id);
	List<Student> getStudentDao();
	String addStudentDao(Student student);
	String deleteStudentDao(int emid);
	String updateStudentDao(int emid, Student student);

}
