package com;

public class Ej1 {
	/**
     * Muestra por pantalla el mensaje "Eco ..." un número n de veces.
     *
     * @param n El número de veces que se debe imprimir el mensaje.
     */
    public static void eco(int n) {
        // Usamos un bucle 'for' que se ejecuta n veces
        // La variable 'i' va desde 0 hasta n-1
        
    	for (int i = 0; i < n; i++) {
            System.out.println("Eco ...");
        }
    }

    // --- Método main para probar la función ---
    public static void main(String[] args) {
        System.out.println("Prueba con eco(3):");
        eco(3);

        System.out.println("\nPrueba con eco(5):");
        eco(5);

        System.out.println("\nPrueba con eco(0):");
        // No debería imprimir nada
        eco(0);
    }
}
