package com;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 3. Introducir por teclado un número n; a continuación solicitar al usuario
		 * que teclee n números. Realizar la media de los números positivos, la media de
		 * los negativos y contar el número de ceros introducidos
		 */
		int sumaPos = 0;
		int sumaNeg = 0;
		int contPos = 0;
		int contNeg = 0;
		int contCero = 0;
		System.out.println("cuantos numeros quieres escribir");
		int cantNum = sc.nextInt();

		double[] numeros = new double[cantNum];
		for (int i = 0; i < cantNum; i++) {
			System.out.println("Dime un numero");
			numeros[i] = sc.nextDouble();
		}

		for (int i = 0; i < cantNum; i++) {
			if (numeros[i] > 0) {
				sumaPos += numeros[i];
				contPos++;
			} else if (numeros[i] < 0) {
				sumaNeg += numeros[i];
				contNeg++;
			} else {
				contCero++;
			}
		} double medPos =(contPos>0) ? (sumaPos/contPos):0;
		double medNeg =(contNeg>0) ? (sumaNeg/contNeg):0;

		
		  System.out.println("Cantidad de números introducidos: " + cantNum);
	        System.out.println("Media de los números positivos: " + medPos);
	        System.out.println("Media de los números negativos: " + medNeg);
	        System.out.println("Cantidad de ceros introducidos: " + contCero);
	}
	

}