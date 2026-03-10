package Actividades;

import java.util.*;

/*
 * Implementar un programa que pida por teclado un número decimal e indique si es un número casi-cero, que son
 *  aquellos, positivos o negativos, que se acercan a 0 por menos de 1 unidad, aunque curiosamente el 0 
 *  no se considera un número casi-cero.
 *   Ejemplos: 0.3, –0.99 o 0.123. Y números que no se consideran casi-ceros son: 12.3, 0 o –1.
 */
public class Ej5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un número decimal: ");
		double numero = sc.nextDouble();

		if (numero > -1 && numero < 1 && numero != 0) {
			System.out.println(numero + " es un número casi-cero.");
		} else {
			System.out.println(numero + " NO es un número casi-cero.");
		}

	}

}
