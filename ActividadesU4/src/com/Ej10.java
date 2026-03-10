package com;

public class Ej10 {
	public static void main(String[] args) {

		amigos(220, 284); // Son amigos
		amigos(6, 6); // No son amigos (es el mismo número)
		amigos(222, 284); // No son amigos
		amigos(1184, 1210); // Son amigos

	}

	public static void amigos(int n1, int n2) {

		if (sumaDivisoresPropios(n1) == n2 && sumaDivisoresPropios(n2) == n1) {
			System.out.println(n1 + " y " + n2 + " SON números amigos");
		} else {
			System.out.println(n1 + " y " + n2 + " NO son números amigos");
		}

	}

	public static int sumaDivisoresPropios(int n) {
		int sumaDiv = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sumaDiv += i;
			}
		}
		return sumaDiv;
	}
}
