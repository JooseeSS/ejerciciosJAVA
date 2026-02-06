package es.iescamas.programacion.ej1;

import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		int[][] m1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] m2 = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };

		int[][] matrizSumada = (sumaMatrices(m1, m2));
		for (int fila = 0; fila < matrizSumada.length; fila++) {
			for (int col = 0; col < matrizSumada[fila].length; col++) {
				System.out.println(matrizSumada[fila][col]);
			}
		}

	}

	public static int[][] sumaMatrices(int m1[][], int m2[][]) {
		if (m1.length != m2.length) {
			throw new IllegalArgumentException("Las matrices deben tener el mismo tamaño");
		}

		int[][] matrizSumada = new int[m1.length][m1.length];

		for (int fila = 0; fila < m1.length; fila++) {
			for (int col = 0; col < m1[fila].length; col++) {

				matrizSumada[col][fila] = m1[col][fila] + m2[col][fila];

			}
		}

		return matrizSumada;

	}
}
