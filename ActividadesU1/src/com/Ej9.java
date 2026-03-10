package com;
import java.util.Scanner;
public class Ej9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("Pon un numero y te dire si es par o no");
		int num= sc.nextInt();
	
		 boolean par = num%2 == 0;
         System.out.println(par);
	}

}
