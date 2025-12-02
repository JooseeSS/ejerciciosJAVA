package com;

import java.util.Arrays;
import java.util.Scanner;

public class Ej12 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la primera palabra o frase:");
        String palabra1 = scanner.nextLine();

        System.out.println("Introduce la segunda palabra o frase:");
        String palabra2 = scanner.nextLine();

        
        String p1Limpia = palabra1.toLowerCase().replace(" ", "");
        String p2Limpia = palabra2.toLowerCase().replace(" ", "");

        boolean sonAnagramas = false;

     
        if (p1Limpia.length() == p2Limpia.length()) {
            
            // 3. Convertir a Arrays de caracteres
            char[] arreglo1 = p1Limpia.toCharArray();
            char[] arreglo2 = p2Limpia.toCharArray();

            
            Arrays.sort(arreglo1);
            Arrays.sort(arreglo2);

            
            if (Arrays.equals(arreglo1, arreglo2)) {
                sonAnagramas = true;
            }
        }

       
        if (sonAnagramas) {
            System.out.println("¡Son ANAGRAMAS!");
        } else {
            System.out.println("No son anagramas.");
        }

        scanner.close();
    }
}
