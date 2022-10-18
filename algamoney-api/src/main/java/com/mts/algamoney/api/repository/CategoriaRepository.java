package com.mts.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mts.algamoney.api.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
