package Ejercicios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ej3 {

	// Programa que solicita enteros no negativos, los guarda en un archivo
	// y al finalizar (número negativo) muestra todos los números guardados.
	public static void main(String[] args) {
		String nombreFichero = "enteros.bin";

		try (Scanner sc = new Scanner(System.in);
			 FileOutputStream fos = new FileOutputStream(nombreFichero);
			 DataOutputStream dos = new DataOutputStream(fos)) {

			System.out.println("Introduce números enteros (negativo para terminar):");

			while (true) {
				System.out.print("Número: ");

				if (!sc.hasNextInt()) {
					// Si la entrada no es un entero, consumir token y avisar
					String token = sc.next();
					System.out.println("Entrada no válida: " + token + ". Introduce un entero.");
					continue;
				}

				int num = sc.nextInt();
				if (num < 0) {
					break; // termina al introducir un número negativo
				}

				dos.writeInt(num);
			}

		} catch (IOException e) {
			System.out.println("Error al escribir el archivo: " + e.getMessage());
			return;
		}

		// Leer y mostrar los enteros guardados
		System.out.println("Números guardados en " + nombreFichero + ":");
		try (FileInputStream fis = new FileInputStream(nombreFichero);
			 DataInputStream dis = new DataInputStream(fis)) {

			while (true) {
				try {
					int valor = dis.readInt();
					System.out.println(valor);
				} catch (EOFException eof) {
					break; // fin del fichero
				}
			}

		} catch (IOException e) {
			System.out.println("Error al leer el archivo: " + e.getMessage());
		}
	}

}
