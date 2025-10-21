package com;

public class Ej8 {
/*Escribir una función que, dado un entero, devuelva el número de divisores primos que tiene.*/
	

	    // Función que determina si un número es primo
	    public static boolean esPrimo(int numero) {
	        if (numero <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(numero); i++) {
	            if (numero % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	    // Función que devuelve el número de divisores primos de un entero
	    public static int contarDivisoresPrimos(int numero) {
	        int contador = 0;

	        // Recorremos desde 2 hasta el número
	        for (int i = 2; i <= numero; i++) {
	            // Si 'i' es divisor y además es primo, contamos
	            if (numero % i == 0 && esPrimo(i)) {
	                contador++;
	            }
	        }

	        return contador;
	    }

	    // Método principal para probar la función
	    public static void main(String[] args) {
	        int numero = 60; // Puedes cambiar el número para probar otros casos

	        int divisoresPrimos = contarDivisoresPrimos(numero);

	        System.out.println("El número " + numero + " tiene " + divisoresPrimos + " divisores primos.");
	    }
	}


