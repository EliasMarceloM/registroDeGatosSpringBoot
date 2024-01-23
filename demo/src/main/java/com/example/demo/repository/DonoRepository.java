package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Dono;

public interface DonoRepository extends JpaRepository<Dono,  Integer > {
    // Métodos personalizados, se necessário, podem ser adicionados aqui conforme a necessidade do seu aplicativo
}