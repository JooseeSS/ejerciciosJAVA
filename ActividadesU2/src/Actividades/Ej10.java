package Actividades;
import java.util.*;


public class Ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entre 0 y 9999: ");
        int n = sc.nextInt();

        if (n < 0 || n > 9999) {
            System.out.println("Número fuera de rango.");
        } else if (n < 10) {
           
            System.out.println(n + " es capicúa.");
        } else if (n < 100) {
          
            int a = n / 10;
            int b = n % 10;
            if (a == b) {
                System.out.println(n + " es capicúa.");
            } else {
                System.out.println(n + " no es capicúa.");
            }
        } else if (n < 1000) {
          
            int a = n / 100;
            int c = n % 10;
            if (a == c) {
                System.out.println(n + " es capicúa.");
            } else {
                System.out.println(n + " no es capicúa.");
            }
        } else {
          
            int a = n / 1000;
            int b = (n / 100) % 10;
            int c = (n / 10) % 10;
            int d = n % 10;
            if (a == d && b == c) {
                System.out.println(n + " es capicúa.");
            } else {
                System.out.println(n + " no es capicúa.");
            }
        }
    }
}
