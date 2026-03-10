package com;

import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[4][4];

        leerMatriz(m, sc);
        int suma = sumaFila(m, 0);
        boolean magica = true;

        // Comprobar todas las filas
        for (int i = 0; i < 4; i++) {
            if (sumaFila(m, i) != suma) {
                magica = false;
            }
        }

        // Comprobar todas las columnas
        for (int j = 0; j < 4; j++) {
            if (sumaColumna(m, j) != suma) {
                magica = false;
            }
        }

        if (magica)
            System.out.println("La matriz es mágica.");
        else
            System.out.println("La matriz no es mágica.");
    }

    public static void leerMatriz(int[][] m, Scanner sc) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                m[i][j] = sc.nextInt();
            }
        }
    }

    public static int sumaFila(int[][] m, int fila) {
        int suma = 0;
        for (int j = 0; j < 4; j++) {
            suma += m[fila][j];
        }
        return suma;
    }

    public static int sumaColumna(int[][] m, int col) {
        int suma = 0;
        for (int i = 0; i < 4; i++) {
            suma += m[i][col];
        }
        return suma;
    }
}