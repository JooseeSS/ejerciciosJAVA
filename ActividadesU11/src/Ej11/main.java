package Ej11;

import java.io.*;

import java.util.Scanner;


public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Cuántas personas quieres guardar?: ");
		int n = 0;
		try {
			n = Integer.parseInt(sc.nextLine().trim());
		} catch (NumberFormatException e) {
			System.out.println("Número no válido.");
			sc.close();
			return;
		}
		if (n <= 0) {
			System.out.println("Nada que guardar.");
			sc.close();
			return;
		}

		Persona[] personas = new Persona[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Persona " + (i + 1) + ":");
			System.out.print("  Nombre: ");
			String nombre = sc.nextLine().trim();
			System.out.print("  Edad: ");
			int edad = 0;
			try {
				edad = Integer.parseInt(sc.nextLine().trim());
			} catch (NumberFormatException e) {
				System.out.println("Edad no válida, se pone 0.");
			}
			System.out.print("  Email: ");
			String email = sc.nextLine().trim();
			personas[i] = new Persona(nombre, edad, email);
		}

		File fichero = new File("personas.bin");

		// Guardar array de personas
		try (ObjectOutputStream oos = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(fichero)))) {
			oos.writeObject(personas);
			System.out.println("Personas guardadas en: " + fichero.getAbsolutePath());
		} catch (IOException e) {
			System.err.println("Error al guardar personas: " + e.getMessage());
			sc.close();
			return;
		}

		// Recuperar y mostrar
		try (ObjectInputStream ois = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream(fichero)))) {
			Object obj = ois.readObject();
			if (obj instanceof Persona[]) {
				Persona[] leidas = (Persona[]) obj;
				System.out.println("Personas recuperadas:");
				for (Persona p : leidas) {
					System.out.println(p);
				}
			} else {
				System.out.println("Formato de archivo no esperado.");
			}
		} catch (IOException | ClassNotFoundException e) {
			System.err.println("Error al leer personas: " + e.getMessage());
		}

		sc.close();
	}
}
