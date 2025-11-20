package com;

import java.util.Scanner;

public class Ej6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce una frase: ");
		String entrada = scanner.nextLine();

		// Llamamos a nuestra función
		String resultado = invertirTexto(entrada);

		System.out.println("Frase invertida: " + resultado);
		scanner.close();
	}

	// --- Aquí está la FUNCION que pide el ejercicio ---
	public static String invertirTexto(String cadenaOriginal) {
		String invertida = "";

		// 1. Empezamos i en la última posición (longitud - 1)
		// 2. El bucle sigue mientras i sea mayor o igual a 0
		// 3. En cada vuelta, restamos 1 a i (i--)
		for (int i = cadenaOriginal.length() - 1; i >= 0; i--) {
			invertida += cadenaOriginal.charAt(i);
		}

		return invertida;
	}
}
