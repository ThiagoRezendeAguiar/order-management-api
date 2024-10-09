package com.trab.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trab.demo.models.Category;

public interface CategoryRepository extends JpaRepository<Category,Long>{
    
}
