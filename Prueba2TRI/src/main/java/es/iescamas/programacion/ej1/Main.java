package es.iescamas.programacion.ej1;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		LIbro[] misLibros = { new LIbro("Los Gladiadores", "Aitana Soriano ", 2006, 21.10),
				new LIbro("Vida y Placeres", "Juan Serrano ", 1889, 57.80)};
		
		
		
		if(misLibros[0].getAnyo()>misLibros[1].getAnyo()) {
			System.out.println("El libro con el titulo "+ misLibros[1].getTitulo()+" es mas antiguo" );
		}else if (misLibros[0].getAnyo()<misLibros[1].getAnyo()) {
			System.out.println("El libro con el titulo "+ misLibros[0].getTitulo()+" es mas antiguo" );
		}else
			System.out.println("Misma edición");
		
		for (LIbro lIbro : misLibros) {
			System.out.println("Precio del libro " + lIbro.getTitulo()+" con los descuentos del 5 %, 10 %, 15 % y 20 % ");
			System.out.println(lIbro.getPrecio()-(lIbro.getPrecio()*0.05 ));
			System.out.println(lIbro.getPrecio()-(lIbro.getPrecio()*0.1 ));
			System.out.println(lIbro.getPrecio()-(lIbro.getPrecio()*0.15 ));
			System.out.println(lIbro.getPrecio()-(lIbro.getPrecio()*0.20));
			
		}
	}

}
