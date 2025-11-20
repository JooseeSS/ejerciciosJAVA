package com;

import java.util.Scanner;

public class Ej8 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Entrada de datos
        System.out.print("Introduce una frase: ");
        String fraseOriginal = scanner.nextLine();

        // 2. NORMALIZACIÓN (Limpieza de la frase)
        // - .toLowerCase(): Convierte todo a minúsculas (A -> a)
        // - .replace(" ", ""): Elimina todos los espacios en blanco
        String fraseLimpia = fraseOriginal.toLowerCase().replace(" ", "");

        // 3. Inversión de la cadena
        // Usamos StringBuilder para invertirla eficientemente
        String fraseInvertida = new StringBuilder(fraseLimpia).reverse().toString();

        // 4. Comparación
        // Comparamos la versión limpia con su versión invertida
        if (fraseLimpia.equals(fraseInvertida)) {
            System.out.println("ES PALÍNDROMA");
        } else {
            System.out.println(" NO ES PALÍNDROMA");
        }
        
        // Mostramos internamente qué comparó el programa (útil para depurar)
        System.out.println("\n--- Datos Internos ---");
        System.out.println("Original:  " + fraseOriginal);
        System.out.println("Procesada: " + fraseLimpia);
        System.out.println("Invertida: " + fraseInvertida);

        scanner.close();
    }
	
}
