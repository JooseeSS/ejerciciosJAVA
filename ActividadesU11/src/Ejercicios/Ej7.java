package Ejercicios;

import java.util.Scanner; 
import java.io.*; 

public class Ej7 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce una frase: ");
		String frase = sc.nextLine();
		sc.close(); 

		File fichero = new File("frase.bin");

		// Guardar la frase
		try (DataOutputStream dos = new DataOutputStream(
				new BufferedOutputStream(new FileOutputStream(fichero)))) {
			dos.writeUTF(frase);
			System.out.println("Frase guardada en: " + fichero.getAbsolutePath());
		} catch (IOException e) {
			System.err.println("Error al guardar la frase: " + e.getMessage());
			return;
		}

		
		try (java.io.DataInputStream dis = new java.io.DataInputStream(
				new java.io.BufferedInputStream(new java.io.FileInputStream(fichero)))) {
			String leida = dis.readUTF();
			System.out.println("Frase recuperada: " + leida);
		} catch (java.io.IOException e) {
			System.err.println("Error al leer la frase: " + e.getMessage());
		}
	}
}
