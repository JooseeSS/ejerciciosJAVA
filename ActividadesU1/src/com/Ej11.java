package com;
import java.util.Scanner;
public class Ej11 {
/*
 * Un frutero necesita calcular los beneficios anuales que obtiene de la venta de manzanas y peras.
La aplicación debe solicitar las ventas (en kilos) de cada semestre para cada fruta.
Se mostrará el importe total, sabiendo que:

El kilo de manzanas = 2,35 €
El kilo de peras = 1,95 €
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
System.out.println("Cuantos Kilos de manzanas has vendido el primer semestre");
double manzanas=sc.nextDouble();
System.out.println("Y peras?");
double peras = sc.nextDouble();

System.out.println("Cuantos Kilos de manzanas has vendido el segundo semestre");
double manzanas2=sc.nextDouble();
System.out.println("Y peras?");
double peras2 = sc.nextDouble();
final double benManzanas = (manzanas*2.35)+ (manzanas2*2.35);
final double benPeras = (peras*1.95)+ (peras2*1.95);
final double totalBen = benManzanas+benPeras;

System.out.println("Los beneficios de manzanas al año es de: " +benManzanas +" euros" );
System.out.println("Los beneficios de peras al año es de: " +benPeras +" euros" );
System.out.println("Los beneficios totales al año es de: " +totalBen +" euros" );



	}

}
