package es.iescamas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo1CrearArchivo {
	public static void main(String[] args) {

		try (BufferedWriter writer = new BufferedWriter(new FileWriter("datos.txt"))) {

			writer.write("Java");
			writer.newLine();
			writer.write("Archivos de texto");
			writer.newLine();
			writer.write("DAW y DAM");

			System.out.println("Archivo creado y datos escritos correctamente.");

		} catch (IOException e) {
			System.out.println("Error al escribir el archivo: " + e.getMessage());
		}
	}
}