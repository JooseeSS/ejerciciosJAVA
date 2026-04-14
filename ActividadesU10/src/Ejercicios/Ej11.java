package Ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ej11 {

    public static void main(String[] args) {
        
        String nombreFichero = "matriz.txt";
        int dimension = 0;

        
        try (BufferedReader reader1 = new BufferedReader(new FileReader(nombreFichero))) {
            while (reader1.readLine() != null) {
                dimension++;
            }
        } catch (IOException e) {
            System.out.println(" Error al leer el fichero: " + nombreFichero);
            return; 
        }

        if (dimension == 0) {
            System.out.println(" El archivo está vacío.");
            return;
        }

        
        int[][] matriz = new int[dimension][dimension];

    
        try (BufferedReader reader2 = new BufferedReader(new FileReader(nombreFichero))) {
            String linea;
            int fila = 0; 

            while ((linea = reader2.readLine()) != null) {
   
                String[] numerosTexto = linea.split(" ");
                
             
                for (int columna = 0; columna < dimension; columna++) {
                    matriz[fila][columna] = Integer.parseInt(numerosTexto[columna].trim());
                }
                fila++; 
            }
        } catch (IOException e) {
            System.out.println(" Error en la segunda lectura.");
        }

     
        System.out.println("MATRIZ TRANSPUESTA:");
        
       
        for (int columna = 0; columna < dimension; columna++) {
            for (int fila = 0; fila < dimension; fila++) {
                
               
                System.out.print(matriz[fila][columna] + "\t");
            }
            System.out.println(); 
        }
    }
}