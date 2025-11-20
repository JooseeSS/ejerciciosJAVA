package com;

import java.util.Scanner;

public class Ej4 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Pedir la frase completa
        System.out.print("Introduce una frase: ");
        // Usamos nextLine() para que lea toda la línea, incluidos los espacios
        String frase = scanner.nextLine(); 

        int contadorEspacios = 0;

        // 2. Recorrer la frase carácter a carácter
        for (int i = 0; i < frase.length(); i++) {
            // Obtenemos el carácter en la posición 'i'
            char caracterActual = frase.charAt(i);

            // 3. Comprobar si es un espacio en blanco
            if (caracterActual == ' ') {
                contadorEspacios++;
            }
        }

        // 4. Mostrar el resultado
        System.out.println("La frase contiene " + contadorEspacios + " espacios en blanco.");
        
        scanner.close();
    }
}
