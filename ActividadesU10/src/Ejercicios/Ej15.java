package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ej15 {

	public static void main(String[] args) {
		if (args.length >= 2) {
			String filePath = args[0];
			// If user passed more than 2 args, join the rest as the search string
			StringBuilder sb = new StringBuilder();
			for (int i = 1; i < args.length; i++) {
				if (i > 1) sb.append(' ');
				sb.append(args[i]);
			}
			String search = sb.toString();
			performSearch(filePath, search);
		} else {
			// Interactive mode
			interactiveMode();
		}
	}

	private static void interactiveMode() {
		try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8))) {
			System.out.print("Fichero: ");
			String filePath = in.readLine();
			System.out.print("Cadena de búsqueda: ");
			String search = in.readLine();
			performSearch(filePath, search);
		} catch (IOException e) {
			System.err.println("Error leyendo entrada: " + e.getMessage());
		}
	}

	private static void performSearch(String filePath, String search) {
		if (filePath == null || filePath.trim().isEmpty()) {
			System.err.println("Ruta de fichero vacía.");
			return;
		}
		if (search == null || search.isEmpty()) {
			System.err.println("La cadena de búsqueda no puede estar vacía.");
			return;
		}

		Path path = Paths.get(filePath);
		if (!Files.exists(path)) {
			System.err.println("El fichero no existe: " + filePath);
			return;
		}

		int lineNumber = 0;
		int total = 0;
		try (BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
			String line;
			while ((line = br.readLine()) != null) {
				lineNumber++;
				int fromIndex = 0;
				// Search for all (including overlapping) occurrences in the line
				while (fromIndex <= line.length() - search.length()) {
					int idx = line.indexOf(search, fromIndex);
					if (idx == -1) break;
					// Columns are 1-based
					System.out.printf("Encontrado en fila %d, columna %d%n", lineNumber, idx + 1);
					total++;
					// allow overlapping occurrences by advancing only one position
					fromIndex = idx + 1;
				}
			}
			System.out.println("Total de ocurrencias: " + total);
		} catch (IOException e) {
			System.err.println("Error leyendo el fichero: " + e.getMessage());
		}
	}

}
