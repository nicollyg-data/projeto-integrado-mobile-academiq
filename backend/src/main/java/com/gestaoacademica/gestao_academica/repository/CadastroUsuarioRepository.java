package com.gestaoacademica.gestao_academica.repository;

import com.gestaoacademica.gestao_academica.model.CadastroUsuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CadastroUsuarioRepository extends JpaRepository<CadastroUsuario, Long> {

    Optional<CadastroUsuario> findByEmail(String email);

    boolean existsByEmail(String email);
}