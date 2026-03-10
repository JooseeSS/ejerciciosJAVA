package com;

import java.util.Scanner;

public class Ej15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] tabla = new int[5]; // Por ejemplo, tamaño 5

		int imparesDesechados = rellenaPares(tabla, sc);

		System.out.println("\nTabla rellenada con números pares:");
		for (int i = 0; i < tabla.length; i++) {
			System.out.print(tabla[i] + " ");
		}

		System.out.println("\nCantidad de impares desechados: " + imparesDesechados);
		sc.close();
	}

	public static int rellenaPares(int[] tabla, Scanner sc) {
		int cont = 0; // Contador de impares desechados
		int i = 0; // Índice para rellenar el array

		while (i < tabla.length) {
			System.out.print("Introduce un número: ");
			int valor = sc.nextInt();

			if (valor % 2 == 0) {
				tabla[i] = valor; // Guardar solo pares
				i++;
			} else {
				cont++; // Contar impares desechados
			}
		}

		return cont;
	}
}
