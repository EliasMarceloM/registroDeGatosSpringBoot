package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Dono;

public interface DonoRepository extends JpaRepository<Dono,  Integer > {
   
}
