package com;

import java.util.Scanner;

public class Ej11 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] conjunto1 = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
        char[] conjunto2 = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };

        System.out.print("Introduce el texto codificado a descifrar: ");
        String textoCodificado = scanner.nextLine();
        
        textoCodificado = textoCodificado.toLowerCase();

        String textoDescodificado = "";

        for (int i = 0; i < textoCodificado.length(); i++) {
            char letraActual = textoCodificado.charAt(i);
            
            textoDescodificado += codifica(conjunto2, conjunto1, letraActual);
        }

        System.out.println("Texto original (descodificado): " + textoDescodificado);
        
        scanner.close();
    }

   
    public static char codifica(char[] busqueda, char[] reemplazo, char c) {
        for (int i = 0; i < busqueda.length; i++) {
            if (busqueda[i] == c) {
                return reemplazo[i];
            }
        }
        return c;
    }
}
