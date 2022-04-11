package com.examle.demo.service;

import java.util.List;
import java.util.Random;

import com.examle.demo.ws.obj.Quote;
import java.util.ArrayList;

public class QuoteService {

	 List<Quote>quotes=new ArrayList<Quote>();
	
	public QuoteService() {
		this.quotes.add(new Quote("You know you're in love when you can't fall asleep because reality is","jhhg"));
		this.quotes.add(new Quote("Get busy living or get busy kdying.","Stephen King"));
		this.quotes.add(new Quote("The first step toward sucess is taken when you refuse to be a captain","shdj"));
 	    this.quotes.add(new Quote("When one door of happiness closes,another opens;but often we loo","kshds"));
		this.quotes.add(new Quote("Twenty years from now you will be more dissappointed by the things","kdhkshd"));
		this.quotes.add(new Quote("Those who dare to fail miserably can achieve greatly.","Jhon f.kenr"));
		System.out.println(quotes);
		
	}
	public Quote getQuote() {
		Random rn=new Random();
		int select=rn.nextInt(this.quotes.size());
		return this.quotes.get(select);
		
	}
//	
	public void addQuote(Quote quote) {
		this.quotes.add(quote);
	}
}
