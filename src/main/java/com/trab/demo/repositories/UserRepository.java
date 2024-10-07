package com.trab.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trab.demo.models.User;

public interface UserRepository extends JpaRepository<User,Long>{
    
}
