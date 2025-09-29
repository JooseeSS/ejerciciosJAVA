package com;

import java.util.Scanner;
public class Ej13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu primera nota");
		int nota1 = sc.nextInt();
		System.out.println("Dime tu segunda nota");
		int nota2 = sc.nextInt();
		
		System.out.println("Dime tu tercera nota nota");
		int nota3 = sc.nextInt();
		int mediaBoletin = (nota1+nota2+nota3)/3;
		double mediaExp = (nota1+nota2+nota3)/3.0;
		System.out.println("tu media en el bolentin es un: " +mediaBoletin + " y en la del expediente es un: " +mediaExp);
	}

}