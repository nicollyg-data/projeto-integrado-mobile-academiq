package com.gestaoacademica.gestao_academica.repository;

import com.gestaoacademica.gestao_academica.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}