package com.training.jpademo.entity;


import javax.persistence.*;
@Entity
@Table(name="Employee1")
public class Employee {

@Column(name="id")
@Id
@GeneratedValue
private Long id;

@Column(name="name")
private String name;

@Column(name="email")
private String email;

public Employee() {
	super();
}

public Employee(String name, String email) {
	super();
	this.name = name;
	this.email = email;
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

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}


}
