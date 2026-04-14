package Ejercicios;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ej5 {

	// Programa que lee un array de doubles desde un archivo binario y lo muestra
	public static void main(String[] args) {
		String nombreFichero = "tabla.bin";

		try (FileInputStream fis = new FileInputStream(nombreFichero);
			 DataInputStream dis = new DataInputStream(fis)) {

			int n = dis.readInt();
			System.out.println("Tabla leída de " + nombreFichero + ":");
			for (int i = 0; i < n; i++) {
				double v = dis.readDouble();
				System.out.println(v);
			}

		} catch (IOException e) {
			System.out.println("Error al leer el archivo: " + e.getMessage());
		}
	}

}
