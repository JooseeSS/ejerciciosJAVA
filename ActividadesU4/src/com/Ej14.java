package com;
import java.util.*;
public class Ej14 {

	public static void main(String[] args) {
/*Diseñar una función que calcule el n-ésimo término de la serie de Fibonacci:
f(0) = 1, f(1) = 1 y f(n) = f(n-1) + f(n-2) para n ≥ 2.*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba un numero");
		int num = sc.nextInt();
		System.out.println("La serie de Fibonacci de su numero es:");
		System.out.println(fibonacci(num));
			}
	
	public static int fibonacci (int num) {
		if(num==1||num==0) {
			
			return 1;
			
		}


		return fibonacci(num-1) + fibonacci(num-2) ;
	}
}
