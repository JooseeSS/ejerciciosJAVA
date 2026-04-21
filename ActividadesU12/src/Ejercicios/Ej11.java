package Ejercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		Map<String, String> agenda = new HashMap<>();
		agenda.put("Pedro", "600111222");
		agenda.put("Pepe", "600333444");
		agenda.put("Ana", "600555666");
		agenda.put("Penélope", "600777888");
		agenda.put("Juan", "600999000");
		Scanner sc = new Scanner(System.in);
		System.out.println("--- BUSCADOR DE CONTACTOS ---");
		System.out.print("Introduce unas letras para buscar (ej: pe): ");
		String busqueda = sc.nextLine().toLowerCase().trim();
		System.out.println("\nResultados encontrados para '" + busqueda + "':");
		boolean encontrado = false;
for (Map.Entry<String, String> pareja : agenda.entrySet()) {
			
			// Guardamos la clave (nombre) en una variable para que el código se lea mejor
			String nombreContacto = pareja.getKey();
			
			// Lo pasamos a minúsculas y miramos si contiene las letras que buscamos
			if (nombreContacto.toLowerCase().contains(busqueda)) {
				
				// Si coincide, imprimimos la clave y el valor
				System.out.println("📞 " + nombreContacto + " - " + pareja.getValue());
				encontrado = true;
			}
		}

		// Si después de dar toda la vuelta al bucle no hemos encontrado a nadie...
		if (!encontrado) {
			System.out.println("❌ No hay nadie que contenga esas letras en su nombre.");
		}

	}

}
