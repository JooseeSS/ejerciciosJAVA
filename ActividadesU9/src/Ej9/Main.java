package Ej9;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		Cancion c1 = new Cancion("El dia feliz", "Juan");
		Podcast p1 = new Podcast("La mesa", "Luis");

		
		Reproductor miReproductor = new Reproductor();

		System.out.println("=== PRUEBA DE ESTADOS Y ERRORES ===");
		
		
		miReproductor.cargarPista(c1);
		
		System.out.println("\n-- Intentando pausar una pista detenida --");
		miReproductor.pause(); 
		
		System.out.println("\n-- Le damos al Play --");
		miReproductor.play();
		
		
		System.out.println("\n-- Intentando darle al Play cuando ya suena --");
		miReproductor.play();

		
		System.out.println("\nINFO: " + c1.mostrar());

		System.out.println("\n=== CAMBIO DE PISTA ===");
		
		
		miReproductor.cargarPista(p1);
		
		
		miReproductor.play();
		
		
		miReproductor.pause();
		System.out.println("INFO: " + p1.mostrar());
		
		
		miReproductor.stop();
		
		
		System.out.println("\n AHORA CON LISTAS");
		List<Reproducible> miPlayList = new ArrayList<>();
		miPlayList.add(new Cancion("El dia feliz2", "Juan Sanchez"));
		miPlayList.add(new Podcast("La mesa2", "Luis Jaen"));
		
		for (Reproducible reproducible : miPlayList) {
			miReproductor.cargarPista(reproducible);
			reproducible.play();
			reproducible.pause();
			reproducible.stop();
		}
	}
}