package com.gestaoacademica.gestao_academica.controller;

import com.gestaoacademica.gestao_academica.dto.CadastroRequest;
import com.gestaoacademica.gestao_academica.model.CadastroUsuario;
import com.gestaoacademica.gestao_academica.service.CadastroUsuarioService;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/cadastros")
public class CadastroUsuarioController {

    private final CadastroUsuarioService cadastroUsuarioService;

    public CadastroUsuarioController(CadastroUsuarioService cadastroUsuarioService) {
        this.cadastroUsuarioService = cadastroUsuarioService;
    }

    @PostMapping
    public CadastroUsuario cadastrar(@RequestBody CadastroRequest request) {

        return cadastroUsuarioService.cadastrar(request);
    }
}