package com;
import java.util.*;
public class Ej2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
/*2. Escribir una aplicación que solicite al usuario cuántos números desea introducir. A
continuación, se introducirá por teclado esa cantidad de números enteros, y por último,
los mostrará en el orden inverso al introducido.*/
		
		System.out.println("cuantos numeros quieres escribir");
		int cantNum=sc.nextInt();
		double[] numeros = new double[cantNum];
		for (int i = 0; i <cantNum; i++) {
			System.out.println("Dime un numero");
			numeros[i]=sc.nextDouble();
		}
		System.out.println("Estos son los numeros que has introducido");

		for (int i =numeros.length -1; i >= 0 ; i--) {
			System.out.println(numeros[i]);
		}
			}

	}


