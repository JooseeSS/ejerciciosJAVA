package com;

import java.util.*;

public class Ej3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Realizar una función que calcule y muestre el área o el volumen de un
		 * cilindro, según se especifique. Opción 1: área. Opción 2: volumen. Además se
		 * pasa el radio de la base y la altura. Fórmulas: área = 2 · π · r · (h + r)
		 * volumen = π · r² · h
		 */
		System.out.println("Cual es el radio de tu cilindro");
		int r = sc.nextInt();
		System.out.println("Cual es la altura de tu cilindro");
		int h = sc.nextInt();
		System.out.println("Quieres hacer el Area(1) o el Volumen(2)");
		int op = sc.nextInt();

		while (op != 1 && op != 2) {
			System.out.println("Opcion no valida elija de nuevo");
			System.out.println("Quieres hacer el Area(1) o el Volumen(2)");
			op = sc.nextInt();
		}
		datos(r, h, op);
	}

	public static void datos(double r, double h, int op) {

		switch (op) {
		case 1:
			double area = 2 * Math.PI * r * (h + r);
			System.out.println("El area del cilindro es: " + area);
			break;
		case 2:
			double volumen = Math.PI * Math.pow(r, 2) * h;
			System.out.println("El volumen del cilindro es: " + volumen);
			break;
		default:
			break;
		}
	}
}
