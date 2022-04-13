package com.example.springboot;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.example.springboot.model.Product;
import com.example.springboot.repository.ProductRepository;


@SpringBootApplication
public class Springboot11Application implements CommandLineRunner{

	
	@Autowired
	private ProductRepository productRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Springboot11Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
		productRepository.save(new Product("Telivision","Electronics"));
		productRepository.save(new Product("Air Conditioner","Electronics"));
		productRepository.save(new Product("Sofa","Furniture"));
		productRepository.save(new Product("Cusion","Home Essential"));
		productRepository.save(new Product("Wardrobe","Furniture"));
	}

}
