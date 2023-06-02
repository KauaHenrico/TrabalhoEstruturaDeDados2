package com.example;

import java.util.LinkedList;
import java.util.Queue;

public class FilaAlunos {
    private Queue<Aluno> alunos;

    public FilaAlunos() {
        alunos = new LinkedList<>();
    }

    public void enfileirar(Aluno aluno) {
        alunos.add(aluno);
    }

    public Aluno desenfileirar() {
        if (estaVazia()) {
            throw new IllegalStateException("A fila está vazia.");
        }
        return alunos.poll();
    }

    public boolean estaVazia() {
        return alunos.isEmpty();
    }

    public void imprimirEstadoFila() {
        System.out.println("Estado da fila de alunos:");
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome() + ", Idade: " + aluno.getIdade());
        }
        System.out.println("Fim da fila.\n");
    }
}
