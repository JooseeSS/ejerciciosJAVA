package com;
import java.util.*;
public class TablaMultiplicarFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num=0;
		System.out.println("Escribe un numero y le muestro su tabla de multiplicar");
		 num = sc.nextDouble();
	double i=0;	
	for(i=0; i<=10; i++) {
		double cuenta = num*i;
		System.out.println("La cuenta " +num + " x " +i +" = " + cuenta);
		
	}
	}

}
