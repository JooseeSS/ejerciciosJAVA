package com;
import java.util.*;
public class Ej6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
/*Escribir todos los múltiplos de 7 menores que 100.*/
int n=7;
int multi=0;
System.out.println("Estos son los multiplos de 7 menores que 100");
for (int i = 0; multi <=100; i++) {
 multi = n*i;
 if (multi<=100) {
	 System.out.println(multi);
}
 
}
		
		
	}

}
