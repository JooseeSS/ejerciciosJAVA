package Ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ej8 {

    public static void main(String[] args) {
        
        String nombreFichero1 = "perso1.txt";
        String nombreFichero2 = "perso2.txt";
        String ficheroDestino = "todos.txt";

        try (BufferedReader reader1 = new BufferedReader(new FileReader(nombreFichero1));
             BufferedReader reader2 = new BufferedReader(new FileReader(nombreFichero2));
             BufferedWriter writer = new BufferedWriter(new FileWriter(ficheroDestino))) {

            String linea1 = reader1.readLine();
            String linea2 = reader2.readLine();

                        while (linea1 != null && linea2 != null) {
                
               
                if (linea1.compareToIgnoreCase(linea2) <= 0) {
                    writer.write(linea1);    
                    writer.newLine();         
                    linea1 = reader1.readLine(); 
                } else {
                    writer.write(linea2);      
                    writer.newLine();          
                    linea2 = reader2.readLine(); 
                }
            }

          
            
            while (linea1 != null) {
                writer.write(linea1);
                writer.newLine();
                linea1 = reader1.readLine();
            }

            while (linea2 != null) {
                writer.write(linea2);
                writer.newLine();
                linea2 = reader2.readLine();
            }

            System.out.println(" Fusión completada con éxito. Revisa el archivo '" + ficheroDestino + "'.");

        } catch (IOException e) {
            System.out.println("Error al procesar los ficheros: " + e.getMessage());
        }
    }
}