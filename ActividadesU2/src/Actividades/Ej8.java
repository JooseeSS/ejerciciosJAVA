package Actividades;
import java.util.*;
public class Ej8 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	       
	        System.out.print("Introduce a: ");
	        double a = sc.nextDouble();

	        System.out.print("Introduce b: ");
	        double b = sc.nextDouble();

	        System.out.print("Introduce c: ");
	        double c = sc.nextDouble();

	        if (a == 0) {
	            System.out.println("Esto no es una ecuación de segundo grado a=0.");
	        } else {
	            double cuenta = (b * b) - 4 * a * c;  

	            if (cuenta > 0) {
	                
	                double x1 = (-b + Math.sqrt(cuenta)) / (2 * a);
	                double x2 = (-b - Math.sqrt(cuenta)) / (2 * a);
	                System.out.println("Hay dos soluciones:");
	                System.out.println("x1 = " + x1);
	                System.out.println("x2 = " + x2);
	            } else if (cuenta == 0) {
	                
	                double x = -b / (2 * a);
	                System.out.println("Solo hay una solución:");
	                System.out.println("x = " + x);
	            } else {
	               
	                System.out.println("No hay soluciones reales.");
	            }
	        }

	       
	}

}
