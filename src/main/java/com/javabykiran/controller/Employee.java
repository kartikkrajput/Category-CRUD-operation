package com.javabykiran.controller;


public class Employee {
	int emid;
	String emname;
	
	public Employee() {
		super();
	}

	public Employee(int emid, String emname) {
		super();
		this.emid = emid;
		this.emname = emname;
	}

	public int getEmid() {
		return emid;
	}

	public void setEmid(int emid) {
		this.emid = emid;
	}

	public String getEmname() {
		return emname;
	}

	public void setEmname(String emname) {
		this.emname = emname;
	}

	@Override
	public String toString() {
		return "Employee [emid=" + emid + ", emname=" + emname + "]";
	}
	

}
