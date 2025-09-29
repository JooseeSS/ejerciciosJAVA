package com;
import java.util.Scanner;
public class Ej7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		final double PI = 3.14;
		System.out.println("Introduce el radio");
		double radio= sc.nextDouble();
		double longitud = 2*PI*radio;
		double area = PI*radio*radio;
		
		System.out.println("Su longitud es: " +longitud+" y su area es: " +area);		
	}

}
