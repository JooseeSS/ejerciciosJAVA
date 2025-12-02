package com;

import java.util.Scanner;

public class Ej8 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String fraseOriginal = scanner.nextLine();

      
        String fraseLimpia = fraseOriginal.toLowerCase().replace(" ", "");

        
        String fraseInvertida = new StringBuilder(fraseLimpia).reverse().toString();

        
        if (fraseLimpia.equals(fraseInvertida)) {
            System.out.println("ES PALÍNDROMA");
        } else {
            System.out.println(" NO ES PALÍNDROMA");
        }
        
     
        System.out.println("\n--- Datos Internos ---");
        System.out.println("Original:  " + fraseOriginal);
        System.out.println("Procesada: " + fraseLimpia);
        System.out.println("Invertida: " + fraseInvertida);

        scanner.close();
    }
	
}
