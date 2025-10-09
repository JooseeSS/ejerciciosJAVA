package com;
import java.util.*;
public class Ej10 {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
/*Se desea implementar una aplicación que pida al usuario 
 * que introduzca un número comprendido entre 1 y 10. Debemos mostrar 
 * la tabla de multiplicar de dicho número. El código tendrá que asegurarse
de que el número introducido se encuentra entre el 1 y el 10.*/
		System.out.println("Escriba un numero del uno al diez");
	double num = sc.nextDouble();
	
	
	
	while(num<1 || num>10) {
		System.out.println("Su numero esta fuera del rango");
		System.out.println("Escriba otro numero pero que este entre el 1 y el 10");
		 num = sc.nextDouble();
	}System.out.println("La tabla del " + num +" es");
		 for (int i = 0; i <=10; i++) {
				
		double tabla = num*i;
		
		System.out.println(num +" x " +i + " = " +tabla );	
	}
	
	}
	}

