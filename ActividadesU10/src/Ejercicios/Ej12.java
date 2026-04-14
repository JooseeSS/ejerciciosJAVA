package Ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ej12 {

    public static void main(String[] args) {
        
        String fichero1 = "texto1.txt";
        String fichero2 = "texto2.txt";

        
        try (BufferedReader br1 = new BufferedReader(new FileReader(fichero1));
             BufferedReader br2 = new BufferedReader(new FileReader(fichero2))) {

            String linea1;
            String linea2;
            int contadorLinea = 1;
            boolean sonIguales = true;

           
            while (true) {
                linea1 = br1.readLine();
                linea2 = br2.readLine();

              
                if (linea1 == null && linea2 == null) {
                    break; 
                }

               
                if (linea1 == null || linea2 == null) {
                    System.out.println("Los archivos son DIFERENTES.");
                    System.out.println("- La diferencia empieza en la línea: " + contadorLinea);
                    System.out.println("- Carácter: 1 (Un archivo es más largo que el otro)");
                    sonIguales = false;
                    break;
                }

                
                if (!linea1.equals(linea2)) {
                    System.out.println(" Los archivos son DIFERENTES.");
                    System.out.println("- Primera diferencia en la LÍNEA: " + contadorLinea);

                    
                    int limite = Math.min(linea1.length(), linea2.length());
                    int posicionFallo = -1;

                 
                    for (int i = 0; i < limite; i++) {
                        if (linea1.charAt(i) != linea2.charAt(i)) {
                            
                            posicionFallo = i + 1; 
                            break; 
                        }
                    }

                   
                    if (posicionFallo == -1) {
                        posicionFallo = limite + 1;
                    }

                    System.out.println("- Diferencia en el CARÁCTER: " + posicionFallo);
                    
                    sonIguales = false;
                    break; 
                }

                
                contadorLinea++;
            }

          
            if (sonIguales) {
                System.out.println(" Los archivos son EXACTAMENTE IGUALES.");
            }

        } catch (IOException e) {
            System.out.println(" Error al leer los ficheros. Asegúrate de que existen.");
        }
    }
}