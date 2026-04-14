package Ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ej7 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
       
        System.out.print("Introduce el nombre del fichero a leer: ");
        String nombreFichero = sc.nextLine().trim();

       
        if (nombreFichero.isEmpty()) {
            nombreFichero = "firmas.txt";
            System.out.println("Usando fichero por defecto: " + nombreFichero);
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(nombreFichero))) {
            
            String linea;
            int contadorLineas = 0; 
            int lineasTotalesLeidas = 0; 

            System.out.println("\n--- INICIO DEL DOCUMENTO ---");
            
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
                contadorLineas++;
                lineasTotalesLeidas++;

              
                if (contadorLineas == 24) {
                    System.out.println("\n--- [Pausa: Línea 24] Pulse INTRO para continuar o escriba 'q' para salir ---");
                    
                    String respuesta = sc.nextLine();
                    
                   
                    if (respuesta.equalsIgnoreCase("q")) {
                        System.out.println("Lectura interrumpida por el usuario.");
                        break; 
                    }
                    
                   
                    contadorLineas = 0; 
                }
            }
            
            System.out.println("\n--- FIN DEL DOCUMENTO (Total: " + lineasTotalesLeidas + " líneas) ---");

        } catch (IOException e) {
            System.out.println(" Error: No se ha podido leer el fichero '" + nombreFichero + "'.");
        }
        
        sc.close();
    }
}