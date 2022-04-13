package com.example.springboot13.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot13.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product,Long> {

}
