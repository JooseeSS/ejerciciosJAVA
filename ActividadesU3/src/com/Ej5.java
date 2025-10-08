package com;
import java.util.*;
public class Ej5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
/*Desarrollar un programa que solicite los valores mínimo y máximo de un rango. A 
 * continuación solicitará por teclado un número que debe estar dentro del rango. 
 * Si el valor introducido no pertenence al rango, la aplicación volverá a pedir
 *  otro valor, y así repetidas veces, hasta que el valor se encuentre dentro del rango.*/

System.out.println("Escriba el valor maximo de su rango");		
double max = sc.nextDouble();	
System.out.println("Escriba el valor min de su rango");			
double min = sc.nextDouble();		

System.out.println("Escriba un numero");			
double num = sc.nextDouble();	
	if (num>=min && num<=max) {
		System.out.println("Su numero esta dentro del rango");
	}	else {
		while(num>=max || num<=min) {
			System.out.println("Su numero no esta en el rango vuelva a escribir otro numero");
			num = sc.nextDouble();
		}System.out.println("Su numero esta dentro del rango");
	}
		
	}

}
