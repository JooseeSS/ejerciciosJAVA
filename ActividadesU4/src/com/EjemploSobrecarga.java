package com;

public class EjemploSobrecarga {
	// 1. Define tres métodos 'mostrar()' con diferentes parámetros

    public void mostrar(String mensaje) {
        System.out.println("Ejecutando mostrar(String): " + mensaje);
    }

    
    public void mostrar(int numero) {
        System.out.println("Ejecutando mostrar(int): " + numero);
    }

    
    public void mostrar(String texto, int veces) {
        System.out.println("Ejecutando mostrar(String, int) para repetir '" + texto + "' " + veces + " veces:");
        for (int i = 0; i < veces; i++) {
            System.out.println("  -> " + texto);
        }
    }
}
