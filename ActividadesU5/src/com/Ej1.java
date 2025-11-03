package com;
import java.util.*;
public class Ej1 {

	public static void main(String[] args) {
/*1. Diseñar un programa que solicite al usuario que introduzca por teclado 5 números
decimales a continuación, debe mostrar los números en el mismo orden que se han
introducido.
*/
		Scanner sc = new Scanner(System.in);	

double[] numeros = new double[5];

for (int i = 0; i <5; i++) {
	System.out.println("Dime un numero");
	numeros[i]=sc.nextDouble();
}
System.out.println("Estos son los numeros que has introducido");

for (int i = 0; i < numeros.length; i++) {
	System.out.println(numeros[i]);
}
	}

}
