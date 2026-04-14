package Ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ej6 {

   
    private static final String ARCHIVO = "firmas.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== LIBRO DE FIRMAS ===");
            System.out.println("1. Mostrar todas las firmas");
            System.out.println("2. Añadir nueva firma");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            
                        opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    mostrarFirmas();
                    break;
                case 2:
                    anadirFirma(sc);
                    break;
                case 0:
                    System.out.println("Cerrando el libro de firmas...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        sc.close();
    }


    private static void mostrarFirmas() {
        File archivo = new File(ARCHIVO);
        
       
        if (!archivo.exists()) {
            System.out.println("El libro de firmas está vacío todavía.");
            return;
        }

        System.out.println("\n---  FIRMAS ACTUALES ---");
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println("- " + linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer las firmas: " + e.getMessage());
        }
        System.out.println("--------------------------");
    }

    private static void anadirFirma(Scanner sc) {
        System.out.print("Introduce el nombre para firmar: ");
        String nombre = sc.nextLine().trim();

        if (nombre.isEmpty()) {
            System.out.println("El nombre no puede estar vacío.");
            return;
        }

      
        if (comprobarRepetido(nombre)) {
            System.out.println("⚠️ ¡Esa persona ya ha firmado el libro!");
        } else {
           
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO, true))) {
                writer.write(nombre);
                writer.newLine();
                System.out.println("✅ Firma añadida con éxito.");
            } catch (IOException e) {
                System.out.println("Error al guardar la firma: " + e.getMessage());
            }
        }
    }

   
    private static boolean comprobarRepetido(String nuevoNombre) {
        File archivo = new File(ARCHIVO);
        
        if (!archivo.exists()) {
            return false; 
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
              
                if (linea.equalsIgnoreCase(nuevoNombre)) {
                    return true; 
                }
            }
        } catch (IOException e) {
            System.out.println("Error al comprobar repetidos: " + e.getMessage());
        }
        
     
        return false; 
    }
}