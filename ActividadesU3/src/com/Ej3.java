package com;

import java.util.*;

public class Ej3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Realizar el juego el número secreto, que consiste en acertar un número
		 * desconocido (generado aleatoriamente entre 1 y 100). Para ello se leen por
		 * teclado una serie de números, para los que se indica: «mayor» o «menor»,
		 * según sea mayor o menor con respecto al número secreto. El proceso te rmina
		 * cuando el usuario acierta o cuando se rinde (introduciendo un –1).
		 */

		Random random = new Random();
		int nRandom = random.nextInt(100) + 1;
		
		System.out.println("Escriba un numero");
		int num = sc.nextInt();
		while (num != -1) {
			if (num==nRandom) {
				System.out.println("Su numero es correcto");
				break;
			} else {
				if (num > nRandom) {
					System.out.println("Su numero es mayor al random");
				} else if (num < nRandom) {
					System.out.println("Su numero es menor al random");
				}
			}
			System.out.println("Escriba otro numero(-1 para salir)");
			num = sc.nextInt();
		}
		System.out.println("Saliendo...");
	}

}
