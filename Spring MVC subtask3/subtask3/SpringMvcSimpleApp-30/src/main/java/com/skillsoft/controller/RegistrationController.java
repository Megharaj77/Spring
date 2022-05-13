package com.skillsoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/details")
@Controller
public class RegistrationController {

	@RequestMapping("/registration")
	public String registartionForm(Model model) {
		
		Registration registration=new Registration();
		model.addAttribute("registration",registration);
		
		return "registration-page";
	}
	
	@RequestMapping("/submission")
	public String submitForm(@ModelAttribute("registration")
	                          Registration registration) {
		
		return "confirmation-page";
	}
}
