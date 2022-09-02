package com.javabykiran.controller;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	int emid;
	String emname;
	int emage;
	
	public Student() {
		super();
	}


	public Student(int emid, String emname, int emage) {
		super();
		this.emid = emid;
		this.emname = emname;
		this.emage = emage;
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


	public int getEmage() {
		return emage;
	}


	public void setEmage(int emage) {
		this.emage = emage;
	}


	@Override
	public String toString() {
		return "Student [emid=" + emid + ", emname=" + emname + ", emage=" + emage + "]";
	}
	
	

}
