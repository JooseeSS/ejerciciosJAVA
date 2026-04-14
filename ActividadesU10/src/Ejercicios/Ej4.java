package Ejercicios;

import java.io.*;


public class Ej4 {

	public static void main(String[] args) {

		String nombreFichero = "carta.txt";

		
		int totalLineas = 0;
		int totalPalabras = 0;
		int totalCaracteres = 0;

		
		try (BufferedReader reader = new BufferedReader(new FileReader(nombreFichero))) {

			String linea;

			
			while ((linea = reader.readLine()) != null) {

				
				totalLineas++;

				
				totalCaracteres += linea.length();

				
				if (!linea.isEmpty()) {
				
					String[] palabras = linea.split(" ");

					
					totalPalabras += palabras.length;
				}
			}

			
			System.out.println("RESULTADOS DEL ANÁLISIS DE '" + nombreFichero + "':");
			System.out.println("----------------------------------------");
			System.out.println("- Número de líneas:     " + totalLineas);
			System.out.println("- Número de palabras:   " + totalPalabras);
			System.out.println("- Número de caracteres: " + totalCaracteres);
			System.out.println("----------------------------------------");

		} catch (IOException e) {
			System.out.println(" Error: No se ha podido leer el fichero '" + nombreFichero + "'.");
			System.out.println("Asegúrate de haber creado el archivo 'carta.txt' en la raíz de tu proyecto Maven.");
		}
	}
}
