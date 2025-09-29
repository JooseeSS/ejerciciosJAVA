package com;
import java.util.Scanner;
public class Ej8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("Pon tu edad para saber si ere menor o mayor de edad");
		int edad= sc.nextInt();
	
		 boolean mayorDeEdad = edad >= 18;
System.out.println(mayorDeEdad);
	}

}
