package es.iescamas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo2LeerArchivo {
	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new FileReader("datos.txt"))) {

			String linea;

			while ((linea = reader.readLine()) != null) {
				System.out.println("Línea leída: " + linea);
			}

		} catch (IOException e) {
			System.out.println("Error al leer el archivo: " + e.getMessage());
		}
	}
}