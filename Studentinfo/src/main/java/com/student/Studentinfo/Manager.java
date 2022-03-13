package com.student.Studentinfo;

import java.util.List;

public class Manager {
	private String name;
	private List<String> department;
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Manager(String name, List<String> department) {
		super();
		this.name = name;
		this.department = department;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getDepartment() {
		return department;
	}
	public void setDepartment(List<String> department) {
		this.department = department;
	}
	
	

}
