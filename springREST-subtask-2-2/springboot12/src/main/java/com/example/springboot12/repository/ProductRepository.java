package com.example.springboot12.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot12.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product,Long> {

}
