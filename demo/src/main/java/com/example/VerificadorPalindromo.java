package com.example;
import java.util.Stack;


public class VerificadorPalindromo {
    public static boolean isPalindromo(String palavra) {
        palavra = palavra.toLowerCase(); // Convertendo para minúsculas para considerar letras maiúsculas e minúsculas iguais
        Stack<Character> pilha = new Stack<>();

        // Inserindo cada letra da palavra na pilha
        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            if (Character.isLetter(c)) {
                pilha.push(c);
            }
        }

        // Verificando se a palavra é um palíndromo
        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            if (Character.isLetter(c)) {
                if (c != pilha.pop()) {
                    return false;
                }
            }
        }

        return true;
    }
}
