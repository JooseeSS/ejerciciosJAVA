package Ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Ej10 {

	public static void main(String[] args) {
		List<Integer> lista1 = new ArrayList<>(List.of(4,6,12,5,2,3,3));
		List<Integer> lista2 = new ArrayList<>(List.of(4,8,2,15,65,21,3));
		System.out.println("--- ANTES DE LA FUSIÓN ---");
		System.out.println("Lista 1: " + lista1);
		System.out.println("Lista 2: " + lista2);
		
		Set<Integer> ordenado = new TreeSet<>();
		ordenado.addAll(lista1);
		ordenado.addAll(lista2);
		
		List<Integer> listaOr = new ArrayList<>(ordenado);
		System.out.println("\n--- RESULTADO FINAL ---");
		System.out.println("Lista fusionada, limpia y ordenada: " + listaOr);

	}

}
