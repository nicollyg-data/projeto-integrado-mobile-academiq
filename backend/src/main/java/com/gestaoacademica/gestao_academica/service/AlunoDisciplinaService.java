package com.gestaoacademica.gestao_academica.service;

import com.gestaoacademica.gestao_academica.model.AlunoDisciplina;
import com.gestaoacademica.gestao_academica.repository.AlunoDisciplinaRepository;

import org.springframework.stereotype.Service;

@Service
public class AlunoDisciplinaService {

    private final AlunoDisciplinaRepository alunoDisciplinaRepository;

    public AlunoDisciplinaService(AlunoDisciplinaRepository alunoDisciplinaRepository) {
        this.alunoDisciplinaRepository = alunoDisciplinaRepository;
    }

    public AlunoDisciplina cadastrar(AlunoDisciplina alunoDisciplina) {
        return alunoDisciplinaRepository.save(alunoDisciplina);
    }
}
