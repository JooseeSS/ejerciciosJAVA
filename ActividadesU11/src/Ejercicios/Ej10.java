package Ejercicios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ej10 {

	// Ejercicio 10 (versión básica): Registro de llamadas con menú
	// Solo uso streams binarios (DataOutputStream / DataInputStream).
	// No uso colecciones ni serialización avanzada.

	private static final String FICHERO = "registros.bin";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println();
			System.out.println("--- Menú Registro de llamadas ---");
			System.out.println("1. Añadir registro");
			System.out.println("2. Ver registros");
			System.out.println("3. Salir");
			System.out.print("Elige una opción: ");

			String opcion = sc.nextLine().trim();

			if (opcion.equals("1")) {
				System.out.print("Introduce la jornada (ej: 2026-04-15 o mañana): ");
				String jornada = sc.nextLine().trim();
				System.out.print("Número de llamadas: ");
				int llamadas = 0;
				try {
					llamadas = Integer.parseInt(sc.nextLine().trim());
				} catch (NumberFormatException e) {
					System.out.println("Número no válido. Registro cancelado.");
					continue;
				}

				// Guardar el registro al final del archivo (append)
				try (DataOutputStream dos = new DataOutputStream(
						new BufferedOutputStream(new FileOutputStream(FICHERO, true)))) {
					dos.writeUTF(jornada);
					dos.writeInt(llamadas);
					System.out.println("Registro guardado.");
				} catch (IOException e) {
					System.err.println("Error al guardar registro: " + e.getMessage());
				}

			} else if (opcion.equals("2")) {
				File f = new File(FICHERO);
				if (!f.exists()) {
					System.out.println("No hay registros guardados.");
					continue;
				}

				// Leer registros secuencialmente hasta EOF
				try (DataInputStream dis = new DataInputStream(
						new BufferedInputStream(new FileInputStream(f)))) {
					System.out.println("Registros:");
					int contador = 0;
					while (true) {
						try {
							String jornada = dis.readUTF();
							int llamadas = dis.readInt();
							contador++;
							System.out.println(contador + ". Jornada: " + jornada + " - Llamadas: " + llamadas);
						} catch (EOFException eof) {
							break; // fin del archivo
						}
					}
					if (contador == 0) {
						System.out.println("(archivo vacío)");
					}
				} catch (IOException e) {
					System.err.println("Error al leer registros: " + e.getMessage());
				}

			} else if (opcion.equals("3")) {
				System.out.println("Saliendo...");
				break;
			} else {
				System.out.println("Opción no válida. Intenta de nuevo.");
			}
		}

		sc.close();
	}

}
