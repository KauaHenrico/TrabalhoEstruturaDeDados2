package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        PilhaAlunos pilha = null;
        FilaAlunos fila = null;

        while (opcao != 4) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Verificar se uma palavra é um palíndromo");
            System.out.println("2. Criar uma pilha de alunos");
            System.out.println("3. Criar uma fila de alunos");
            System.out.println("4. Sair");
            System.out.print("Opção: ");

            try {
                opcao = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer do teclado

                switch (opcao) {
                    case 1:
                        System.out.print("Digite uma palavra: ");
                        String palavra = scanner.nextLine();

                        boolean resultado = VerificadorPalindromo.isPalindromo(palavra);
                        System.out.println("A palavra \"" + palavra + "\" é um palíndromo? " + resultado + "\n");
                        break;
                    case 2:
                        pilha = new PilhaAlunos();

                        System.out.print("Digite a quantidade de alunos: ");
                        int quantidadeAlunos = scanner.nextInt();
                        scanner.nextLine(); // Limpar o buffer do teclado

                        for (int i = 1; i <= quantidadeAlunos; i++) {
                            System.out.println("Aluno #" + i);
                            System.out.print("Digite o nome do aluno: ");
                            String nome = scanner.nextLine();
                            System.out.print("Digite a idade do aluno: ");
                            int idade = scanner.nextInt();
                            scanner.nextLine(); // Limpar o buffer do teclado

                            pilha.empilhar(new Aluno(nome, idade));
                        }

                        System.out.println("Pilha de alunos criada com sucesso!");
                        pilha.imprimirEstadoPilha();
                        break;
                    case 3:
                        fila = new FilaAlunos();

                        System.out.print("Digite a quantidade de alunos: ");
                        int quantidadeAlunosFila = scanner.nextInt();
                        scanner.nextLine(); // Limpar o buffer do teclado

                        for (int i = 1; i <= quantidadeAlunosFila; i++) {
                            System.out.println("Aluno #" + i);
                            System.out.print("Digite o nome do aluno: ");
                            String nome = scanner.nextLine();
                            System.out.print("Digite a idade do aluno: ");
                            int idade = scanner.nextInt();
                            scanner.nextLine(); // Limpar o buffer do teclado

                            fila.enfileirar(new Aluno(nome, idade));
                        }

                        System.out.println("Fila de alunos criada com sucesso!");
                        fila.imprimirEstadoFila();
                        break;
                    case 4:
                        System.out.println("Saindo do programa...");
                        break;
                    default:
                        System.out.println("Opção inválida. Digite um número válido.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Opção inválida. Digite um número válido.");
                scanner.nextLine(); // Limpar o buffer do teclado
            }
        }

        scanner.close();
    }
}
