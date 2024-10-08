package com.trab.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trab.demo.models.Product;
import com.trab.demo.repositories.ProductRepository;

@Service
public class ProductService {
 @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> product = repository.findById(id);
        return product.get();
    }
}
