package Actividades;

import java.util.*;

public class Ej3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribre un numero");
		int num1 = sc.nextInt();
		System.out.println("Escribre otro numero");
		int num2 = sc.nextInt();
		if (num1 > num2) {
			System.out.println("el numero mas grande es el: " + num1);

		} else if (num1==num2) {
			System.out.println("Los numeros son iguales");
		}
		else {
			System.out.println("el numero mas grande es el: " + num2);
		}
		
	}

}
