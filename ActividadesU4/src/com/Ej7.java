package com;
import java.util.*;
public class Ej7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*Diseñar una función que determine si un número es primo.*/
	}
public static boolean esPrimo(int num) {
	
	for (int i =2; i<=num;i++){
		return true;
		for(int j=2; j<i;j++) {
			if (i % j == 0) {
				return false;
				break;
			}
			
		}
	

}
}
}