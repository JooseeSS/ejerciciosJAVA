package com;

import java.util.Scanner;

public class Ej5 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre completo: ");
        String nombre = scanner.nextLine();

        String vocales = "aeiouAEIOUáéíóúÁÉÍÓÚüÜ";
        
        String resultado = "";

        for (int i = 0; i < nombre.length(); i++) {
            char caracterActual = nombre.charAt(i);

            
            if (vocales.indexOf(caracterActual) == -1) {
               
                resultado += caracterActual;
            }
        }

        
        System.out.println("Nombre sin vocales: " + resultado);
        
        scanner.close();
    }
}
