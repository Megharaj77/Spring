package com.examle.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.examle.demo.service.QuoteService;
import com.examle.demo.ws.obj.Quote;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	QuoteService quoteService;
	
	@BeforeEach
	public void before() {
		this.quoteService=new QuoteService();
	}
	
	@Test
	public void GetQuote() {
		this.quoteService.addQuote(new Quote("ABC","D"));
	}
	
	@Test
	public void testGetQuoteMultiple() {
		this.quoteService.addQuote(new Quote("ABC","D"));
		this.quoteService.addQuote(new Quote("EFG","H"));
		assertTrue(
				"ABC".equals(this.quoteService.getQuote().getValue())||
				"EFG".equals(this.quoteService.getQuote().getValue()));
	}
//	@Test
//public void contextLoads() {
//}
}
