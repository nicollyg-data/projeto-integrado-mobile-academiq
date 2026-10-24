package com.gestaoacademica.gestao_academica.service;

import com.gestaoacademica.gestao_academica.model.Disciplina;
import com.gestaoacademica.gestao_academica.repository.DisciplinaRepository;

import org.springframework.stereotype.Service;

@Service
public class DisciplinaService {

    private final DisciplinaRepository disciplinaRepository;

    public DisciplinaService(DisciplinaRepository disciplinaRepository) {
        this.disciplinaRepository = disciplinaRepository;
    }

    public Disciplina cadastrar(Disciplina disciplina) {
        return disciplinaRepository.save(disciplina);
    }
}