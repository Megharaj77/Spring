package com.springboot.model;

public class Product {
 
	private String id;
	private String name;
	private String catagory;
	
	
	public Product() {
		super();
	}


	public Product(String id, String name, String catagory) {
		super();
		this.id = id;
		this.name = name;
		this.catagory = catagory;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCatagory() {
		return catagory;
	}


	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	 
	
	
}
