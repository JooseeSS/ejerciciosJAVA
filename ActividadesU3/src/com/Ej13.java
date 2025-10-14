package com;
import java.util.*;
public class Ej13 {

	public static void main(String[] args) {
/*Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.*/
Scanner sc = new  Scanner(System.in);
int cont=0, sus=0, apro=0, cond=0;
do {
	System.out.println("Escribe una nota del alumno");
	double nota = sc.nextDouble();
	cont++;
	if (nota >= 4 && nota < 5) {
		cond++;
	} else if (nota >= 5) {
		apro++;
	} else {
		sus++;
		
	}
} while (cont < 6);
System.out.println("Hay " + apro + " alumnos aprobados, " + cond + " alumnos condicionados y " + sus + " alumnos suspensos.");
sc.close();
	}

}
