package com.skillsoft.controller;

import javax.servlet.http.HttpServletRequest;




import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class MessageDisplayController implements Controller{
	
	public ModelAndView handleRequest(HttpServletRequest request,
		 HttpServletResponse response)throws Exception{
		
		return new ModelAndView("home");
	}
}