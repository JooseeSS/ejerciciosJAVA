package com;
import java.util.*;
public class Ej14 {

	public static void main(String[] args) {
/*Pedir por consola un número n y dibujar un triángulo rectángulo de n elementos de lado, 
 * utilizando para ello asteriscos (*). Por ejemplo, para n = 4:
* * * *
* * *
* *
*
**/
Scanner sc = new  Scanner(System.in);
System.out.println("Introduce un número para el tamaño del triángulo:");
int n = sc.nextInt();
for (int i = n; i>=1 ; i--) {
	for (int j = 1; j <= i; j++) {
		System.out.print("* ");
	}
	System.out.println();
	
}
	}

}
