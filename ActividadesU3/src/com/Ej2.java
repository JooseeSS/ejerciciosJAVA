package com;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad;
        int mayorEdad = 0;
        int suma = 0;
        int alumnos = 0;

        System.out.println("Introduce la edad de un alumno (edad negativa para salir):");

        while (true) {
            edad = sc.nextInt();

            
            if (edad < 0) {
                System.out.println("Saliendo del programa...");
                break;
            }

         
            suma += edad;

            
            alumnos++;

           
            if (edad >= 18) {
                mayorEdad++;
            }

            System.out.println("Introduce la edad del siguiente alumno (negativa para salir):");
        }

        
        double media = 0;
        if (alumnos > 0) {
            media = (double) suma / alumnos;
        }

    
        System.out.println("\n--- Resultados ---");
        System.out.println("Suma total de edades: " + suma);
        System.out.println("Número total de alumnos: " + alumnos);
        System.out.println("Media de edades: " + media);
        System.out.println("Mayores de edad: " + mayorEdad);

        sc.close();
    }
}


