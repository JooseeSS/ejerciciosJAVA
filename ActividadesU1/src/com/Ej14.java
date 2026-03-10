package com;
import java.util.*;
public class Ej14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Escriba un numero para redondearlo al entero mas cercano");	
double num = sc.nextDouble();
double numRed = Math.round(num);
System.out.println("Su numero redondedo es: " +numRed);
	}

}
