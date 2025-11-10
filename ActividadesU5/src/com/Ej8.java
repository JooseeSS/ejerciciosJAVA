package com;

import java.util.Arrays;

/**
 * 
Ejercicio 8: sinRepetidos(t): elimina duplicados y devuelve nuevo array.
Implementar la función int[] sinRepetidos(int t[]) que construye y devuelve una tabla con los elementos de t eliminando los repetidos. El tamaño del nuevo array debe ajustarse a los elementos únicos.

Indicaciones para resolverlo
Crea int[] res con 1 elemento: copia t[0].
Para cada t[i] desde i=1, comprueba si ya está en res (bucle o función contiene).
Si no está, inserta con función insertar(res, valor) que haga Arrays.copyOf(res, res.length+1) y ponga al final.
 */
public class Ej8 {

	public static void main(String [] args) {
		int [] tabla =  {1,3,5,5, 7,9,9,9,5};
		
		
		System.out.println(Arrays.toString(sinRepetidos(tabla)));
	
	}
	
	/*****
	 * ##################
	 * #        FORMA 1
	 * #############
	 */
	
	
	/**
	 * 
	 * @param t
	 * @return
	 */
	public static int[] sinRepetidos(int t[]) {
		//Crea int[] res con 1 elemento: copia t[0].
		/** int[] res = new int[1];
		   res[0] = t[0];
		*/
		int [] res = Arrays.copyOf(t, 1);
		//Para cada t[i] desde i=1, comprueba si ya está en res (bucle o función contiene).
		for(int i=0; i<t.length; i++) {
			if(!contiene(res, t[i])){
				res = insertar( res, t[i]);
			}
		}
		return res;
	}
	/**
	 * Inserta un nuevo elemento en la tabla
	 * @param tabla
	 * @param valor
	 * @return
	 */
	public static int[] insertar(int [] tabla, int valor) {
		int[] nuevaTabla = Arrays.copyOf(tabla, tabla.length+1);
		nuevaTabla[nuevaTabla.length-1] = valor;
		return nuevaTabla;
	}
	
	/**
	 * Función que me permite comprobar si un elemento se encuentra en la tabla
	 * @param tabla
	 * @param valor
	 * @return
	 */
	public static boolean contiene(int [] tabla, int valor) {
		boolean ret = false;
		for(int i = 0; i< tabla.length; i++) {
			if(tabla[i]==valor) {
				return true;
			}
		}
		return ret;
	}
	
	
}