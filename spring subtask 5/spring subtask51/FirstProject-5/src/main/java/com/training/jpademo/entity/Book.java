package com.training.jpademo.entity;

import javax.persistence.*;

@Entity
@Table(name="Book")
public class Book {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bookId;
	private String title;
	private String author;
	private int rating;
	private boolean availabe;
	
	
	public Book() {
		super();
	}


	public Book(String title, String author, int rating, boolean availabe) {
		super();
		this.title = title;
		this.author = author;
		this.rating = rating;
		this.availabe = availabe;
	}


	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", rating=" + rating
				+ ", availabe=" + availabe + "]";
	}
	
	
	
}
