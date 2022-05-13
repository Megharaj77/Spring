package com.skillsoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {

	@Autowired
	StudentManager studentManager;
	
	@RequestMapping(value="/university/students/",method=RequestMethod.GET)
	public String getStudents(Model model) {
		
		model.addAttribute("students",studentManager.getStudents());
		
		return "students_view";
		
	}
}
