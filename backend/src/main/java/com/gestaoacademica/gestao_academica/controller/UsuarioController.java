package com.gestaoacademica.gestao_academica.controller;

import com.gestaoacademica.gestao_academica.model.Usuario;
import com.gestaoacademica.gestao_academica.service.UsuarioService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public Usuario cadastrar(@RequestBody Usuario usuario) {
        return usuarioService.cadastrar(usuario);
    }
}