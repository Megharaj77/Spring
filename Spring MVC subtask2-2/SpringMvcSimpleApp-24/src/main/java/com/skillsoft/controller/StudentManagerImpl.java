package com.skillsoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentManagerImpl implements StudentManager {

	@Autowired
	StudentDAO studentDAO;
	
	@Override
	public List<Student> getStudents() {
		
		return studentDAO.getStudents();
	}

}
