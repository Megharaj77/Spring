package com.training.jpademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.training.jpademo.entity.Book;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Modifying;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;


@Transactional
public interface BookRepository extends JpaRepository<Book, Long>{

//	@Query("FROM Book b WHERE b.availabe=true")
//	@Query(value="SELECT * FROM Book b WHERE b.availabe=1",nativeQuery=true)
//	List<Book>findAvailabeBooks();
//	
//	@Query("SELECT b FROM Book b WHERE b.author=?1")
//	List<Book>findByAuthor(String author);
	
//	@Query("select b from Book b where b.author=?1 And b.availabe=?2")
//	List<Book>findByAuthorAndAvailabe(String author ,boolean available);
	
//	@Query("SELECT b FROM Book b WHERE b.author=:author")
//     List<Book>findByAuthor(@Param("author")String author);
	
//	@Query("SELECT b FROM Book b WHERE b.author=:author AND b.availbe=:availbe ORDER BY title")
//    List<Book>findByAuthorAndAvailbe(@Param("author")String author,
//    		                @Param("availabe")boolean availabe);

//	@Query(value="SELECT * FROM book b WHERE b.availabe=1",nativeQuery=true)
//	List<Book>findAvailabeBooks();
//	
//	@Query("select b from Book b where b.author=:author")
//	List<Book>findByAuthor(@Param("author")String author);
//
//	@Query("select b from Book b where b.author=:author AND b.availabe=:avail ORDER BY title")
//	List<Book>findByAuthorAndAvailabe(@Param("author")String author, @Param("avail")boolean availabe);
//	
//	@Modifying
//	@Query("UPDATE Book b SET b.title=?1 WHERE b.bookId=?2")
//	int updateTitleById(String title,int bookId);
	
//	@Modifying
//	@Query("DELETE from book b where b.title=?1")
//	void deleteByTitle(String title);
	
	
	/*properties file*/
//	
//	List<Book>findAllNamedQuery();
//	List<Book>findByTitleNamedQuery(String title);
//	
//	@Query(nativeQuery=true)
//	List<Book>findByAuthorNativeNamedQuery(@Param("author")String author);
	
	
	///*xml file*/
	
	List<Book>findAllXML();
	
	List<Book>findByMinRatingXML(int minRating);
	
	@Query(nativeQuery=true)
	List<Book>findByAuthorNativeXML(@Param("author")String author);
	
}
