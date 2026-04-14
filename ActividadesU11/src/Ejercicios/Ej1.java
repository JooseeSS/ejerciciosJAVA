package Ejercicios;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ej1 {

	// Programa que lee un double por consola y lo guarda en un archivo binario
	public static void main(String[] args) {
		String nombreFichero = "numero.bin";

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Introduce un número decimal: ");

			if (!sc.hasNextDouble()) {
				System.out.println("Entrada no válida. Por favor introduce un número decimal.");
				return;
			}

			double valor = sc.nextDouble();

			// Abrir el flujo de salida y escribir el double en binario
			try (FileOutputStream fos = new FileOutputStream(nombreFichero);
				 DataOutputStream dos = new DataOutputStream(fos)) {
				dos.writeDouble(valor);
				System.out.println("Número guardado en " + nombreFichero);
			} catch (IOException e) {
				System.out.println("Error al escribir el archivo: " + e.getMessage());
			}

		}

	}

}
