package com;

import java.util.Scanner;

public class Ej10 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] conjunto1 = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
        char[] conjunto2 = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };

        System.out.print("Introduce el texto a codificar: ");
        String textoOriginal = scanner.nextLine();
        
        textoOriginal = textoOriginal.toLowerCase();

        String textoCodificado = "";

        for (int i = 0; i < textoOriginal.length(); i++) {
            char letraActual = textoOriginal.charAt(i);
            textoCodificado += codifica(conjunto1, conjunto2, letraActual);
        }

        System.out.println("Texto codificado: " + textoCodificado);
        
        scanner.close();
    }

    
    public static char codifica(char[] conjunto1, char[] conjunto2, char c) {
        for (int i = 0; i < conjunto1.length; i++) {
            if (conjunto1[i] == c) {
                return conjunto2[i];
            }
        }
        return c;
    }
}
