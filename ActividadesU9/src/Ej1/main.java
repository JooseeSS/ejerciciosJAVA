package Ej1;

import java.util.*;

public class main {
	public static void main(String[] args) {
		List<Imprimible> lista_imprimible = new ArrayList<>();
		lista_imprimible.add(new Factura(12, "Juan Lopez", 100));
		lista_imprimible.add(new Informe("Las lagunas", "Andres lopez", 1023));
		lista_imprimible.add(new Informe("Los altos", "Fran lopez", 123));
		lista_imprimible.add(new Factura(45, "Jose lorca", 23));


		for (Imprimible i : lista_imprimible) {
			System.out.println(i.imprimir());
		}
		/*
		Factura f = new Factura(101, "Tech Solutions", 1500.50);
		Informe i = new Informe("Tendencias IA 2026", "Gemini", 45);
		Factura f2 = new Factura(102, "Café del Puerto", 12.80);

		Imprimible[] imprimibles = { f, i, f2 };

		System.out.println("--- Listado de Documentos ---");
		for (Imprimible im : imprimibles) {
			System.out.println(im.imprimir());
		}

*/
	}
}