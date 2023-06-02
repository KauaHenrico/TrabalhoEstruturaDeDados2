package com.example;

import java.util.ArrayList;
import java.util.List;

public class PilhaAlunos {
    private List<Aluno> alunos;

    public PilhaAlunos() {
        alunos = new ArrayList<>();
    }

    public void empilhar(Aluno aluno) {
        alunos.add(aluno);
    }

    public Aluno desempilhar() {
        if (estaVazia()) {
            throw new IllegalStateException("A pilha está vazia.");
        }
        return alunos.remove(alunos.size() - 1);
    }

    public Aluno topo() {
        if (estaVazia()) {
            throw new IllegalStateException("A pilha está vazia.");
        }
        return alunos.get(alunos.size() - 1);
    }

    public int tamanho() {
        return alunos.size();
    }

    public boolean estaVazia() {
        return alunos.isEmpty();
    }

    public void imprimirEstado() {
        System.out.println("Estado da pilha de alunos:");
        for (int i = alunos.size() - 1; i >= 0; i--) {
            Aluno aluno = alunos.get(i);
            System.out.println("Nome: " + aluno.getNome() + ", Idade: " + aluno.getIdade());
        }
    }
}
