package com.gestaoacademica.gestao_academica.controller;

import com.gestaoacademica.gestao_academica.model.Aluno;
import com.gestaoacademica.gestao_academica.service.AlunoService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @PostMapping
    public Aluno cadastrar(@RequestBody Aluno aluno) {
        return alunoService.cadastrar(aluno);
    }
}