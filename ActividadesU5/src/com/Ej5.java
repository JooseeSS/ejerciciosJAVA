package com;
import java.util.*;
public class Ej5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
/*Desarrollar el juego de la cámara secreta. El jugador elige la longitud de 
 * la combinación (dígitos del 1 al 5). La aplicación genera aleatoriamente la 
 * combinación y, en cada intento del usuario,
 *  muestra para cada dígito si es mayor, menor o igual que el correspondiente 
 *  de la combinación secreta.*/
System.out.println("De que dimension quiere que sea su codigo secreto");
int dim = sc.nextInt();
int[] cod = new int [dim];
	for (int i=0; i<cod.length;i++) {
		 cod[i] = (int)(Math.random() * 5);
	}System.out.print("Array aleatorio: ");
    for (int n : cod) {
        System.out.print(n + " ");
    }
	}

}
