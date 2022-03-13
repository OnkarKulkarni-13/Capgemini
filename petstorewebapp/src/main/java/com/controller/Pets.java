package com.controller;

public class Pets {
    private String petname;
    private int petage;
    private String type;
    
	public Pets() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pets(String petname, int petage, String type) {
		super();
		this.petname = petname;
		this.petage = petage;
		this.type = type;
	}

	public String getPetname() {
		return petname;
	}

	public void setPetname(String petname) {
		this.petname = petname;
	}

	public int getPetage() {
		return petage;
	}

	public void setPetage(int petage) {
		this.petage = petage;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public static void main(String[] args) {
		
	}
	

	

}
