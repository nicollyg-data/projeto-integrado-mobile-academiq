package com.gestaoacademica.gestao_academica.repository;

import com.gestaoacademica.gestao_academica.model.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {
}