package Actividades;
import java.util.*;
public class Ej9 {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entre 0 y 99.999: ");
        int numero = scanner.nextInt();

        if (numero < 0 || numero > 99999) {
            System.out.println("Número fuera de rango.");
        } else if (numero < 10) {
            System.out.println("El número tiene 1 cifra.");
        } else if (numero < 100) {
            System.out.println("El número tiene 2 cifras.");
        } else if (numero < 1000) {
            System.out.println("El número tiene 3 cifras.");
        } else if (numero < 10000) {
            System.out.println("El número tiene 4 cifras.");
        } else {
            System.out.println("El número tiene 5 cifras.");
        }

        scanner.close();
	}

}
