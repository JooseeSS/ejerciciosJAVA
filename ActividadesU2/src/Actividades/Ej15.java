package Actividades;
import java.util.*;
/*Idear un programa que solicite al usuario un número comprendido entre 1 y 7, correspondiente a un día 
 * de la semana. Se debe mostrar el nombre del día de la semana al que corresponde.
 *  Por ejemplo, el número 1 corresponde a «lunes» y el 6 a «sábado».*/
public class Ej15 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Ponga un numero del 1 al 7");
		  int num = sc.nextInt();
		if (num ==1 || num==2 ||num==3||num==4||num==5|num==6||num==7) {
			
		  
		switch (num) {
		case 1:
			System.out.println("Pertenece a lunes");
			break;
		case 2:
			System.out.println("Pertenece a martes");
			break;
		case 3:
			System.out.println("Pertenece a miercoles");
			break;
		case 4:
			System.out.println("Pertenece a jueves");
			break;
		case 5:
			System.out.println("Pertenece a viernes");
			break;
		case 6:
			System.out.println("Pertenece a sabado");
			break;

		default:
			System.out.println("Pertenece a domingo");
			break;
		}	
		
		}else
			System.out.println("Ese numero no pertenece a ninguno de la semana");
	}

}
