package Ej13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
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

		// Crear algunos productos
		Producto[] lista = new Producto[] {
			new Producto(1, "Manzana", 0.50),
			new Producto(2, "Leche", 1.20),
			new Producto(3, "Pan", 0.90)
		};

		// Guardar productos en el fichero usando ObjectOutputStream
		try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fichero)))) {
			for (int i = 0; i < lista.length; i++) {
				oos.writeObject(lista[i]); // escribimos cada producto
			}
		} catch (IOException e) {
			System.err.println("Error al escribir productos: " + e.getMessage());
			return;
		}

		// Leer productos desde el fichero y mostrarlos
		System.out.println("Productos leídos del archivo:");
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