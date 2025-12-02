package com;

import java.util.Scanner;

public class Ej13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce una frase:");
		String frase = scanner.nextLine();

		frase = frase.toLowerCase();

		int[] contadores = new int[256];

		for (int i = 0; i < frase.length(); i++) {
			char caracterActual = frase.charAt(i);

			if (caracterActual < 256) {

				contadores[caracterActual]++;
			}
		}

		System.out.println("\nResultado:");
		for (int i = 0; i < contadores.length; i++) {

			if (contadores[i] > 0) {

				char letra = (char) i;
				int cantidad = contadores[i];

				if (cantidad == 1) {
					System.out.println(letra + " : " + cantidad + " vez");
				} else {
					System.out.println(letra + " : " + cantidad + " veces");
				}
			}
		}

		scanner.close();
	}
}
