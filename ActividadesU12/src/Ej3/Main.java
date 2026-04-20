package Ej3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<Alumno> alumnos = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Gestion de alumnos, cuantos alumno quiere registrar");
		int nAlumnos = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < nAlumnos; i++) {
			System.out.println("Datos del alumno " + i + ":");
			System.out.println("Nombre: ");
			String nombre = sc.nextLine();
			System.out.println("Nota: ");
			double nota = Double.parseDouble(sc.nextLine());
			alumnos.add(new Alumno(nombre, nota));

		}
		double sumaNotas = 0;
		System.out.println("Alumnos aprobados");
for (Alumno alumno : alumnos) {
	sumaNotas+=alumno.getNota();
	if(alumno.getNota()>=5) {
		System.out.println("El alumno con nombre " + alumno.getNomnbre() + " y con una nota de " + alumno.getNota() + " ha aprobado");
	}
}
System.out.println("La media de todo los alumnos es de:");
double media = sumaNotas/alumnos.size();
System.out.println(media);
	}

}
