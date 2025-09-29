package Actividades;
import java.util.*;

public class Ej12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el día: ");
        int dia = sc.nextInt();
        System.out.print("Introduce el mes: ");
        int mes = sc.nextInt();
        System.out.print("Introduce el año: ");
        int anio = sc.nextInt();

        boolean fechaCorrecta = true;

        if (anio <= 0) {
            fechaCorrecta = false; 
        } else if (mes < 1 || mes > 12) {
            fechaCorrecta = false; 
        } else {
           
            int diasMes;
            switch (mes) {
                case 1, 3, 5, 7, 8, 10, 12 -> diasMes = 31;
                case 4, 6, 9, 11 -> diasMes = 30;
                case 2 -> diasMes = 28; 
                default -> diasMes = 0; 
            }

            if (dia < 1 || dia > diasMes) {
                fechaCorrecta = false;
            }
        }

        if (fechaCorrecta) {
            System.out.println("La fecha es correcta: " + dia + "/" + mes + "/" + anio);
        } else {
            System.out.println("La fecha NO es correcta.");
        }

        sc.close();
    }
}
