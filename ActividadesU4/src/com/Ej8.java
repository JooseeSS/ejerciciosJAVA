package com;
import java.util.*;
public class Ej8 {
/*Escribir una función que, dado un entero, devuelva el número de divisores primos que tiene.*/
	public static void main(String[] args) {
		// Pruebas de la función
		System.out.println(cantidadDivisoresPrimos(12)); // 2 (2, 3)
		System.out.println(cantidadDivisoresPrimos(30)); // 3 (2, 3, 5)
		System.out.println(cantidadDivisoresPrimos(17)); // 1 (17)
		System.out.println(cantidadDivisoresPrimos(1)); // 0
		System.out.println(cantidadDivisoresPrimos(2)); // 1
		System.out.println(cantidadDivisoresPrimos(100)); // 2 (2, 5)
		System.out.println(cantidadDivisoresPrimos(7)); // 1 (7)
	}

	public static int cantidadDivisoresPrimos(int n) {
		if (n <= 1) {
			return 0;
		}

		int cont = 0;

		// Comprobamos todos los números desde 2 hasta n/2
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0 && esPrimo(i)) {
				cont++;
			}
		}

		// El propio n puede ser primo
		if (esPrimo(n)) {
			cont++;
		}

		return cont;
	}

	public static boolean esPrimo(int numero) {
		if (numero <= 1)
			return false;
		if (numero == 2)
			return true;
		if (numero % 2 == 0)
			return false;

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}
}


