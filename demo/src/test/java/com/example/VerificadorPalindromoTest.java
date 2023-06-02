package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class VerificadorPalindromoTest  {

    @Test
    public void testIsPalindromoTrue() {
        assertTrue(VerificadorPalindromo.isPalindromo("arara"));
    }
    
    @Test
    public void testIsPalindromoFalse() {
        assertFalse(VerificadorPalindromo.isPalindromo("banana"));
    }
    
    @Test
    public void testIsPalindromoEmptyString() {
        assertTrue(VerificadorPalindromo.isPalindromo(""));
    }
    
    @Test
    public void testIsPalindromoSingleCharacter() {
        assertTrue(VerificadorPalindromo.isPalindromo("a"));
    }
    
    @Test
    public void testIsPalindromoUpperCase() {
        assertTrue(VerificadorPalindromo.isPalindromo("OVO"));
    }
    
    @Test
    public void testIsPalindromoMixedCase() {
        assertTrue(VerificadorPalindromo.isPalindromo("SoLolOs"));
    }
    
    @Test
    public void testIsPalindromoNumeric() {
        assertTrue(VerificadorPalindromo.isPalindromo("12321"));
    }
    
    @Test
    public void testIsPalindromoSpecialCharacters() {
        assertTrue(VerificadorPalindromo.isPalindromo("!@#$#@!"));
    }
    
    @Test
    public void testIsPalindromoWhitespace() {
        assertTrue(VerificadorPalindromo.isPalindromo("  "));
    }
    
    @Test
    public void testIsPalindromoNonAlphaNumeric() {
        assertTrue(VerificadorPalindromo.isPalindromo("1a2b3c3b2a1"));
    }
    
}
