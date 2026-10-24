package com.gestaoacademica.gestao_academica.service;

import com.gestaoacademica.gestao_academica.dto.CadastroRequest;
import com.gestaoacademica.gestao_academica.model.Aluno;
import com.gestaoacademica.gestao_academica.model.CadastroUsuario;
import com.gestaoacademica.gestao_academica.model.Usuario;
import com.gestaoacademica.gestao_academica.repository.AlunoRepository;
import com.gestaoacademica.gestao_academica.repository.CadastroUsuarioRepository;
import com.gestaoacademica.gestao_academica.repository.UsuarioRepository;

import org.springframework.stereotype.Service;

@Service
public class CadastroUsuarioService {

    private final CadastroUsuarioRepository cadastroUsuarioRepository;
    private final UsuarioRepository usuarioRepository;
    private final AlunoRepository alunoRepository;

    public CadastroUsuarioService(
            CadastroUsuarioRepository cadastroUsuarioRepository,
            UsuarioRepository usuarioRepository,
            AlunoRepository alunoRepository) {

        this.cadastroUsuarioRepository = cadastroUsuarioRepository;
        this.usuarioRepository = usuarioRepository;
        this.alunoRepository = alunoRepository;
    }

    public CadastroUsuario cadastrar(CadastroRequest request) {

        if (cadastroUsuarioRepository.existsByEmail(request.getEmail())) {
            throw new RuntimeException("E-mail já cadastrado.");
        }

        if (!request.getSenha().equals(request.getConfirmacaoSenha())) {
            throw new RuntimeException("As senhas não coincidem.");
        }

        CadastroUsuario cadastroUsuario = new CadastroUsuario();

        cadastroUsuario.setNome(request.getNome());
        cadastroUsuario.setEmail(request.getEmail());
        cadastroUsuario.setSenha(request.getSenha());

        CadastroUsuario cadastroSalvo =
                cadastroUsuarioRepository.save(cadastroUsuario);

        Usuario usuario = new Usuario();

        usuario.setCadastroUsuario(cadastroSalvo);
        usuario.setTipoUsuario("ALUNO");
        usuario.setAtivo(true);

        Usuario usuarioSalvo = usuarioRepository.save(usuario);

        Aluno aluno = new Aluno();

        aluno.setUsuario(usuarioSalvo);
        aluno.setNivelEnsino(request.getNivelEnsino());
        aluno.setSerie(request.getSerie());

        alunoRepository.save(aluno);

        return cadastroSalvo;
    }
}