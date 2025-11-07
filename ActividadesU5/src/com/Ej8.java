package com;
import java.util.*;

public class Ej8 {

	   public static int[] sinRepetidos(int[] t) {
	        if (t.length == 0) {
	            return new int[0]; // si el array está vacío, devolvemos uno vacío
	        }

	        // Creamos el resultado con el primer elemento
	        int[] res = { t[0] };

	        // Recorremos el resto de elementos
	        for (int i = 1; i < t.length; i++) {
	            if (!contiene(res, t[i])) {
	                res = insertar(res, t[i]);
	            }
	        }

	        return res;
	    }

	    // Comprueba si un array contiene un valor
	    private static boolean contiene(int[] arr, int valor) {
	        for (int n : arr) {
	            if (n == valor) {
	                return true;
	            }
	        }
	        return false;
	    }

	    // Inserta un nuevo valor al final del array (aumentando su tamaño)
	    private static int[] insertar(int[] arr, int valor) {
	        int[] nuevo = Arrays.copyOf(arr, arr.length + 1);
	        nuevo[nuevo.length - 1] = valor;
	        return nuevo;
	    }

	    // Ejemplo de uso
	    public static void main(String[] args) {
	        int[] t = { 3, 5, 3, 2, 5, 7, 2, 8 };
	        int[] resultado = sinRepetidos(t);

	        System.out.println("Original: " + Arrays.toString(t));
	        System.out.println("Sin repetidos: " + Arrays.toString(resultado));
	    }
	}