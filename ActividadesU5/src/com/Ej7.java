package com;
import java.util.*;

import java.util.Arrays;
public class Ej7 {
/*7. Leer una serie de 6 enteros que se almacenarán en una tabla que hay que ordenar
y mostrar. Leer otra serie de 6 enteros, que también se guardarán en una tabla y se
mostrarán ordenados. A continuación, fusionar las dos tablas en una tercera, de forma
que los 12 números sigan ordenados. Fusionar dos tablas ordenadas significa copiar en
el orden correcto para que los datos resultantes continúen ordenados, sin necesidad de
volver a realizar una ordenación.
*/
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int[] a = new int[6];
	        int[] b = new int[6];
	        int[] c = new int[a.length+b.length];

	        System.out.println("Introduce 6 números para la primera tabla:");
	        for (int i = 0; i < a.length; i++) { 
	        	a[i] = sc.nextInt();}

	        System.out.println("Introduce 6 números para la segunda tabla:");
	        for (int i = 0; i < b.length; i++) {
	        	b[i] = sc.nextInt();
	        }
	        System.out.println("tabla 1 antes: " + Arrays.toString(a));
		      Arrays.sort(a);
		      System.out.println("tabla 1 despues: " + Arrays.toString(a));
		      
		      System.out.println("tabla 2 antes: " + Arrays.toString(b));
		      Arrays.sort(b);
		      System.out.println("tabla 2 despues: " + Arrays.toString(b));
	        int ita=0;
	        int itb=0;
	        int itc=0;
	        while (itc < c.length) {
	            if (ita >= a.length) { // Si ya terminamos 'a', copiar de 'b'
	                c[itc++] = b[itb++];
	            } else if (itb >= b.length) { // Si ya terminamos 'b', copiar de 'a'
	                c[itc++] = a[ita++];
	            } else if (a[ita] <= b[itb]) { // Comparar y copiar el menor
	                c[itc++] = a[ita++];
	            } else {
	               c[itc++] = b[itb++];
	            }
	        }
	        
	      
	      
	      System.out.println("la tabla fucionada y ordenada es: " + Arrays.toString(c));
	      sc.close();
}
}
