package com.training.jpademo.entity;

import javax.persistence.*;
@Entity
@Table(name="Employee")
public class Employee {

@Column(name="id")
@Id
@GeneratedValue
private Long id;

@Column(name="name")
private String name;

@Column(name="level")
private int level;

public Employee(String name,int level) {
	this.name=name;
	this.level=level;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id=id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name=name;
}
public int getLevel() {
	return level;
}
public void setLevel(int level) {
	this.level=level;
}
@Override
public String toString() {
	return "Employee{"+"id="+id+",name='"+'\''+",level="+level+'}';
}
}
