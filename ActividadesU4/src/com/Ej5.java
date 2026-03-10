package com;
import java.util.*;

public class Ej5 {
public static void main(String[] args) {
/*Repite el ejercicio anterior con una versión que calcule el máximo de 3 números.*/
	Scanner sc = new Scanner(System.in);
	System.out.println("Escriba tres numeros enteros");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	int num3 = sc.nextInt();
	while (num1 == num2 || num1==num3 || num2==num3) {
		System.out.println("Alguno de los numeros estan repetidos");
		System.out.println("Introduce tres numeros distintos");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3= sc.nextInt();

	}
	
System.out.println("El mayor es el: "+numeros(num1, num2, num3));
}

public static int numeros(int num1, int num2, int num3) {
	int max=num1;
	if (num2>max) {
		max=num2;
	}
	if (num3>max) {
		max=num3;
	}
	return max;
}

}