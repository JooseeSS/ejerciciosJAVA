package com;
import java.util.*;
public class Ej9 {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
/*Un centro de investigación de la flora urbana necesita una aplicación que 
 * muestre cuál es el árbol más alto. Para ello se introducirá por teclado la 
 * altura (en centímetros) de cada árbol (terminando cuando se utilice –1 como altura). 
 * Los árboles se identifican mediante etiquetas con números únicos correlativos, comenzando en 0.
 *  Se pide diseñar una aplicación que resuelva el problema planteado.*/
		int id = 0;               
        int altura;             
        int maxAltura = -1;       
        int idMax = -1;           
        System.out.println("Introduce la altura de los árboles en cm (-1 para terminar):");

        while (true) {
            System.out.print("Altura del árbol " + id + ": ");
            altura = sc.nextInt();

            if (altura == -1) { 
                break;
            }

            if (altura > maxAltura) { 
                maxAltura = altura;
                idMax = id;
            }

            id++; 
        }

        if (idMax != -1) {
            System.out.println("El árbol más alto es el árbol " + idMax + " con " + maxAltura + " cm.");
        } else {
            System.out.println("No se ingresaron alturas de árboles.");
        }

        sc.close();
		
		
	}

}
