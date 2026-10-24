package com.gestaoacademica.gestao_academica.controller;

import com.gestaoacademica.gestao_academica.model.AlunoDisciplina;
import com.gestaoacademica.gestao_academica.service.AlunoDisciplinaService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aluno-disciplinas")
public class AlunoDisciplinaController {

    private final AlunoDisciplinaService alunoDisciplinaService;

    public AlunoDisciplinaController(AlunoDisciplinaService alunoDisciplinaService) {
        this.alunoDisciplinaService = alunoDisciplinaService;
    }

    @PostMapping
    public AlunoDisciplina cadastrar(@RequestBody AlunoDisciplina alunoDisciplina) {
        return alunoDisciplinaService.cadastrar(alunoDisciplina);
    }
}