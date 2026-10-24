package com.gestaoacademica.gestao_academica.service;

import com.gestaoacademica.gestao_academica.model.Aluno;
import com.gestaoacademica.gestao_academica.repository.AlunoRepository;

import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public Aluno cadastrar(Aluno aluno) {
        return alunoRepository.save(aluno);
    }
}