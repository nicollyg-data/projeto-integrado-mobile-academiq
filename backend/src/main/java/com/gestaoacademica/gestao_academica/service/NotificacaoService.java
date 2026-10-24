package com.gestaoacademica.gestao_academica.service;

import com.gestaoacademica.gestao_academica.model.Notificacao;
import com.gestaoacademica.gestao_academica.repository.NotificacaoRepository;

import org.springframework.stereotype.Service;

@Service
public class NotificacaoService {

    private final NotificacaoRepository notificacaoRepository;

    public NotificacaoService(NotificacaoRepository notificacaoRepository) {
        this.notificacaoRepository = notificacaoRepository;
    }

    public Notificacao cadastrar(Notificacao notificacao) {
        return notificacaoRepository.save(notificacao);
    }
}