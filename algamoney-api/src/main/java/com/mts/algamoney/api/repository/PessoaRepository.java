package com.mts.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mts.algamoney.api.entities.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
