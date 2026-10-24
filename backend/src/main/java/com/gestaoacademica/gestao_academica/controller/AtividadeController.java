package com.gestaoacademica.gestao_academica.controller;

import com.gestaoacademica.gestao_academica.model.Atividade;
import com.gestaoacademica.gestao_academica.service.AtividadeService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/atividades")
public class AtividadeController {

    private final AtividadeService atividadeService;

    public AtividadeController(AtividadeService atividadeService) {
        this.atividadeService = atividadeService;
    }

    @PostMapping
    public Atividade cadastrar(@RequestBody Atividade atividade) {
        return atividadeService.cadastrar(atividade);
    }
}