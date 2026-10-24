package com.gestaoacademica.gestao_academica.service;

import com.gestaoacademica.gestao_academica.model.CadastroUsuario;
import com.gestaoacademica.gestao_academica.model.Login;
import com.gestaoacademica.gestao_academica.model.Usuario;
import com.gestaoacademica.gestao_academica.repository.CadastroUsuarioRepository;
import com.gestaoacademica.gestao_academica.repository.LoginRepository;
import com.gestaoacademica.gestao_academica.repository.UsuarioRepository;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class LoginService {

    private final CadastroUsuarioRepository cadastroUsuarioRepository;
    private final UsuarioRepository usuarioRepository;
    private final LoginRepository loginRepository;

    public LoginService(
            CadastroUsuarioRepository cadastroUsuarioRepository,
            UsuarioRepository usuarioRepository,
            LoginRepository loginRepository) {

        this.cadastroUsuarioRepository = cadastroUsuarioRepository;
        this.usuarioRepository = usuarioRepository;
        this.loginRepository = loginRepository;
    }

    public Login realizarLogin(String email, String senha) {

        CadastroUsuario cadastroUsuario =
                cadastroUsuarioRepository.findByEmail(email)
                        .orElseThrow(() ->
                                new RuntimeException("E-mail ou senha inválidos."));

        if (!cadastroUsuario.getSenha().equals(senha)) {
            throw new RuntimeException("E-mail ou senha inválidos.");
        }

        Usuario usuario =
                usuarioRepository.findByCadastroUsuarioId(cadastroUsuario.getId())
                        .orElseThrow(() ->
                                new RuntimeException("Usuário não encontrado."));

        Login login = loginRepository.findByUsuarioId(usuario.getId())
                .orElseGet(() -> {
                    Login novoLogin = new Login();
                    novoLogin.setUsuario(usuario);
                    return novoLogin;
                });

        login.setUltimoAcesso(LocalDateTime.now());

        return loginRepository.save(login);
    }
}