package com;

import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {
        // 1. Crear el scanner para leer del teclado
        Scanner scanner = new Scanner(System.in);
        
        // 2. Variable acumuladora inicializada vacía
        String frase = "";
        String palabra;

        System.out.println("Introduce palabras una a una. Escribe 'fin' para terminar:");

        // 3. Bucle infinito que se romperá manualmente con un break
        while (true) {
            System.out.print("Palabra: ");
            palabra = scanner.next(); // Lee la siguiente palabra (sin espacios)

            // 4. Condición de parada: Si es "fin" (ignorando mayúsculas/minúsculas)
            if (palabra.equalsIgnoreCase("fin")) {
                break; // Salimos del bucle inmediatamente
            }

            // 5. Añadir espacio solo si no es la primera palabra
            if (!frase.isEmpty()) {
                frase += " "; 
            }

            // 6. Concatenar (unir) la palabra a la frase acumulada
            frase += palabra;
        }

        // 7. Mostrar el resultado final
        System.out.println("\nLa frase completa es:");
        System.out.println(frase);

        scanner.close();
    }
}
