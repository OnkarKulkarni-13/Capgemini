package com.student.Studentinfo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Boy {
	@Value("onkar kulkarni")
	private String name;
	@Value("BE18F04F050")
	private String rollNo;
	@Value("A-3")
	private String batchId;
	
	
	public Boy() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Boy(String name, String rollNo, String batchId) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.batchId = batchId;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getBatchId() {
		return batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

}
