package com;

import java.util.Scanner;

public class Ej7 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Pedir datos
        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        System.out.print("Introduce la palabra a buscar: ");
        String palabra = scanner.next();

        // (Opcional) Convertimos todo a minúsculas para que la búsqueda no falle
        // si escribes "Hola" y "hola".
        frase = frase.toLowerCase();
        palabra = palabra.toLowerCase();

        int contador = 0;
        int indiceBuscar = 0; // Posición desde donde empezaremos a buscar

        // 2. Bucle de búsqueda
        while (true) {
            // Buscamos la palabra en la frase empezando desde 'indiceBuscar'
            int indiceEncontrado = frase.indexOf(palabra, indiceBuscar);

            // Si indexOf devuelve -1, significa que no encontró más coincidencias
            if (indiceEncontrado == -1) {
                break; // Salimos del bucle
            }

            // Si la encontró:
            contador++;
            
            // 3. Actualizamos el índice para seguir buscando DESPUÉS de donde encontramos esta
            // Simplemente sumamos 1 para avanzar a la siguiente posición posible
            indiceBuscar = indiceEncontrado + 1;
        }

        // 4. Resultado
        System.out.println("La palabra aparece " + contador + " veces.");
        
        scanner.close();
    }
}
