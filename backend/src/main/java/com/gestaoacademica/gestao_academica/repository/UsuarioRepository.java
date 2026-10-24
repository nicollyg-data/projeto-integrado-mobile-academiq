package com.gestaoacademica.gestao_academica.repository;

import com.gestaoacademica.gestao_academica.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByCadastroUsuarioId(Long cadastroUsuarioId);
}