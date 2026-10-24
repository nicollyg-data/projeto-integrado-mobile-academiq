package com.gestaoacademica.gestao_academica.repository;

import com.gestaoacademica.gestao_academica.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LoginRepository extends JpaRepository<Login, Long> {

    Optional<Login> findByUsuarioId(Long usuarioId);
}