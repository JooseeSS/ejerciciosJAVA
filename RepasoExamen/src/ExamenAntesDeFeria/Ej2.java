package ExamenAntesDeFeria;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ej2 {

	public static void main(String[] args) {
		// 1. CREAR LA COLECCIÓN VIP (El Set que no admite repetidos)
		// Fíjate que usamos la interfaz Set en la izquierda y la clase HashSet en la derecha
		Set<Producto> conjuntoVIP = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		boolean salir = false;

		while (!salir) {
			System.out.println("\n--- ALMACÉN CON HASHSET (Sin Repetidos) ---");
			System.out.println("1. Alta de producto");
			System.out.println("2. Listar productos");
			System.out.println("3. Borrar producto (con Iterator)");
			System.out.println("4. Salir");
			System.out.print("Elige una opción: ");
			String opcion = sc.nextLine().trim();

			if (opcion.equals("1")) {
				// --- ALTA (add con filtro automático) ---
				System.out.print("Código: ");
				int cod = Integer.parseInt(sc.nextLine());
				System.out.print("Nombre: ");
				String nom = sc.nextLine();
				System.out.print("Precio: ");
				double pre = Double.parseDouble(sc.nextLine());

				Producto nuevo = new Producto(cod, nom, pre);
				
				// MAGIA: El método .add() en un Set devuelve true si lo añade,
				// y devuelve false si ese producto ya existía (y lo ignora).
				boolean seHaAñadido = conjuntoVIP.add(nuevo);

				if (seHaAñadido) {
					System.out.println("✅ Producto añadido correctamente.");
				} else {
					System.out.println("❌ ERROR: Ya existe un producto con ese código. El Set lo ha rechazado.");
				}

			} else if (opcion.equals("2")) {
				// --- LISTAR ---
				if (conjuntoVIP.isEmpty()) {
					System.out.println("El almacén VIP está vacío.");
				} else {
					System.out.println("\n--- Lista VIP ---");
					for (Producto p : conjuntoVIP) {
						System.out.println(p.toString());
					}
					// OJO: Los Sets NO tienen orden. Al imprimir, saldrán mezclados.
				}

			} else if (opcion.equals("3")) {
				// --- BORRAR (El Iterator que le gusta a Pablo) ---
				System.out.print("Introduce el código del producto a borrar: ");
				int codBorrar = Integer.parseInt(sc.nextLine());
				boolean borrado = false;

				// Borramos exactamente igual que en el ArrayList
				Iterator<Producto> it = conjuntoVIP.iterator();
				while (it.hasNext()) {
					Producto p = it.next();
					if (p.getCodigo() == codBorrar) {
						it.remove(); 
						borrado = true;
						System.out.println("✅ Producto borrado.");
						break;
					}
				}
				
				if (!borrado) System.out.println("❌ No se encontró el producto.");

			} else if (opcion.equals("4")) {
				salir = true;
			} else {
				System.out.println("Opción no válida.");
			}
		}
		sc.close();
	}
}