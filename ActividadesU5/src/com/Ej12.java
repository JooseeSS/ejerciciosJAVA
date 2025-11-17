package com;

public class Ej12 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        // Rellenar la matriz con la suma de los índices
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5;j++) {
                matriz[i][j] = i + j;
            }
        }

   
        mostrarMatriz(matriz);
    }

    public static void mostrarMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
}