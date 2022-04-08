package com.training.jpademo.repository;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.training.jpademo.entity.Book;


import java.util.List;

@SpringBootTest
public class BookRepositoryTest {

	@Autowired
	private BookRepository bookRepository;
	
//	@Test
//	public void saveBook() {
//		
//	Book anna=new Book("Anna Karenina","Leo Tolstoy",9,true);
//	Book pride=new Book("Pride and Prejudice","Jane Austin",8,false);
//	Book merchant=new Book("The Merchant of Venice","Shakespeare",8,true);
//	Book tale=new Book("A Tale of Two Cities","Charles Dicknes",5,true);
//	Book tunnel=new Book("The Tunnel","William H.Gass",4,false);
//	bookRepository.save(anna);
//	bookRepository.save(pride);
//	bookRepository.save(merchant);
//	bookRepository.save(tale);
//	bookRepository.save(tunnel);
//		}
	
//	@Test
//	public void available() {
//		System.out.println("\n*******************************");
//		System.out.println("\nQuerying for available books...");
//		
//		List<Book>availableBooks=bookRepository.findAvailabeBooks();
//		System.out.println("\nOUTPUT:\n"+availableBooks.toString());
//		
//		System.out.println("\n******************************");
//	}
	
//	@Test
//	public void findByAuthor() {
//		Book king=new Book("King Lear","Shakespeare",6,true);
//		Book macbeth=new Book("Macbeth","Shakespeare",7,false);
//		bookRepository.save(king);
//		bookRepository.save(macbeth);
//		
//		System.out.println("\n****************************");
//		System.out.println("\nQuerying for books authored by Shakespeare");
//		
//		List<Book>books=bookRepository.findByAuthor("Shakespeare");
//		System.out.println("\nOutput:\n"+books.toString());
//		
//		System.out.println("\n********************************");
//	}
	
//	@Test
//	public void findByAuthorAndAvailabe() {
//		System.out.println("\n****************************");
//		System.out.println("\nQuerying for books authored by Shakespeare");
//		
//		List<Book>books1=bookRepository.findByAuthor("Shakespeare");
//		System.out.println("\nOutput:\n"+books1.toString()); 
//		
//		System.out.println("\n****************************");
//		List<Book>books=bookRepository.findByAuthorAndAvailabe("Shakespeare", true);
//		System.out.println("Returned data: "+books.toString());
		
//		
//	
//	}
	
//	@Test
//	public void update() {
//		System.out.println("\n*********************");
//		
//		bookRepository.updateTitleById("The TEMPEST", 21);
//		List<Book>book=bookRepository.findByAuthor("Shakespeare");
//		System.out.println("\nOutput"+book.toString());
//		
//		
//		System.out.println("\n************************");
//	}
//	
//	@Test
//	public void delete() {
//		System.out.println("\n**********************");
//		
//		bookRepository.deleteByTitle("The Tunnel");
//		
//		for (Book book:bookRepository.findAll()) {
//			System.out.println(book.toString());
//		}
//		System.out.println("\n******************");
//	}
	
	
	
	//#properties file//
	
	
//	@Test
//	public void namedQueries() {
//		
//		System.out.println("\n******************************");
//		List<Book>books=bookRepository.findAllNamedQuery();
//		
//		System.out.println("\nOutput:\n"+books.toString());
//		System.out.println("\n*****************************");
//		
//		System.out.println("\nRetrieving books based on title:");
//		books=bookRepository.findByTitleNamedQuery("Pride and Prejudice");
//		
//		
//		System.out.println("\nOutput\n"+books.toString());
//		System.out.println("\n*************************");
//		
//		System.out.println("\nRetrieving books based on author");
//		books=bookRepository.findByAuthorNativeNamedQuery("Shakespeare");
//		
//		System.out.println("\nOutput|n"+books.toString());
//		System.out.println("\n**********************************");
//	}
	
	
	
	
	
	/*xml file*/
	
	
	@Test
	public void byXmlFile() {
		System.out.println("\n********************************");
		
		System.out.println("Retrieving all books...");
		List<Book>books=bookRepository.findAllXML();
		
		System.out.println("\nOutput:"+books.toString());
		System.out.println("\n***************************");
		
		System.out.println("\nRetrieving books based on rating...");
		books=bookRepository.findByMinRatingXML(8);
		
		System.out.println("\nOutput:\n"+books.toString());
		System.out.println("\n*******************************");
		
		System.out.println("Retrieving books based on author.....");
		books=bookRepository.findByAuthorNativeXML("Shakespeare");
		
		System.out.println("\nOutput:\n"+books.toString());
		System.out.println("\n***********************");
	}
}

