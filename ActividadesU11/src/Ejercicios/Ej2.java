package Ejercicios;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ej2 {

	// Programa que lee un double de un archivo binario y lo muestra por consola
	public static void main(String[] args) {
		String nombreFichero = "numero.bin";

		// Abrir el flujo de entrada y leer el double
		try (FileInputStream fis = new FileInputStream(nombreFichero);
			 DataInputStream dis = new DataInputStream(fis)) {

			double valor = dis.readDouble();
			System.out.println("Número leído: " + valor);

		} catch (IOException e) {
			System.out.println("Error al leer el archivo: " + e.getMessage());
		}
	}

}
