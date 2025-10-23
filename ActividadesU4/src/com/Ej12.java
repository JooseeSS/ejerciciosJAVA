package com;

public class Ej12 {

	/*
	 * Diseñar la función calculadora() a la que se le pasan dos enteros (operandos)
	 * y la operación a realizar: 1 suma, 2 resta, 3 multiplicación, 4 división. La
	 * función devolverá un número real como resultado.
	 */

	public static void main(String[] args) {
		
		// Pruebas de la calculadora
        System.out.println("5 + 3 = " + calculadora(5, 3, 1));      // 8.0
        System.out.println("5 - 3 = " + calculadora(5, 3, 2));      // 2.0
        System.out.println("5 * 3 = " + calculadora(5, 3, 3));      // 15.0
        System.out.println("5 / 2 = " + calculadora(5, 2, 4));      // 2.5 
        System.out.println("5 / 0 = " + calculadora(5, 0, 4));      // Manejo de error
        System.out.println("Operación 5: " + calculadora(5, 3, 5)); // Operación inválida

	}
	
	public static double calculadora(int n1, int n2, int op) {
		double result = 0;
		
        switch (op) {
        case 1 -> result = n1 + n2;
        case 2 -> result = n1 - n2;
        case 3 -> result = n1 * n2;
        case 4 -> {
            if (n2 != 0) {
                result = (double) n1 / n2;
            } else {
                System.out.println("Error: No se puede dividir por cero");
            }
        }
        default -> {
            System.out.println("Error: Operación no válida. Use 1-4");
        }
    }
    
    return result;
	}

}
