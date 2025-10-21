package com;

public class Ej9 {
/*Implementar la función divisoresPrimos() que muestre por consola todos los 
 * divisores primos del número pasado como parámetro.*/
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

    // Función que muestra por consola todos los divisores primos del número dado
    public static void divisoresPrimos(int numero) {
        System.out.println("Divisores primos de " + numero + ":");
        boolean tieneDivisores = false;

        // Recorremos desde 2 hasta el número
        for (int i = 2; i <= numero; i++) {
            // Si 'i' es divisor de 'numero' y además es primo, se muestra
            if (numero % i == 0 && esPrimo(i)) {
                System.out.println(i);
                tieneDivisores = true;
            }
        }

        // Si no tiene divisores primos, se informa
        if (!tieneDivisores) {
            System.out.println("No tiene divisores primos.");
        }
    }

    // Método principal para probar la función
    public static void main(String[] args) {
        int numero = 84; // Puedes cambiar este valor para probar otros casos
        divisoresPrimos(numero);
    }
}
