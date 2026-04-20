package Ejercicios;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ej5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una frase (pulsa Enter). Puedes repetir palabras:");
		String frase = sc.nextLine();
		// Normalizar: pasar a minúsculas y eliminar signos de puntuación comunes
		frase = frase.toLowerCase().replaceAll("[,.]", "");
		String[] palabras = frase.trim().split("\\s+");
		Map<String, Integer> contador = new HashMap<>();
		for (String p : palabras) {
			if (p == null || p.isEmpty()) {
				continue; // evitar entradas vacías
			}
			contador.put(p, contador.getOrDefault(p, 0) + 1);
		}

		if (contador.isEmpty()) {
			System.out.println("No se han encontrado palabras.");
			sc.close();
			return;
		}

		// Convertir el Map a una lista de entradas para poder ordenar por frecuencia
		List<Map.Entry<String, Integer>> lista = new java.util.ArrayList<>(contador.entrySet());
		// Ordenar por frecuencia descendente; en caso de empate, por orden alfabético
		lista.sort((a, b) -> {
			int cmp = Integer.compare(b.getValue(), a.getValue());
			if (cmp != 0) return cmp;
			return a.getKey().compareTo(b.getKey());
		});

		System.out.println("\nPalabra -> Frecuencia (ordenadas por frecuencia descendente):");
		for (Map.Entry<String, Integer> e : lista) {
			System.out.printf("%s -> %d\n", e.getKey(), e.getValue());
		}

		sc.close();
	}
}
