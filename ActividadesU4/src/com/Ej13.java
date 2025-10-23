package com;
import java.util.*;
public class Ej13 {

	public static void main(String[] args) {
/*Calcular el factorial de n recursivamente. Recuerda que por definición 0! = 1.*/
Scanner sc = new Scanner(System.in);
System.out.println("Escriba un numero");
int num = sc.nextInt();
System.out.println(" es " +factorial(num));
	}
public static int factorial (int num) {
	if(num==1||num==0) {
		System.out.print(num);
		return 1;
		
	}
	System.out.print(num+"x");
	return num*=factorial(num-1);
}
}
