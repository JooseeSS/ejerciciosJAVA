package com;
import java.util.*;
public class Ej8 {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
/*
 * Pedir un número y calcular su factorial. 
 * Por ejemplo, el factorial de 5 se denota 5! y es igual a 5 × 4 × 3 × 2 × 1 = 120.
 */
		int fact=1;
	System.out.println("De que numero quiere calcular su factorial");	
	int num = sc.nextInt();	
	
	for (int i =num; i>=1; i--) {
		 fact *=i;
		}
		System.out.println("El factorial de " +num +" es " +fact);
		
		
		
		
		
		
		
	}

}
