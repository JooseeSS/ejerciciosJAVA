package com;
import java.util.*;

public class Ej11 {

	public static void main(String[] args) {
/*Diseñar una aplicación que muestre las tablas de multiplicar del 1 al 10.*/
		Scanner sc = new  Scanner(System.in);

		 for (int i = 1; i <=10; i++) {
			 
			 System.out.println("La tabla de " +i +" :");
			 
			 for (int a = 1; a <=10; a++) {
				 System.out.println(i +" x " +a + " = " +a*i );	
			}
			 System.out.println("");
			}
	}

}
