package com.skillsoft.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Override
	public List<Student> getStudents() {
		
		List<Student> studentList=new ArrayList<>();
		
		studentList.add(new Student("Greg","Johnson","Computer Science"));
		studentList.add(new Student("Alice","Kruger","Philosophy"));
		studentList.add(new Student("Peter","Smith","Math"));
		studentList.add(new Student("Claudia","Mallace","Chemistry"));
		studentList.add(new Student("Sinead","O'Connor","Operations"));
		
		return studentList;
	}

}
