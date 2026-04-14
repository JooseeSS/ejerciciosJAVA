package Ejercicios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ej4 {

	// Programa que guarda una tabla de n doubles en un archivo binario
	public static void main(String[] args) {
		String nombreFichero = "tabla.bin";

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Introduce la cantidad n de números: ");

			if (!sc.hasNextInt()) {
				System.out.println("Entrada no válida. Introduce un entero positivo.");
				return;
			}

			int n = sc.nextInt();
			if (n <= 0) {
				System.out.println("n debe ser un entero positivo.");
				return;
			}

			double[] tabla = new double[n];

			for (int i = 0; i < n; i++) {
				System.out.print("Introduce número " + (i + 1) + ": ");

				while (!sc.hasNextDouble()) {
					String token = sc.next();
					System.out.println("Entrada no válida: " + token + ". Introduce un número.");
					System.out.print("Introduce número " + (i + 1) + ": ");
				}

				tabla[i] = sc.nextDouble();
			}

			// Guardar n y los doubles en el fichero
			try (FileOutputStream fos = new FileOutputStream(nombreFichero);
				 DataOutputStream dos = new DataOutputStream(fos)) {
				dos.writeInt(n);
				for (int i = 0; i < n; i++) {
					dos.writeDouble(tabla[i]);
				}
				System.out.println("Tabla guardada en " + nombreFichero);
			} catch (IOException e) {
				System.out.println("Error al escribir el archivo: " + e.getMessage());
				return;
			}

		}

		// Leer y mostrar la tabla desde el fichero
		try (FileInputStream fis = new FileInputStream(nombreFichero);
			 DataInputStream dis = new DataInputStream(fis)) {

			int nLeido = dis.readInt();
			System.out.println("Números leídos desde " + nombreFichero + ":");
			for (int i = 0; i < nLeido; i++) {
				double v = dis.readDouble();
				System.out.println(v);
			}

		} catch (IOException e) {
			System.out.println("Error al leer el archivo: " + e.getMessage());
		}
	}

}
