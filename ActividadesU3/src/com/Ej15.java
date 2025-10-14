package com;
import java.util.*;
public class Ej15 {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
/*Realizar un programa que nos pida un número n, y nos diga cuántos números hay entre 2 
 * y n que sean primos. Un número primo es aquél que solo es divisible por 1 y por él mismo.
 *  Veamos un ejemplo para n = 8:

2 → primo
3 → primo
4 → no primo
5 → primo
6 → no primo
7 → primo
8 → no primo

Resultando un total de 5 números primos.*/
System.out.println("Introduce un número n:");
int n = sc.nextInt();
int contPrimos = 0;
for (int i =2; i<=n;i++){
	boolean esPrimo = true;
	for(int j=2; j<i;j++) {
		if (i % j == 0) {
			esPrimo = false;
			break;
		}
		
	}
		if (esPrimo) {
            contPrimos++;
            System.out.println(i + " es primo");
        } else {
            System.out.println(i + " no es primo");
        }
}System.out.println("Total de números primos entre 2 y " + n + " es " + contPrimos);
	}

}
