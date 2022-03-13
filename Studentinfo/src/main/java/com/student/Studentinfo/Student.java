package com.student.Studentinfo;

import java.util.List;
import java.util.Set;

public class Student {
	private String name;
	private int rollNo;
	private List<Integer> phoneNos;
	private Set<String> courses;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int rollNo, List<Integer> phoneNos, Set<String> courses) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.phoneNos = phoneNos;
		this.courses = courses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public List<Integer> getPhoneNos() {
		return phoneNos;
	}

	public void setPhoneNos(List<Integer> phoneNos) {
		this.phoneNos = phoneNos;
	}

	public Set<String> getCourses() {
		return courses;
	}

	public void setCourses(Set<String> courses) {
		this.courses = courses;
	}
	
	
	

}
