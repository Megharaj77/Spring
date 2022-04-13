package com.example.springboot13.exception;

public class ProductNotFoundException extends RuntimeException {

	private static final long serialVersionUID=1L;
	
	public ProductNotFoundException(Long id) {
		super("The Product with "+id+" cannot found");
	}
}
