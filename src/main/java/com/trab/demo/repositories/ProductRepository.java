package com.trab.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trab.demo.models.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{
    
}
