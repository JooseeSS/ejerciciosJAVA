package Ejercicios;

import java.io.*;
import java.util.Scanner;

// CRUD completo para la clase Producto usando un fichero binario productos.bin
public class Ej16 {

	public static void main(String[] args) {
		File fichero = new File("productos.bin");
		Scanner sc = new Scanner(System.in);

		while (true) {
			// Mostrar menu
			System.out.println("\n--- MENU PRODUCTOS ---");
			System.out.println("1. Alta (crear producto)");
			System.out.println("2. Listar productos");
			System.out.println("3. Modificar producto");
			System.out.println("4. Borrar producto");
			System.out.println("5. Salir");
			System.out.print("Elige una opcion: ");
			String opt = sc.nextLine().trim();

			if (opt.equals("1")) {
				// Alta: leer todos, añadir nuevo, reescribir
				Producto[] lista = leerProductos(fichero);
				int contador = cuenta(lista);

				System.out.print("Codigo: ");
				int codigo;
				try { codigo = Integer.parseInt(sc.nextLine().trim()); } catch (Exception e) { System.out.println("Codigo no valido."); continue; }

				// comprobar que no exista
				if (buscarIndice(lista, contador, codigo) != -1) {
					System.out.println("Ya existe un producto con ese codigo.");
					continue;
				}

				System.out.print("Nombre: ");
				String nombre = sc.nextLine();
				System.out.print("Precio: ");
				double precio;
				try { precio = Double.parseDouble(sc.nextLine().trim()); } catch (Exception e) { System.out.println("Precio no valido."); continue; }

				// ampliar array si hace falta y añadir
				if (contador == lista.length) {
					Producto[] aux = new Producto[lista.length * 2];
					for (int i = 0; i < lista.length; i++) aux[i] = lista[i];
					lista = aux;
				}
				lista[contador++] = new Producto(codigo, nombre, precio);

				if (escribirProductos(fichero, lista, contador)) {
					System.out.println("Producto añadido correctamente.");
				}

			} else if (opt.equals("2")) {
				// Listar
				Producto[] lista = leerProductos(fichero);
				int contador = cuenta(lista);
				if (contador == 0) {
					System.out.println("No hay productos.");
				} else {
					System.out.println("Productos:\n");
					for (int i = 0; i < contador; i++) System.out.println(lista[i]);
				}

			} else if (opt.equals("3")) {
				// Modificar por codigo
				Producto[] lista = leerProductos(fichero);
				int contador = cuenta(lista);
				if (contador == 0) { System.out.println("No hay productos."); continue; }

				System.out.print("Introduce codigo a modificar: ");
				int codigo;
				try { codigo = Integer.parseInt(sc.nextLine().trim()); } catch (Exception e) { System.out.println("Codigo no valido."); continue; }

				int idx = buscarIndice(lista, contador, codigo);
				if (idx == -1) { System.out.println("Producto no encontrado."); continue; }

				System.out.println("Producto: " + lista[idx]);
				System.out.print("Modificar (1) Nombre (2) Precio: ");
				String opcion = sc.nextLine().trim();
				if (opcion.equals("1")) {
					System.out.print("Nuevo nombre: ");
					String nuevo = sc.nextLine();
					lista[idx].setNombre(nuevo);
				} else if (opcion.equals("2")) {
					System.out.print("Nuevo precio: ");
					try { double p = Double.parseDouble(sc.nextLine().trim()); lista[idx].setPrecio(p); } catch (Exception e) { System.out.println("Precio no valido."); continue; }
				} else { System.out.println("Opcion no valida."); continue; }

				if (escribirProductos(fichero, lista, contador)) {
					System.out.println("Producto modificado correctamente.");
				}

			} else if (opt.equals("4")) {
				// Borrar por codigo
				Producto[] lista = leerProductos(fichero);
				int contador = cuenta(lista);
				if (contador == 0) { System.out.println("No hay productos."); continue; }

				System.out.print("Introduce codigo a borrar: ");
				int codigo;
				try { codigo = Integer.parseInt(sc.nextLine().trim()); } catch (Exception e) { System.out.println("Codigo no valido."); continue; }

				int idx = buscarIndice(lista, contador, codigo);
				if (idx == -1) { System.out.println("Producto no encontrado."); continue; }

				// desplazar elementos hacia la izquierda
				for (int i = idx; i < contador - 1; i++) lista[i] = lista[i + 1];
				lista[contador - 1] = null;
				contador--;

				if (escribirProductos(fichero, lista, contador)) {
					System.out.println("Producto borrado correctamente.");
				}

			} else if (opt.equals("5")) {
				System.out.println("Saliendo...");
				break;
			} else {
				System.out.println("Opcion no valida.");
			}
		}

		sc.close();
	}

	// Lee todos los productos del fichero y devuelve un array (capacidad puede ser mayor que los elementos reales)
	private static Producto[] leerProductos(File fichero) {
		Producto[] productos = new Producto[10];
		int contador = 0;
		if (!fichero.exists()) return productos;

		try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fichero)))) {
			while (true) {
				try {
					Object obj = ois.readObject();
					if (obj instanceof Producto) {
						if (contador == productos.length) {
							Producto[] aux = new Producto[productos.length * 2];
							for (int i = 0; i < productos.length; i++) aux[i] = productos[i];
							productos = aux;
						}
						productos[contador++] = (Producto) obj;
					}
				} catch (EOFException eof) {
					break;
				}
			}
		} catch (IOException | ClassNotFoundException e) {
			System.err.println("Error al leer productos: " + e.getMessage());
		}
		return productos;
	}

	// Cuenta elementos no nulos en el array
	private static int cuenta(Producto[] lista) {
		int c = 0;
		for (int i = 0; i < lista.length; i++) if (lista[i] != null) c++; else break;
		return c;
	}

	// Buscar indice por codigo, -1 si no existe
	private static int buscarIndice(Producto[] lista, int contador, int codigo) {
		for (int i = 0; i < contador; i++) if (lista[i] != null && lista[i].getCodigo() == codigo) return i;
		return -1;
	}

	// Escribe los primeros 'contador' productos en el fichero (sobrescribe)
	private static boolean escribirProductos(File fichero, Producto[] lista, int contador) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fichero)))) {
			for (int i = 0; i < contador; i++) oos.writeObject(lista[i]);
			return true;
		} catch (IOException e) {
			System.err.println("Error al escribir productos: " + e.getMessage());
			return false;
		}
	}

}
