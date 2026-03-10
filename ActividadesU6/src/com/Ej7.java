package com;

import java.util.Scanner;

public class Ej7 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        System.out.print("Introduce la palabra a buscar: ");
        String palabra = scanner.next();

        frase = frase.toLowerCase();
        palabra = palabra.toLowerCase();

        int contador = 0;
        int indiceBuscar = 0; 

       
        while (true) {
            int indiceEncontrado = frase.indexOf(palabra, indiceBuscar);

            if (indiceEncontrado == -1) {
                break; 
            }

           
            contador++;
            
           
            indiceBuscar = indiceEncontrado + 1;
        }

        
        System.out.println("La palabra aparece " + contador + " veces.");
        
        scanner.close();
    }
}
