package com;

public class Ej6 {

	public static void main(String[] args) {
		System.out.println(nota(2,7));

	}
public static String nota(int n1, int n2) {
	if((n1+n2)/2 < 5) {
		return "Suspenso";
		
	}else {
		return "Aprobado";
	}
}
}
