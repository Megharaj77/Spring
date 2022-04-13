package com.example.springboot.exception;

public class ProductNotFoundException extends RuntimeException {

	private static final long serialVersionUID=1L;
	
	public ProductNotFoundException(long id) {
		super("The Product with "+id+" cannot found");
	}
}
