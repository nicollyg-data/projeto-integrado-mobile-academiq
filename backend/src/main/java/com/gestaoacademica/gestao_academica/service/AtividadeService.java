package com.gestaoacademica.gestao_academica.service;

import com.gestaoacademica.gestao_academica.model.Atividade;
import com.gestaoacademica.gestao_academica.repository.AtividadeRepository;

import org.springframework.stereotype.Service;

@Service
public class AtividadeService {

    private final AtividadeRepository atividadeRepository;

    public AtividadeService(AtividadeRepository atividadeRepository) {
        this.atividadeRepository = atividadeRepository;
    }

    public Atividade cadastrar(Atividade atividade) {
        return atividadeRepository.save(atividade);
    }
}