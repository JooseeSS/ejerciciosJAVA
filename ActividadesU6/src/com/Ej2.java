package com;
import java.io.Console;
import java.util.*;
public class Ej2 {
	/*Diseñar el juego acierta la contraseña. La mecánica del juego es la siguiente: 
	 * el primer jugador introduce la contraseña; a continuación, el segundo jugador 
	 * debe teclear palabras hasta que la acierte. 
	 * Realizar dos versiones; en la primera las únicas pistas que se proporcionan son el 
	 * número de caracteres y cuáles son el primer y el último carácter de la contraseña. 
	 * En la segunda versión se facilita el juego indicando si la palabra introducida es mayor 
	 * o menor, alfabéticamente, que la contraseña.
	Pista
	Usa un bucle que pida intentos al segundo jugador hasta que coincidan con la contraseña. 
	Para las pistas, trabaja con la longitud y con los caracteres extremo. En la segunda versión,
	 compara alfabéticamente cada intento con la contraseña para indicar si está “por encima” o “
	 por debajo”.*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== Acierta la contraseña (Versión 1) ===");
        String contrasenia = leerContrasenaInvisible(sc, "Jugador 1: introduce la contraseña: ");

        // Intento de "ocultar" la contraseña moviendo la salida
        clearScreen();

        System.out.println("Jugador 2: ahora debes adivinar la contraseña.");
        System.out.println("Te daré pistas tras cada intento: longitud, primer y último carácter.");
        int intentos = 0;

        while (true) {
            System.out.print("Introduce un intento: ");
            String intento = sc.nextLine();
            intentos++;

            if (intento.equals(contrasenia)) {
                System.out.println("¡Correcto! Has adivinado la contraseña en " + intentos + " intento(s).");
                break;
            } else {
                System.out.println("No es correcto.");
                mostrarPistas(contrasenia);
            }
        }

        sc.close();
    }

    // Lee la contraseña sin eco si la consola lo permite; si no, usa Scanner (visible)
    private static String leerContrasenaInvisible(Scanner sc, String prompt) {
        Console console = System.console();
        if (console != null) {
            char[] pwd = console.readPassword(prompt);
            return new String(pwd);
        } else {
            System.out.print(prompt + " (se mostrará en pantalla): ");
            return sc.nextLine();
        }
    }

    private static void mostrarPistas(String contrasenia) {
        int len = contrasenia.length();
        char primero = contrasenia.charAt(0);
        char ultimo = contrasenia.charAt(len - 1);
        System.out.println("Pista: longitud = " + len +
                           ", primer carácter = '" + primero +
                           "', último carácter = '" + ultimo + "'.");
    }

    // "Borra" la pantalla imprimiendo varias líneas para desplazar la contraseña fuera de vista
    private static void clearScreen() {
        for (int i = 0; i < 40; i++) {
            System.out.println();
        }
	}

}
