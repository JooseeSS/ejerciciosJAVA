package com;
public class Ej14 {
    public static void main(String[] args) {
        int[] apuesta = {3, 7, 12, 18, 25, 40};
        int[] ganadora = {5, 7, 40, 20, 25, 36};

        int aciertos = contarAciertos(apuesta, ganadora);

        System.out.println("Número de aciertos: " + contarAciertos(apuesta, ganadora));
    }

    public static int contarAciertos(int[] apuesta, int[] ganadora) {
        int aciertos = 0;

        for (int i = 0; i < apuesta.length; i++) {
            for (int j = 0; j < ganadora.length; j++) {
                if (apuesta[i] == ganadora[j]) {
                    aciertos++;
                    break; // Evitamos contar dos veces el mismo número
                }
            }
        }

        return aciertos;
    }
}
