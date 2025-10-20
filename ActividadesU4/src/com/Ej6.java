package com;
import java.util.*;
public class Ej6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un caracter");
		char caracter = sc.next().charAt(0);
		System.out.println(esVocal(caracter));
		
	}

	public static boolean esVocal(char caracter) {

		switch (caracter) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			return true;
		default:
			return false;
		}
	}
}