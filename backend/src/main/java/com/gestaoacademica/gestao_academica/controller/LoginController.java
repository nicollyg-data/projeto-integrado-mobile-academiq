package com.gestaoacademica.gestao_academica.controller;

import com.gestaoacademica.gestao_academica.model.Login;
import com.gestaoacademica.gestao_academica.service.LoginService;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/logins")
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping
    public Login realizarLogin(
            @RequestParam String email,
            @RequestParam String senha) {

        return loginService.realizarLogin(email, senha);
    }
}