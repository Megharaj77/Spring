package com.example.springboot12.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="products")
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String catagory;
	
	
	public Product() {
		super();
	}


	public Product(String name, String catagory) {
		super();
		this.name = name;
		this.catagory = catagory;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
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
