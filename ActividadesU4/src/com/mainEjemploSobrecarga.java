package com;

public class mainEjemploSobrecarga {

	public static void main(String[] args) {
        // Creamos un objeto de nuestra clase para poder llamar a sus métodos
        EjemploSobrecarga ejemplo = new EjemploSobrecarga();

        System.out.println("--- Inicio de las llamadas a los métodos sobrecargados ---");
        System.out.println(); // Línea en blanco para separar

        // El compilador sabe que debe llamar a mostrar(String) por el tipo de argumento
        ejemplo.mostrar("Hola Mundo!");

        System.out.println(); // Línea en blanco para separar

        // Aquí, el compilador elige mostrar(int)
        ejemplo.mostrar(2025);

        System.out.println(); // Línea en blanco para separar

        // Finalmente, por los dos argumentos (String e int), se llama a la tercera versión
        ejemplo.mostrar("Java", 3);

        System.out.println();
        System.out.println("--- Fin de las llamadas ---");
    }
}


