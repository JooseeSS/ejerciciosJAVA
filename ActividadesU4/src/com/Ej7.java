package com;
import java.util.*;
public class Ej7 {

	 public static boolean esPrimo(int numero) {
	        // Los números menores o iguales a 1 no son primos
	        if (numero <= 1) {
	            return false;
	        }

	        // Solo necesitamos verificar hasta la raíz cuadrada del número
	        for (int i = 2; i <= Math.sqrt(numero); i++) {
	            if (numero % i == 0) {
	                return false; // Si es divisible, no es primo
	            }
	        }

	        return true; // Si no tiene divisores, es primo
	    }

	    // Método principal para probar la función
	    public static void main(String[] args) {
	        int numero = 29;

	        if (esPrimo(numero)) {
	            System.out.println(numero + " es un número primo.");
	        } else {
	            System.out.println(numero + " no es un número primo.");
	        }
	    }
}