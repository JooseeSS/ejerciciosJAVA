package com;
import java.util.*;
public class Ej4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
/*Escribir una aplicación para aprender a contar, que pedirá un
 *  número n y mostrará todos los números del 1 a n.*/

		
		System.out.println("Escribe un numero");
		int n = sc.nextInt();
		System.out.println("Estos son todos los numero del 1 al " +n);
		for (int i=1; i <=n; i++) {
			
			System.out.println(i);
		}
		
		
		
	}

}
