package Ejercicios;

public class Ej8 {

	// Ejercicio 8: Guardar texto línea a línea
	// Lee líneas por teclado hasta línea vacía, las guarda en un archivo
	// binario con writeUTF(linea). Luego lee todo el archivo y muestra
	// las líneas usando readUTF() hasta EOFException.
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		java.io.File fichero = new java.io.File("lineas.bin");

		System.out.println("Introduce líneas de texto. Pulsa Enter en línea vacía para terminar:");

		// Escribir líneas
		try (java.io.DataOutputStream dos = new java.io.DataOutputStream(
				new java.io.BufferedOutputStream(new java.io.FileOutputStream(fichero)))) {
			while (true) {
				String linea = sc.nextLine();
				if (linea == null || linea.isEmpty()) {
					break; // fin de la entrada
				}
				dos.writeUTF(linea);
			}
			System.out.println("Líneas guardadas en: " + fichero.getAbsolutePath());
		} catch (java.io.IOException e) {
			System.err.println("Error al guardar las líneas: " + e.getMessage());
			return;
		}

		// Leer y mostrar todas las líneas
		System.out.println("Contenido recuperado del archivo:");
		try (java.io.DataInputStream dis = new java.io.DataInputStream(
				new java.io.BufferedInputStream(new java.io.FileInputStream(fichero)))) {
			while (true) {
				try {
					String leida = dis.readUTF();
					System.out.println(leida);
				} catch (java.io.EOFException eof) {
					break; // fin del archivo
				}
			}
		} catch (java.io.FileNotFoundException e) {
			System.err.println("Archivo no encontrado: " + e.getMessage());
		} catch (java.io.IOException e) {
			System.err.println("Error al leer las líneas: " + e.getMessage());
		}
	}

}
