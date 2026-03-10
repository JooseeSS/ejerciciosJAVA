package Actividades;

import java.util.Scanner;

public class Ej7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = sc.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            if (b >= c) System.out.println(a + ", " + b + ", " + c);
            else       System.out.println(a + ", " + c + ", " + b);
        } else if (b >= a && b >= c) {
            if (a >= c) System.out.println(b + ", " + a + ", " + c);
            else       System.out.println(b + ", " + c + ", " + a);
        } else {
            if (a >= b) System.out.println(c + ", " + a + ", " + b);
            else       System.out.println(c + ", " + b + ", " + a);
        }
    }
}
