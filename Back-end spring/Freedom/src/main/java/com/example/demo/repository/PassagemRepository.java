package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Passagem;

public interface PassagemRepository extends JpaRepository<Passagem, Long>{

}
