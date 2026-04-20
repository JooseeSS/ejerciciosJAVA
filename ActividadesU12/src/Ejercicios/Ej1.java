package Ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej1 {
	public static void main(String[] args) {
		
		List<Integer> numeros = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		for(int i= 0; i<10;i++) {
			System.out.println("Escribe el numero " + i + ":");
			try {
				int n = Integer.parseInt(sc.nextLine());
				numeros.add(n);
			} catch (NumberFormatException e) {
				System.out.println("Eso no es un número válido. Inténtalo de nuevo.");
				i--;
			}
			
			
		}
		
		System.out.println("NUMEROS DE LA LISTA");
		for (Integer integer : numeros) {
			System.out.println(integer);
		}
		System.out.println("La media total de la lista es:");
		double suma = 0;
		for (Integer integer : numeros) {
			suma+=integer;
		}
		double media = suma/numeros.size();
		System.out.println(media);
	}
	
}
