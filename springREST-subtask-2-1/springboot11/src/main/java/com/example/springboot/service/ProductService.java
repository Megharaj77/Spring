package com.example.springboot.service;

import java.util.ArrayList;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.repository.ProductRepository;


import com.example.springboot.model.Product;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public List<Product>getAllProducts(){
		
		List<Product>products=new ArrayList<>();
		
		productRepository.findAll().forEach(products::add);
		
		return products;
	}
	
	public Optional<Product>getProduct(long id){
		return productRepository.findById(id);
	}
	
	public void addProduct(Product product) {
		productRepository.save(product);
	}
	
	public void updateProduct(long id,Product product) {
		if(productRepository.findById(id).get()!=null) {
			productRepository.save(product);
		}
	}
	
	public void deleteProduct(long id) {
		productRepository.deleteById(id);
	}
}
