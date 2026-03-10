package es.iescamas.programacion.ej3;

public class Ejercicio3 {

	public static void main(String[] args) {
		int[][] matriz = { { 1, 2, 2 }, { 4, 2, 6 }, { 3, 8, 7 } };
		
System.out.println(sumaDiagonalSecundaria(matriz));
	}
	public static int sumaDiagonalSecundaria(int m1[][]) {
		

int suma=0;
		for (int fila = 0; fila < m1.length; fila+=2) {
			for (int col =0 ; col < m1[fila].length; col++) {

				suma=+ m1[col][fila];

			}
		}

		return suma;

	}
}
