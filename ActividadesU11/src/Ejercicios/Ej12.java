package Ejercicios;

import java.io.*;

public class Ej12 {

	// Ejercicio 12: Leer lista de Personas
	// Lee todos los objetos guardados en 'personas.bin' y los muestra.
	public static void main(String[] args) {
		File fichero = new File("personas.bin");
		if (!fichero.exists()) {
			System.out.println("No existe el archivo personas.bin");
			return;
		}

		try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fichero)))) {
			System.out.println("Personas leídas del archivo:");
			while (true) {
				try {
					Object obj = ois.readObject();
					if (obj == null) continue;
					// Si es un array (p. ej. Persona[]), imprimimos sus elementos
					if (obj.getClass().isArray()) {
						Object[] arr = (Object[]) obj;
						for (Object o : arr) {
							System.out.println(o);
						}
					} else {
						System.out.println(obj);
					}
				} catch (EOFException eof) {
					break; // fin del archivo
				}
			}
		} catch (IOException | ClassNotFoundException e) {
			System.err.println("Error al leer personas: " + e.getMessage());
		}
	}

}
