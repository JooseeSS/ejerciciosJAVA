package Ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ej10 {

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
			System.out.println(" Error: No se encuentra 'codec.txt'.");
			return;
		}

		System.out.print("Introduce el fichero a decodificar (o pulsa Intro para 'cifrado_mensaje.txt'): ");
		String ficheroOrigen = sc.nextLine().trim();

		if (ficheroOrigen.isEmpty()) {
			ficheroOrigen = "cifrado_mensaje.txt";
		}

		String ficheroDestino = "descifrado_" + ficheroOrigen;

		try (BufferedReader readerMensaje = new BufferedReader(new FileReader(ficheroOrigen));
				BufferedWriter writerDestino = new BufferedWriter(new FileWriter(ficheroDestino))) {

			String linea;
			while ((linea = readerMensaje.readLine()) != null) {

				linea = linea.toLowerCase();
				String lineaDescifrada = "";

				for (int i = 0; i < linea.length(); i++) {
					char letraActual = linea.charAt(i);

					int posicion = alfabetoCifrado.indexOf(letraActual);

					if (posicion != -1) {
						lineaDescifrada += alfabetoNormal.charAt(posicion);
					} else {
						lineaDescifrada += letraActual;
					}
				}

				writerDestino.write(lineaDescifrada);
				writerDestino.newLine();
			}

			System.out.println("\n ¡Mensaje decodificado con éxito!");
			System.out.println(" Revisa el archivo: " + ficheroDestino);

		} catch (IOException e) {
			System.out.println(" Error: Asegúrate de que '" + ficheroOrigen + "' existe.");
		}

		sc.close();
	}
}