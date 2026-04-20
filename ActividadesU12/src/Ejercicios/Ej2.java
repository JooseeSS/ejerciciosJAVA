package Ejercicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Ej2 {
	public static void main(String[] args) {
		List<Integer> listaIncial = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce números (repite algunos adrede). Escribe '0' para parar:");
		while (true) {
			System.out.print("Número: ");
			int n = Integer.parseInt(sc.nextLine());
			if (n==0) break;
			listaIncial.add(n);
		}
			System.out.println("La lista oriniginal es esta");
			System.out.println(listaIncial);
			
			
			Set<Integer> miSet = new HashSet<>(listaIncial);
			List<Integer> nuevaLista = new ArrayList<>(miSet);
			
			System.out.println("La lista sin repitidos es esta es esta");
			System.out.println(nuevaLista);
			
			
		
	}
	
}
