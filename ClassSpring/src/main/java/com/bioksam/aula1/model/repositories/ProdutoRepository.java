package com.bioksam.aula1.model.repositories;

import com.bioksam.aula1.model.dominio.Produto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
    
}
