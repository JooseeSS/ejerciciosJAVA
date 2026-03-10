package com;

import java.util.Scanner;

public class Ej9 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        final String PREFIJO = "Javalín, javalón";
        final String SUFIJO = "javalén, len, len";

        System.out.println("Introduce la frase a traducir:");
        String entrada = scanner.nextLine();

       
        String mensajeTraducido = "";
        boolean esJavalandia = false;

      
        if (entrada.startsWith(PREFIJO)) {
            esJavalandia = true;
                        mensajeTraducido = entrada.substring(PREFIJO.length());
        }
        else if (entrada.endsWith(SUFIJO)) {
            esJavalandia = true;
            int finCorte = entrada.length() - SUFIJO.length();
            mensajeTraducido = entrada.substring(0, finCorte);
        }

        if (esJavalandia) {
            mensajeTraducido = mensajeTraducido.trim();
            System.out.println("El mensaje traducido es: " + mensajeTraducido);
        } else {
            System.out.println("La frase no está escrita en el idioma de Javalandia.");
        }

        scanner.close();
    }
}
