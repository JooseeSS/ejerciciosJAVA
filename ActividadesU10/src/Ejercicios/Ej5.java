package Ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ej5 {

    public static void main(String[] args) {
        String nombreFichero = "numeros.txt";

        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        boolean hayDatos = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(nombreFichero))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                linea = linea.trim();
                if (linea.isEmpty()) continue;
                int numeroActual = Integer.parseInt(linea);
                hayDatos = true;
                if (numeroActual > maximo) {
                    maximo = numeroActual;
                }
                if (numeroActual < minimo) {
                    minimo = numeroActual;
                }
            }
            if (hayDatos) {
                System.out.println(minimo);
                System.out.println(maximo);
            } else {
                System.out.println("El fichero no contiene números.");
            }
        } catch (IOException e) {
            System.err.println("Error leyendo el fichero: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Formato de número inválido en el fichero: " + e.getMessage());
        }
    }
}