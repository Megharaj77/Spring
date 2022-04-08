package com.training.jpademo.entity;


import javax.persistence.*;



import java.util.Date;

@Entity
@Table(name="Employee1")
public class Employee {

@Column(name="id")
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;


private String name;

@Column(unique=true)
private String email;

private int level;

private Date birthDate;

public Employee() {
	super();
}

public Employee(String name, String email, int level, Date birthDSate) {
	super();
	this.name = name;
	this.email = email;
	this.level = level;
	this.birthDate = birthDate;
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

public int getLevel() {
	return level;
}

public void setLevel(int level) {
	this.level = level;
}

public Date getBirthdate() {
	return birthDate;
}

public void setBirthdate(Date birthDate) {
	this.birthDate = birthDate;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", level=" + level + ", birthDate="
			+ birthDate + "]";
}



}
