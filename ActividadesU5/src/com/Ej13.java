package com;

public class Ej13 {

	public static void main(String[] args) {
		/*
		 * Sobrecargar la función maximo() para que calcule el máximo de una tabla de
		 * enteros.
		 * 
		 * Indicaciones para resolverlo Implementa int maximo(int[] t) con int max =
		 * Integer.MIN_VALUE; Recorre y si t[i] > max, asigna. Devuelve max.
		 */

		int[] numeros = { -5, -8, -2, -14, -7, -3 };

		

		System.out.println("El máximo del arreglo es: " + maximo(numeros));
	}

	// Función sobrecargada que calcula el máximo de un arreglo de enteros
	public static int maximo(int[] t) {
		int max = Integer.MIN_VALUE; // Valor mínimo posible de un entero

		for (int i = 0; i < t.length; i++) {
			if (t[i] > max) {
				max = t[i];
			}
		}

		return max;
	}
}
