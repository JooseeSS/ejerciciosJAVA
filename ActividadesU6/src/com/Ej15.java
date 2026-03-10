package com;

import java.util.Random;
import java.util.Scanner;

public class Ej15 {
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
            System.out.print("\nTu respuesta: ");
            intento = scanner.nextLine();

            if (intento.equals(textoOriginal)) {
                System.out.println("¡ENHORABUENA! Has acertado la palabra: " + textoOriginal);
                acertado = true;
            } else {
                int coincidencias = contarCoincidencias(textoOriginal, intento);
                
                System.out.println("Incorrecto, pero vas por buen camino.");
                System.out.println("Letras en la posición correcta: " + coincidencias);
            }
        }

        scanner.close();
    }

    
    public static int contarCoincidencias(String original, String intento) {
        int coincidencias = 0;
        
      
        int longitudMinima = Math.min(original.length(), intento.length());

        for (int i = 0; i < longitudMinima; i++) {
            if (original.charAt(i) == intento.charAt(i)) {
                coincidencias++;
            }
        }
        
        return coincidencias;
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
