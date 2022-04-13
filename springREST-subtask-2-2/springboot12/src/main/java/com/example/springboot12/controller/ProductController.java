package com.example.springboot12.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot12.exception.ProductNotFoundException;
import com.example.springboot12.model.Product;
import com.example.springboot12.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	public  ProductService productService;
	
	@GetMapping("/products")
	public List<Product>getAllProducts(){
		return productService.getAllProducts();
	}
	
	@GetMapping("/products/{pId}")
	public Product getProduct(@PathVariable("pId") Long id) {
		
		return productService.getProduct(id).orElseThrow(()->new ProductNotFoundException(id));
	}
	
	@PostMapping("/products")
	public void addProduct(@RequestBody Product product) {
		productService.addProduct(product);
	}
	
	@PutMapping("/products/{pId}")
	public void updateProduct(@RequestBody Product product,
			@PathVariable("pId")Long long1) {
		productService.updateProduct(long1,product);
	}
	
	@DeleteMapping("/product/{pId}")
	public void deleteProduct(@PathVariable("pId")Long long1) {
		productService.deleteProduct(long1);
	}
}
