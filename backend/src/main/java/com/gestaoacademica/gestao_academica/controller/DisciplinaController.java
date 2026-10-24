package com.gestaoacademica.gestao_academica.controller;

import com.gestaoacademica.gestao_academica.model.Disciplina;
import com.gestaoacademica.gestao_academica.service.DisciplinaService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/disciplinas")
public class DisciplinaController {

    private final DisciplinaService disciplinaService;

    public DisciplinaController(DisciplinaService disciplinaService) {
        this.disciplinaService = disciplinaService;
    }

    @PostMapping
    public Disciplina cadastrar(@RequestBody Disciplina disciplina) {
        return disciplinaService.cadastrar(disciplina);
    }
}