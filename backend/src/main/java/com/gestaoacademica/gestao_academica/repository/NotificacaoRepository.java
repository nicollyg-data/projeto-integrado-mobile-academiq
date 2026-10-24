package com.gestaoacademica.gestao_academica.repository;

import com.gestaoacademica.gestao_academica.model.Notificacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificacaoRepository extends JpaRepository<Notificacao, Long> {
}