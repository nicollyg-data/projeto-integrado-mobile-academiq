package com.gestaoacademica.gestao_academica.model;

import jakarta.persistence.*;

@Entity
@Table(
    name = "aluno_disciplina",
    uniqueConstraints = {
        @UniqueConstraint(columnNames = {"aluno_id", "disciplina_id"})
    }
)
public class AlunoDisciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(
        name = "aluno_id",
        nullable = false
    )
    private Aluno aluno;

    @ManyToOne
    @JoinColumn(
        name = "disciplina_id",
        nullable = false
    )
    private Disciplina disciplina;

    public AlunoDisciplina() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}