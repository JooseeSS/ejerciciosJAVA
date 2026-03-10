package com;
import java.util.*;
public class Ej1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Introduce dos cadena de carecteres");
	String cadena1 = sc.nextLine();
	String cadena2 = sc.nextLine();
	
	if(cadena1.length()<cadena2.length()) {
		System.out.println("La primer acadena es mas corta");
	}else if (cadena1.length()==cadena2.length()) {
		System.out.println("Las dos cadenas son iguales de largas");
	}else{
		System.out.println("La segunda acadena es mas corta");
	}
	}

}
