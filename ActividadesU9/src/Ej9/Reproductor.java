package Ej9;

public class Reproductor {
	
		private Reproducible pistaActual;

	
	public void cargarPista(Reproducible pista) {
		
		if (this.pistaActual != null) {
			System.out.println("\n Extrayendo pista anterior...]");
			this.pistaActual.stop();
		}
		
	
		this.pistaActual = pista;
		System.out.println("Reproductor: Nueva pista insertada y lista para sonar]");
	}

		public void play() {
		if (pistaActual != null) {
			pistaActual.play(); 
		} else {
			System.out.println("Error: No hay ninguna pista cargada.");
		}
	}

		public void pause() {
		if (pistaActual != null) {
			pistaActual.pause();
		} else {
			System.out.println("Error: No hay ninguna pista cargada.");
		}
	}

		public void stop() {
		if (pistaActual != null) {
			pistaActual.stop();
		} else {
			System.out.println("Error: No hay ninguna pista cargada.");
		}
	}
}