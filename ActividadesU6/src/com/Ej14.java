package com;

import java.util.Random;
import java.util.Scanner;

public class Ej14 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String textoOriginal;

       
        System.out.println("=== JUGADOR 1 ===");
        
        do {
            System.out.print("Introduce la palabra o frase secreta: ");
            textoOriginal = scanner.nextLine();
            
            if (textoOriginal.isEmpty()) {
                System.out.println("¡Error! El texto no puede estar vacío.");
            }
        } while (textoOriginal.isEmpty());

        
        for (int i = 0; i < 50; i++) System.out.println();

       
        String anagrama = desordenarTexto(textoOriginal);

    
        System.out.println("=== JUGADOR 2 ===");
        System.out.println("¡Adivina la palabra original!");
        System.out.println("Pista (Anagrama): " + anagrama);

        String intento;
        boolean acertado = false;

        while (!acertado) {
            System.out.print("Tu respuesta: ");
            intento = scanner.nextLine();

            if (intento.equals(textoOriginal)) {
                System.out.println("¡ENHORABUENA! Has acertado.");
                acertado = true;
            } else {
                System.out.println("Incorrecto. Sigue intentándolo.");
            }
        }

        scanner.close();
    }

   
    public static String desordenarTexto(String texto) {
        char[] caracteres = texto.toCharArray();
        Random generadorAleatorio = new Random();

        for (int i = 0; i < caracteres.length; i++) {
                        int indiceAleatorio = generadorAleatorio.nextInt(caracteres.length);

            char temporal = caracteres[i];
            caracteres[i] = caracteres[indiceAleatorio];
            caracteres[indiceAleatorio] = temporal;
        }

        return new String(caracteres);
    }
}
