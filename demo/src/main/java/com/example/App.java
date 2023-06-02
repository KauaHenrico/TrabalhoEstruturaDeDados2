package com.example;

public class App 
{
    public static void main( String[] args )
    {
         // Testando VerificadorPalindromo
         String palavra = "arara";
         boolean resultado = VerificadorPalindromo.isPalindromo(palavra);
         System.out.println("A palavra \"" + palavra + "\" é um palíndromo? " + resultado);
 
         // Testando PilhaAlunos e FilaAlunos
         PilhaAlunos pilha = new PilhaAlunos();
         FilaAlunos fila = new FilaAlunos();
 
         // Inserindo alunos na pilha
         pilha.empilhar(new Aluno("João", 20));
         pilha.empilhar(new Aluno("Maria", 22));
         pilha.empilhar(new Aluno("Pedro", 19));
 
         // Imprimindo o estado da pilha
         pilha.imprimirEstado();
 
         // Invertendo a ordem dos alunos da fila usando a pilha
         while (!pilha.estaVazia()) {
             Aluno aluno = pilha.desempilhar();
             fila.enfileirar(aluno);
         }
 
         // Imprimindo o estado da fila
         fila.imprimirEstado();
     }
}

