package com;
import java.util.*;
public class Ej1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	/*Diseñar un programa que muestre, para cada número introducido por teclado,
	 *  si es par, si es positivo y su cuadrado
	 * . El proceso se repetirá hasta que el número inctroducido por teclado sea 0.*/
		
	double num=1;
		while (true) {
			System.out.println("Escriba un numero");
		 num = sc.nextDouble();
		
			
				boolean par = num%2==0;
				boolean pos = num>0;
				double cuadrado=num*num;
		if (num==0) {
			System.out.println("Saliendo del programa");
			break;
			
			
		}else {
			
			if (par=true) {
				System.out.println("El numero es par");
			}else {
				System.out.println("El numero es impar");
			}if (pos=true) {
				System.out.println("El numero es positivo");
			}else {
				System.out.println("El numero es negativo");
			}	System.out.println("El cuadrado de tu numero es " +cuadrado);	

		}
			
		}
	
	}

}
