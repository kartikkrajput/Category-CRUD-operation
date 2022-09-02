package com.javabykiran.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class SpringbexApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbexApplication.class, args);
		System.out.println("App started");
	}
	
//	@Bean("First entry")
//	Employee getEmployee(){
//		Employee employee = new Employee(22,"sk");
//		return employee;
//	}
//	@Bean("Second entry")
//	Employee getEmployee2(){
//		Employee employee = new Employee(3,"mp");
//		return employee;
//	}

}