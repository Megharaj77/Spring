package com.examle.demo.ws.endpoints.rest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.examle.demo.service.QuoteService;
import com.examle.demo.ws.obj.Quote;

@RestController
public class DemoEndPoint {

	private QuoteService quoteService;
	public DemoEndPoint(QuoteService quoteService) {
		this.quoteService=quoteService;
	}
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello worldQ!";
	}
	
	@RequestMapping("/quote")
	public Quote getQuote() {
		return this.quoteService.getQuote();
	}
	
	@RequestMapping(value="/quote",method=RequestMethod.POST)
	public void addQuote(@RequestBody Quote quote) {
		this.quoteService.addQuote(quote);
		
	}
}
