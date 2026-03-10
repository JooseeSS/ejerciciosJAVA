package com;


import java.util.Arrays;
import java.util.Random;
/**
 * Leer y almacenar n números enteros en una tabla. 
 * Construir otras dos tablas con 
 * los elementos pares e impares de la primera, 
 * respectivamente.
 */
public class Ej10 {
	public static void main(String [] args) {
		int[] numeros = generarTablaAleatoria(10) /*{1,4,2,4,3,2,1,1,1}*/;
		int indicePares =0, indicesImpares=0;
		//Cuenta primero cuántos pares hay (cuentaPares).
		int total = contarPares(numeros);
		//Crea valoresPares con tamaño cuentaPares 
		int[] valoresPares = new int[total];
		//y valoresImpares con n - cuentaPares.
		int[] valoresImpares = new int[numeros.length - total];
		//Recorre de nuevo y vuelca en la tabla correspondiente usando índices separados.
		for(int i=0; i<numeros.length; i++) {
			//Es par
			if(numeros[i] % 2 == 0) {
				valoresPares[indicePares] = numeros[i];
				indicePares++;
			}else {
				valoresImpares[indicesImpares] = numeros[i];
				indicesImpares++;
			}
		}
		
		System.out.println("Pares: " +  Arrays.toString(valoresPares));
		System.out.println("Impares: " +  Arrays.toString(valoresImpares));

	}
	
	public static int contarPares(int [] tabla) {
		int total = 0;
		for(int num : tabla) {
			if(num %2 ==0) {
				total++;
			}
		}
		return total;
	}
	public static int[] generarTablaAleatoria(int n) {
		int [] tabla = new int[n];
		Random random = new Random();
		for(int i=0; i<tabla.length; i++) {
			tabla[i] = random.nextInt(10);
		}
		return tabla;
	}

}
