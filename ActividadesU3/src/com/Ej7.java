package com;
import java.util.*;
public class Ej7 {
public static void  main (String[] args) {
	Scanner sc = new Scanner(System.in);
/**
 * Diseñar un programa que muestre el producto de los 10 primeros números impares.
 */
	
	int producto=1;
	int contador=0;
	int numero=1;
	
	while (contador<10) {
		producto *=numero;
		numero +=2;
		contador++;
	}
	System.out.println("El producto  de los 10 primeros números impares es " +producto);
	/*for (int i = 1; i <= 19; i += 2) { 
            producto *= i;
        }

        System.out.println("El producto de los 10 primeros números impares es: " + producto);
    }*/
	
}
}
