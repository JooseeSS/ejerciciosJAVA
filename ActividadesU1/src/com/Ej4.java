package com;
import java.util.*;
public class Ej4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu año de nacimiento");
		int año_nac = sc.nextInt();
		System.out.println("Dime el año actual");
		int año_actual = sc.nextInt();
		int edad = año_actual-año_nac;
		System.out.println("Tienes " +edad + " años");
	}

}
