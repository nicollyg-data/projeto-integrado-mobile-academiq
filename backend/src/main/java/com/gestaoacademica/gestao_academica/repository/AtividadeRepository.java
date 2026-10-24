package com.gestaoacademica.gestao_academica.repository;

import com.gestaoacademica.gestao_academica.model.Atividade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtividadeRepository extends JpaRepository<Atividade, Long> {
}