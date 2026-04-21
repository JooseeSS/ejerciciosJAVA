package Ejercicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ej7 {
	public static void main(String[] args) {
		List<Alumno> clase = new ArrayList<>();
		clase.add(new Alumno("Pepe", 4.5));
		clase.add(new Alumno("María", 9.0));
		clase.add(new Alumno("Juan", 7.5));
		clase.add(new Alumno("Lucía", 3.0));
		clase.add(new Alumno("Carlos", 6.0));
		System.out.println("Lista sin ordenar");
		for (Alumno a : clase) {
			System.out.println(a.getNomnbre() + " - " + a.getNota());
		}
		//menor a mayor
		clase.sort(Comparator.comparing(Alumno::getNota));
		System.out.println("Lista ordenada");
		for (Alumno a : clase) {
			System.out.println(a);
		}
		//mayor a menor
		clase.sort(Comparator.comparing(Alumno::getNota).reversed());
		for (Alumno a : clase) {
			System.out.println(a);
		}
	}
}
