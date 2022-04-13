package com.example.springboot12;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;

import com.example.springboot12.model.Product;
import com.example.springboot12.repository.ProductRepository;


@SpringBootApplication
@EnableCaching
public class Springboot12Application implements CommandLineRunner{

	
	@Autowired
	private ProductRepository productRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Springboot12Application.class, args);
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
