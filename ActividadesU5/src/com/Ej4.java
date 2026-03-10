package com;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 4. Implementar un programa que inicialice una tabla con nuestros números
		 * favoritos. A continuación, pedir al usuario el índice de un elemento que será
		 * eliminado de la tabla. Continuaremos eliminando elementos hasta que el índice
		 * introducido sea negativo o hasta que no existan más elementos que borrar. Es
		 * imprescindible controlar que el índice leído corresponde a un dato válido.
		 */

		int[] tabla = { 4, 6, 12, 1, 21, 10, 25 };
		while (tabla.length > 0) {
			System.out.println("La tabla actual esta asi: " + Arrays.toString(tabla));

			System.out.println("Introduce el indice para eliminar de la tabla(negativo para salir)");
			int pos = sc.nextInt();
			if (pos < 0) {
				System.out.println("Saliendo..");
				break;
			}
			if (pos >= tabla.length) {
				System.out.println("Índice inválido. Debe estar entre 0 y " + (tabla.length - 1));
				continue;
			}
			tabla = borrarElemento(tabla, pos);
			System.out.println("Elemento eliminado.");
		}
		System.out.println("Programa terminado. Tabla final: " + Arrays.toString(tabla));
		sc.close();
	}

	public static int[] borrarElemento(int[] t, int pos) {
		int temp = t[pos];
		t[pos] = t[t.length - 1];
		t[t.length - 1] = temp;

		return Arrays.copyOf(t, t.length - 1);
	}
}
