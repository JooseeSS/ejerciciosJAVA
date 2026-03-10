package com;

public class Ej11 {

	/*
	 * Diseñar una función que calcule a^n, donde a es real y n entero no negativo.
	 * Realiza versión iterativa y versión recursiva.
	 * 
	 */
	public static void main(String[] args) {

		System.out.println("Calcula a^n");
		
        System.out.println("Iterativa: " + potenciaIterativa(2.0, 3));    // 8.0
        System.out.println("Recursiva: " + potenciaRecursiva(2.0, 3));    // 8.0
        
        System.out.println("Iterativa: " + potenciaIterativa(5.0, 0));    // 1.0
        System.out.println("Recursiva: " + potenciaRecursiva(5.0, 0));    // 1.0
        
        System.out.println("Iterativa: " + potenciaIterativa(3.5, 2));    // 12.25
        System.out.println("Recursiva: " + potenciaRecursiva(3.5, 2));    // 12.25
        
        System.out.println("Iterativa: " + potenciaIterativa(2.0, 1));    // 2.0
        System.out.println("Recursiva: " + potenciaRecursiva(2.0, 1));    // 2.0
		
	}
	
	
	public static double potenciaIterativa(double a, int n) {
        if (n < 0) {
            System.out.println("Error: n no puede ser negativo");
            return -1;
        }
        
        // Caso base: cualquier número elevado a 0 es 1
        if (n == 0) {
            return 1.0;
        }
        
        double resultado = 1.0;
        
        // Multiplicar 'a' por sí mismo 'n' veces
        for (int i = 0; i < n; i++) {
            resultado *= a;
        }
        
        return resultado;
	}
	
    public static double potenciaRecursiva(double a, int n) {
        if (n < 0) {
            System.out.println("Error: n no puede ser negativo");
            return -1;
        }
        
        // Caso base 1: a^0 = 1
        if (n == 0) {
            return 1.0;
        }
        
        // Caso base 2: a^1 = a
        if (n == 1) {
            return a;
        }
        
        // Caso recursivo: a^n = a * a^(n-1)
        return a * potenciaRecursiva(a, n - 1);
    }
}
