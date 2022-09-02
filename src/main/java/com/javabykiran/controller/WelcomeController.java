package com.javabykiran.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.javabykiran.studentservice.StudentServiceImpl;
import com.jbk.model.User;

@Controller
public class WelcomeController {
	
	@Autowired
	StudentServiceImpl studentServiceImpl;
	
	@RequestMapping("/login")
	public ModelAndView login(@ModelAttribute User user) {
	ModelAndView modelAndView = new ModelAndView();
	if(user.getUsername().equals("admin") && user.getPassword().equals("admin1")){
		modelAndView.setViewName("students");
		
		List<Student> students = studentServiceImpl.getStudentsService();	
		
		modelAndView.addObject("stulist", students);
		}else{
			modelAndView.setViewName("error");
		}
	return modelAndView;
	}
	
	@RequestMapping("/testjsp")
	public String welcome() {
		System.out.println("Inside testjsp");
	return "index.html";
	}
	
	@RequestMapping("/allstudents")
	public ModelAndView fecthStudents() {
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.setViewName("students");
	
	ArrayList<Student> list = new ArrayList<Student>();
	list.add(new Student(1, "Kartik", 23));
	list.add(new Student(3, "Soham", 23));
	list.add(new Student(2, "Shubham", 24));
	modelAndView.addObject("stulist", list);
	return modelAndView;
	}
	
}
