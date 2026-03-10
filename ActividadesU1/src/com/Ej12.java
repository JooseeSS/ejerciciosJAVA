package com;
import java.util.*;
public class Ej12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
System.out.println("Escribe un numero y te mostrare su valor absoluto: ");
double num = sc.nextDouble();
double numAbs = Math.abs(num);
System.out.println("Su numero en valor absoluto es: " +numAbs);
	}

}
