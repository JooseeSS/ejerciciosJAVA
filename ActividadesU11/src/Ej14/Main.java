package Ej14;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import Ejercicios.Producto;
public class Main {

	public static void main(String[] args) {
		File fichero = new File("productos.bin");

		// Nuevos productos a añadir
		Producto[] nuevos = new Producto[] {
			new Producto(4, "Queso", 2.50),
			new Producto(5, "Huevos", 1.80)
		};

		// Determinar si hay que abrir en modo anexar sin header
		boolean anexar = fichero.exists() && fichero.length() > 0;

		// Escribir (anexar o crear) los nuevos productos
		try (FileOutputStream fos = new FileOutputStream(fichero, true);
			 ObjectOutputStream oos = anexar ? new MiObjectOutputStream(fos) : new ObjectOutputStream(fos)) {
			for (int i = 0; i < nuevos.length; i++) {
				oos.writeObject(nuevos[i]); // escribimos cada producto
			}
		} catch (IOException e) {
			System.err.println("Error al anexar productos: " + e.getMessage());
			return;
		}

		// Mostrar contenido del fichero después de anexar
		System.out.println("Productos en el archivo tras anexar:");
		try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fichero)))) {
			while (true) {
				try {
					Object obj = ois.readObject();
					if (obj instanceof Producto) {
						System.out.println(obj);
					}
				} catch (EOFException eof) {
					break; // fin del fichero
				}
			}
		} catch (IOException | ClassNotFoundException e) {
			System.err.println("Error al leer productos: " + e.getMessage());
		}
	}
}