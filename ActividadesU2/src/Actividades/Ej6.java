package Actividades;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero, numero2;

		System.out.println("Dame un numero");

		numero = sc.nextInt();

		System.out.println("Dame otro numero ");

		numero2 = sc.nextInt();

		if (numero > numero2) {

			System.out.println("Los numeros de manera decreciente es " + numero + ", " + numero2);

		} else {

			System.out.println("Los numeros de manera decreciente es " + numero2 + ", " + numero);

		}

	}

}
