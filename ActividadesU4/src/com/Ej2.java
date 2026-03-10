package com;
import java.util.*;
 
public class Ej2 {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
/*Escribir una función a la que se le pasen dos enteros y muestre todos los números comprendidos entre ellos.*/
	System.out.println("Escribre un numero entero");
	int num1=sc.nextInt();
	System.out.println("Escribre otro numero entero");
	int num2=sc.nextInt();
	
	numeros(num1, num2);
	}
public static void numeros(int num1, int num2){
	if(Math.abs(num1-num2)<=1) {
		System.out.println("No hay numeros entre estos dos");
		return;
	}
		if(num1<num2) {
			for(int i=+num1; i<num2; i++) {
				System.out.println("Estos son los numeros que hay entre los dos");
				System.out.println(i);
			}
			
		}else {
			for(int i=+num1; i>num2; i--) {
				System.out.println("Estos son los numeros que hay entre los dos");
				System.out.println(i);
			}
		}
	}
}

 



