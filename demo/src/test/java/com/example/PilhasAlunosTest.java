package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class PilhasAlunosTest {
    
    @Test
    public void testSize() {
        PilhaAlunos pilha = new PilhaAlunos();
        assertEquals(0, pilha.size());

        pilha.empilhar(new Aluno("João", 20));
        assertEquals(1, pilha.size());

        pilha.empilhar(new Aluno("Maria", 22));
        assertEquals(2, pilha.size());
    }

    @Test
    public void testIsEmpty() {
        PilhaAlunos pilha = new PilhaAlunos();
        assertTrue(pilha.isEmpty());

        pilha.empilhar(new Aluno("Pedro", 19));
        assertFalse(pilha.isEmpty());
    }

    @Test
    public void testTop() {
        PilhaAlunos pilha = new PilhaAlunos();
        assertNull(pilha.top());

        Aluno aluno = new Aluno("João", 20);
        pilha.empilhar(aluno);
        assertEquals(aluno, pilha.top());
    }
}
}
