package com;
import java.util.*;
public class Ej9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
final int ALUMNOS = 5;
final int TRIMESTRES = 3;

int [] [] notas = new int [ALUMNOS] [TRIMESTRES];

for (int i=0; i<ALUMNOS;i++) {
	  System.out.println("Introduce las notas del alumno " + (i + 1) + ":");
	  for (int j = 0; j < TRIMESTRES; j++) {
          System.out.print("  Trimestre " + (j + 1) + ": ");
          notas[i][j] = sc.nextInt();
      }
}
}
}
