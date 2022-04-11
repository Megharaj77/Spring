package com.examle.demo.ws.endpoints.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.examle.demo.service.QuoteService;
import com.examle.demo.ws.obj.Quote;

@RestController
public class DemoEndPoint {

//	@RequestMapping("/")
//	public String hello() {
//		return "Hello world";
//	}
//	
//	@RequestMapping("other")
//	public String other() {
//		return "other is working";
//	}
	
//	private RestTemplate template;
//	 public DemoEndPoint(RestTemplate template) {
//		 this.template=template;
//		 
//	 }
//	 @RequestMapping("/template")
//	 public String hello() {
//		 String message=this.template.getForObject("http://localhost:8090", String.class);
//		 return message;
//	 }
	
	private QuoteService quoteService;
	
	public DemoEndPoint(QuoteService quoteService) {
		this.quoteService=quoteService;
	}
	
	@RequestMapping(value="/quote")
	public Quote getQuote() {
		return this.quoteService.getQuote();
	}
}

