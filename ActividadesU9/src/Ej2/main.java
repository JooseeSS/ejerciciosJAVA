package Ej2;

import java.util.ArrayList;
import java.util.List;

public class main {
	public static void main(String[] args) {
		Jugador j = new Jugador(100, "Juan");
		Enemigo e1 = new Enemigo(30, "Orco");
		Enemigo e2 = new Enemigo(200, "Dragón");

		Danable[] objetivos = { j, e1, e2 };

		System.out.println("--- ¡COMIENZA EL COMBATE (Ataque en Área)! ---");

		for (int i = 0; i < 5; i++) {
			j.recibirDanio(50);
			e1.recibirDanio(30);
			e2.recibirDanio(50);
			System.out.println();
		}
		/*
		 * List<Danable> danable = new ArrayList<>();
		danable.add(new Jugador(120, "El mas shulo"));
		danable.add(new Enemigo(250, "Fuego"));
		danable.add(new Enemigo(60, "Agua"));	

		for (Danable danable2 : danable) {	
			danable2.recibirDanio(70);
		}
			}
		 */
	}

}
