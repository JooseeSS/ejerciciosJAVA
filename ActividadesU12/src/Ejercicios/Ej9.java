package Ejercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		Map<String, Integer> inventario = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		inventario.put("ratón", 10);
		inventario.put("teclado", 5);
		inventario.put("monitor", 2);
		
		while (true) {
			System.out.println("Stock actual"+ inventario);
			System.out.println("Escribe el nombre del producto a gestionar (o 'salir'):");
			String producto = sc.nextLine().toLowerCase().trim();
			if(producto.equals("salir")) break;
			System.out.println("¿Cuántas unidades han llegado al almacén?");
			int cantidadNueva = Integer.parseInt(sc.nextLine());
			
			if(inventario.containsKey(producto)) {
				int stockViejo = inventario.get(producto);
				int stockTotal = stockViejo + cantidadNueva;
				inventario.put(producto, stockTotal);
				System.out.println("✅ Stock actualizado. Tenías " + stockViejo + " y ahora tienes " + stockTotal);
			}else {
				// Si el producto no existía, el put() simplemente lo crea de cero
				inventario.put(producto, cantidadNueva);
				System.out.println("✨ Producto nuevo registrado en el sistema.");
			}
		}
	}

}
