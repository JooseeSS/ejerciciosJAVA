package Ej15;

import java.io.*;
import java.util.Scanner;
import Ejercicios.Producto;


public class Main {
	public static void main(String[] args) {
		File fichero = new File("productos.bin");
		if (!fichero.exists()) {
			System.out.println("No existe el archivo productos.bin");
			return;
		}

		// Leer todos los productos en un array dinámico manual
		Producto[] productos = new Producto[10]; // capacidad inicial
		int contador = 0;
		try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fichero)))) {
			while (true) {
				try {
					Object obj = ois.readObject();
					if (obj instanceof Producto) {
						// añadir al array, ampliando si es necesario
						if (contador == productos.length) {
							Producto[] aux = new Producto[productos.length * 2];
							for (int i = 0; i < productos.length; i++) aux[i] = productos[i];
							productos = aux;
						}
						productos[contador++] = (Producto) obj;
					}
				} catch (EOFException eof) {
					break; // fin del fichero
				}
			}
		} catch (IOException | ClassNotFoundException e) {
			System.err.println("Error al leer productos: " + e.getMessage());
			return;
		}

		if (contador == 0) {
			System.out.println("El archivo no contiene productos.");
			return;
		}

		// Mostrar productos actuales
		System.out.println("Productos actuales:");
		for (int i = 0; i < contador; i++) {
			System.out.println(productos[i]);
		}

		// Pedir código a modificar
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el codigo del producto a modificar: ");
		int codigo = -1;
		try {
			codigo = Integer.parseInt(sc.nextLine().trim());
		} catch (NumberFormatException e) {
			System.out.println("Codigo no valido.");
			sc.close();
			return;
		}

		// Buscar producto por código
		int indice = -1;
		for (int i = 0; i < contador; i++) {
			if (productos[i].getCodigo() == codigo) {
				indice = i;
				break;
			}
		}

		if (indice == -1) {
			System.out.println("Producto con codigo " + codigo + " no encontrado.");
			sc.close();
			return;
		}

		// Preguntar qué modificar
		System.out.println("Producto seleccionado: " + productos[indice]);
		System.out.print("Modificar (1) Nombre o (2) Precio ? ");
		String opcion = sc.nextLine().trim();
		if (opcion.equals("1")) {
			System.out.print("Introduce nuevo nombre: ");
			String nuevoNombre = sc.nextLine();
			productos[indice].setNombre(nuevoNombre);
		} else if (opcion.equals("2")) {
			System.out.print("Introduce nuevo precio: ");
			try {
				double nuevoPrecio = Double.parseDouble(sc.nextLine().trim());
				productos[indice].setPrecio(nuevoPrecio);
			} catch (NumberFormatException e) {
				System.out.println("Precio no valido.");
				sc.close();
				return;
			}
		} else {
			System.out.println("Opcion no valida.");
			sc.close();
			return;
		}
		sc.close();

		// Reescribir todo el archivo con los productos actualizados
		try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fichero)))) {
			for (int i = 0; i < contador; i++) {
				oos.writeObject(productos[i]);
			}
		} catch (IOException e) {
			System.err.println("Error al escribir productos: " + e.getMessage());
			return;
		}

		// Mostrar productos tras la modificación
		System.out.println("Productos tras la modificacion:");
		for (int i = 0; i < contador; i++) {
			System.out.println(productos[i]);
		}
	}
}