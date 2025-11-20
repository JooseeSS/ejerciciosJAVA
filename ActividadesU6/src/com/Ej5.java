package com;

import java.util.Scanner;

public class Ej5 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Pedir el nombre completo
        System.out.print("Introduce tu nombre completo: ");
        String nombre = scanner.nextLine();

        // 2. Definimos todas las vocales a eliminar (minúsculas, mayúsculas y acentos)
        String vocales = "aeiouAEIOUáéíóúÁÉÍÓÚüÜ";
        
        String resultado = "";

        // 3. Recorremos el nombre carácter a carácter
        for (int i = 0; i < nombre.length(); i++) {
            char caracterActual = nombre.charAt(i);

            // 4. Comprobamos si el carácter actual NO está en la lista de vocales
            // indexOf devuelve -1 si el carácter no se encuentra en la cadena 'vocales'
            if (vocales.indexOf(caracterActual) == -1) {
                // Si no es una vocal, lo añadimos al resultado
                resultado += caracterActual;
            }
        }

        // 5. Mostrar el resultado
        System.out.println("Nombre sin vocales: " + resultado);
        
        scanner.close();
    }
}
