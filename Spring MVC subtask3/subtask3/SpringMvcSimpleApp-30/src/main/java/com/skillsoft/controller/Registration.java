package com.skillsoft.controller;

public class Registration {

	private String firstName;
	private String lastName;
	private String gender;
	private String department;
	private String[] food;
	
	
	public Registration() {
		super();
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String[] getFood() {
		return food;
	}


	public void setFood(String[] food) {
		this.food = food;
	}
	
	
}
