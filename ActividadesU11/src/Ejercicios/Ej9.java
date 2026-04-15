package Ejercicios;

import java.util.Random; // para generar aleatorios
import java.util.Arrays; // para ordenar el array
import java.io.*; // para streams de entrada/salida

public class Ej9 {

	// Ejercicio 9: Crear tabla de 10 enteros aleatorios ordenados
	// - Genero 10 enteros aleatorios < 100
	// - Los ordeno con Arrays.sort
	// - Los guardo en un archivo binario usando DataOutputStream.writeInt
	// - Los recupero con DataInputStream.readInt y los muestro
	public static void main(String[] args) {
		final int N = 10;
		int[] tabla = new int[N];

		Random rnd = new Random();

		// Generar los números aleatorios
		for (int i = 0; i < N; i++) {
			tabla[i] = rnd.nextInt(100); // 0..99
		}

		// Mostrar generados
		System.out.println("Números generados:");
		System.out.println(Arrays.toString(tabla));

		// Ordenar
		Arrays.sort(tabla);
		System.out.println("Números ordenados:");
		System.out.println(Arrays.toString(tabla));

		File fichero = new File("enteros.bin");

		// Guardar en archivo (primero la longitud, luego los enteros)
		try (DataOutputStream dos = new DataOutputStream(
				new BufferedOutputStream(new FileOutputStream(fichero)))) {
			dos.writeInt(N); // guardo la cantidad para facilitar la lectura
			for (int v : tabla) {
				dos.writeInt(v);
			}
			System.out.println("Tabla guardada en: " + fichero.getAbsolutePath());
		} catch (IOException e) {
			System.err.println("Error al guardar la tabla: " + e.getMessage());
			return;
		}

		// Recuperar y mostrar
		System.out.println("Recuperando tabla desde el archivo:");
		try (DataInputStream dis = new DataInputStream(
				new BufferedInputStream(new FileInputStream(fichero)))) {
			int len = dis.readInt();
			int[] leida = new int[len];
			for (int i = 0; i < len; i++) {
				leida[i] = dis.readInt();
			}
			System.out.println(Arrays.toString(leida));
		} catch (FileNotFoundException e) {
			System.err.println("Archivo no encontrado: " + e.getMessage());
		} catch (IOException e) {
			System.err.println("Error al leer la tabla: " + e.getMessage());
		}
	}

}
