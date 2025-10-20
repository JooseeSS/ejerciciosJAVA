package com;

import java.util.*;

public class Ej4 {

	public static void main(String[] args) {
		/*
		 * Diseñar una función que reciba como parámetros dos números enteros y que
		 * devuelva el mayor de los dos.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba dos numeros enteros");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		while (num1 == num2) {
			System.out.println("Es el mismo numero");
			System.out.println("Introduce dos numeros distintos");
			num1 = sc.nextInt();
			num2 = sc.nextInt();

		}
		numeros(num1, num2);

	}

	public static void numeros(int num1, int num2) {
		if (num1 < num2) {
			System.out.println("El numero mas grande es el " + num2);

		} else {
			System.out.println("El numero mas grande es el " + num1);
		}
	}

}
