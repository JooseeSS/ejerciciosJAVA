package Ejercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ej4 {
	public static void main(String[] args) {
		Map<String, String> traductor = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		traductor.put("perro", "dog");
		traductor.put("gato", "cat");
		traductor.put("casa", "house");
		traductor.put("coche", "car");
		traductor.put("sol", "sun");
		traductor.put("luna", "moon");
		traductor.put("libro", "book");
		traductor.put("ordenador", "computer");
		traductor.put("manzana", "apple");
		traductor.put("mesa", "table");
		System.out.println("--- TRADUCTOR ESPAÑOL-INGLÉS ---");
		
		while(true) {
			System.out.println("Escribe una palabra en español para saber su traducción (o 'salir'):");
			String palabraBuscar = sc.nextLine().toLowerCase().trim();
			if(palabraBuscar.equals("salir"))break;
			
			String traduccion = traductor.get(palabraBuscar);
			if (traduccion != null) {
				System.out.println("✅ La traducción de '" + palabraBuscar + "' es: " + traduccion);
			} else {
				System.out.println("❌ Lo siento, esa palabra no está en nuestro diccionario.");
			}
		}
	}
	
}
