package Ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ej9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        String alfabetoNormal = "abcdefghijklmnopqrstuvwxyz";
        String alfabetoCifrado = "";

    
        try (BufferedReader readerCodec = new BufferedReader(new FileReader("codec.txt"))) {
            String lineaCodec = readerCodec.readLine();
            if (lineaCodec != null) {
                
                alfabetoCifrado = lineaCodec.replace(" ", "");
            }
        } catch (IOException e) {
            System.out.println(" Error: No se encuentra 'codec.txt' en la raíz del proyecto.");
            return;
        }

       
        System.out.print("Introduce el nombre del fichero a encriptar (o pulsa Intro para 'mensaje.txt'): ");
        String ficheroOrigen = sc.nextLine().trim();

        if (ficheroOrigen.isEmpty()) {
            ficheroOrigen = "mensaje.txt";
        }

    
        String ficheroDestino = "cifrado_" + ficheroOrigen;

       
        try (BufferedReader readerMensaje = new BufferedReader(new FileReader(ficheroOrigen));
             BufferedWriter writerDestino = new BufferedWriter(new FileWriter(ficheroDestino))) {

            String linea;
            while ((linea = readerMensaje.readLine()) != null) {

                linea = linea.toLowerCase();
                String lineaEncriptada = "";

                for (int i = 0; i < linea.length(); i++) {
                    char letraActual = linea.charAt(i);

                    int posicion = alfabetoNormal.indexOf(letraActual);

                    if (posicion != -1) {
                        lineaEncriptada += alfabetoCifrado.charAt(posicion);
                    } else {
                        lineaEncriptada += letraActual;
                    }
                }

              
                writerDestino.write(lineaEncriptada);
                writerDestino.newLine(); 
            }

            System.out.println("\n¡Mensaje encriptado con éxito!");
            System.out.println("Revisa el archivo: " + ficheroDestino);

        } catch (IOException e) {
            System.out.println("Error al procesar los ficheros. Asegúrate de que '" + ficheroOrigen + "' existe.");
        }

        sc.close();
    }
}