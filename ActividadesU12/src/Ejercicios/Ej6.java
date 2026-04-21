package Ejercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ej6 {
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			numeros.add(i);
		}
		System.out.println("Lista original" + numeros);
		
		Iterator<Integer> miLista = numeros.iterator();
		while (miLista.hasNext()) {
			int n = miLista.next();
			if(n%2==0) {
				miLista.remove();
			}
		}
		System.out.println("Lista sin pares: " +numeros) ;
	}
}
