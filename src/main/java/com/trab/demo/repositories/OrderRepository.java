package com.trab.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trab.demo.models.Order;

public interface OrderRepository extends JpaRepository<Order,Long>{
    
}
