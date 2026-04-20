package ExamenAntesDeFeria;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class Ej1 {
	

		public static void main(String[] args) {
			// 1. CREAR LA COLECCIÓN (Nuestra caja mágica)
			// Usamos la interfaz List y la clase ArrayList (como dice el temario)
			List<Producto> inventario = new ArrayList<>();
			Scanner sc = new Scanner(System.in);
			boolean salir = false;

			while (!salir) {
				System.out.println("\n--- ALMACÉN CON ARRAYLIST ---");
				System.out.println("1. Alta de producto");
				System.out.println("2. Listar productos");
				System.out.println("3. Modificar producto");
				System.out.println("4. Borrar producto (con Iterator)");
				System.out.println("5. Salir");
				System.out.print("Elige una opción: ");
				String opcion = sc.nextLine().trim();

				if (opcion.equals("1")) {
					// --- ALTA (add) ---
					System.out.print("Código: ");
					int cod = Integer.parseInt(sc.nextLine());
					System.out.print("Nombre: ");
					String nom = sc.nextLine();
					System.out.print("Precio: ");
					double pre = Double.parseDouble(sc.nextLine());

					// Magia: no hay contadores, ni comprobamos si está lleno. Solo .add()
					inventario.add(new Producto(cod, nom, pre));
					System.out.println("✅ Producto añadido.");

				} else if (opcion.equals("2")) {
					// --- LISTAR (Recorrer) ---
					if (inventario.isEmpty()) { // Método directo para saber si está vacío
						System.out.println("El almacén está vacío.");
					} else {
						System.out.println("\n--- Lista de Productos ---");
						// Un for-each súper limpio
						for (Producto p : inventario) {
							System.out.println(p.toString());
						}
						System.out.println("Total productos: " + inventario.size());
					}

				} else if (opcion.equals("3")) {
					// --- MODIFICAR (Buscar y hacer Setters) ---
					System.out.print("Introduce el código del producto a modificar: ");
					int codBusqueda = Integer.parseInt(sc.nextLine());
					boolean encontrado = false;

					for (Producto p : inventario) {
						if (p.getCodigo() == codBusqueda) {
							System.out.print("Nuevo nombre: ");
							p.setNombre(sc.nextLine());
							System.out.print("Nuevo precio: ");
							p.setPrecio(Double.parseDouble(sc.nextLine()));
							System.out.println("✅ Producto actualizado.");
							encontrado = true;
							break; // Si lo encuentro, dejo de buscar
						}
					}
					if (!encontrado) System.out.println("❌ Producto no encontrado.");

				} else if (opcion.equals("4")) {
					// --- BORRAR (El Iterator del Temario) ---
					System.out.print("Introduce el código del producto a borrar: ");
					int codBorrar = Integer.parseInt(sc.nextLine());
					boolean borrado = false;

					// ⚠️ OJO AQUÍ: Forma obligatoria de borrar según el PDF de Pablo
					Iterator<Producto> it = inventario.iterator();
					while (it.hasNext()) { // Mientras queden elementos por revisar
						Producto p = it.next(); // Cogemos el siguiente
						if (p.getCodigo() == codBorrar) {
							it.remove(); // Lo borramos de forma segura
							borrado = true;
							System.out.println("✅ Producto borrado correctamente.");
							break;
						}
					}
					
					if (!borrado) System.out.println("❌ Producto no encontrado.");

				} else if (opcion.equals("5")) {
					salir = true;
				} else {
					System.out.println("Opción no válida.");
				}
			}
			sc.close();
		}
	}

