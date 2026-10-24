package com.gestaoacademica.gestao_academica.controller;

import com.gestaoacademica.gestao_academica.model.Notificacao;
import com.gestaoacademica.gestao_academica.service.NotificacaoService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notificacoes")
public class NotificacaoController {

    private final NotificacaoService notificacaoService;

    public NotificacaoController(NotificacaoService notificacaoService) {
        this.notificacaoService = notificacaoService;
    }

    @PostMapping
    public Notificacao cadastrar(@RequestBody Notificacao notificacao) {
        return notificacaoService.cadastrar(notificacao);
    }
}