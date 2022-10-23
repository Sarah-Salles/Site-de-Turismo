package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

}
