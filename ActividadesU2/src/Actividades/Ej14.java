package Actividades;

import java.util.*;

public class Ej14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Crear una aplicación que solicite al usuario una fecha (día, mes y año) y
		 * muestre la fecha correspondiente al día siguiente.
		 */
		System.out.println("Dime un dia del año");
		int dia = sc.nextInt();

		System.out.println("Dime un mes del año");
		int mes = sc.nextInt();

		System.out.println("Dime un año");
		int ano = sc.nextInt();

		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10) {

			if (dia == 31) {
				dia = 1;
				mes++;

			} else {
				dia++;

			}

		} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			if (dia == 30) {
				dia = 1;
				mes++;

			} else {
				dia++;

			}
		} else if (mes == 12) {
			if (dia == 31) {
				dia = 1;
				mes = 1;
				ano++;

			} else {
				dia++;

			}
		} else if (mes == 2) {
			if (dia == 28) {
				dia = 1;
				mes++;

			} else {
				dia++;

			}
		}

		System.out.println("El dia siguiente es el " + dia + "/" + mes + "/" + ano);
	}
}