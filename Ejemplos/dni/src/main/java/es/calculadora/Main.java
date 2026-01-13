package es.calculadora;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int n1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int n2 = scanner.nextInt();

        Calculadora miCalculadora = new Calculadora(n1, n2);

        System.out.println("Suma: " + miCalculadora.sumar());
        System.out.println("Resta: " + miCalculadora.restar());
        System.out.println("Multiplicación: " + miCalculadora.multiplicar());
        System.out.println("División: " + miCalculadora.dividir());

        scanner.close();
    }
}