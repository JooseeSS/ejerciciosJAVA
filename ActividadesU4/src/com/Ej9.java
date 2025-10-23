package com;

public class Ej9 {
/*Implementar la función divisoresPrimos() que muestre por consola todos los 
 * divisores primos del número pasado como parámetro.*/
	public static void main(String[] args) {

		divisoresPrimos(12); // Debería mostrar: 2, 3
		divisoresPrimos(30); // Debería mostrar: 2, 3, 5
		divisoresPrimos(17); // Debería mostrar: 17
		divisoresPrimos(1); // No debería mostrar nada
	}

	public static void divisoresPrimos(int n) {
		if (n <= 1) {
			System.out.println("No hay divisores primos");
			return;
		}

		System.out.print("Divisores primos de " + n + ": ");
		boolean encontroDivisores = false;

		// Comprobamos todos los números desde 2 hasta n/2
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0 && esPrimo(i)) {
				System.out.print(i + " ");
				encontroDivisores = true;
			}
		}

		// El propio n puede ser primo
		if (esPrimo(n)) {
			System.out.print(n);
			encontroDivisores = true;
		}

		if (!encontroDivisores) {
			System.out.print("No tiene divisores primos");
		}
		System.out.println(); 
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
