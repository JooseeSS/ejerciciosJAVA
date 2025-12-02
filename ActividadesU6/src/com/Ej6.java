package com;

import java.util.Scanner;

public class Ej6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce una frase: ");
		String entrada = scanner.nextLine();

		String resultado = invertirTexto(entrada);

		System.out.println("Frase invertida: " + resultado);
		scanner.close();
	}

	public static String invertirTexto(String cadenaOriginal) {
		String invertida = "";

		
		for (int i = cadenaOriginal.length() - 1; i >= 0; i--) {
			invertida += cadenaOriginal.charAt(i);
		}

		return invertida;
	}
}
