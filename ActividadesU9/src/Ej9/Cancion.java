package Ej9;

public class Cancion implements Mostrable, Reproducible {

	private String titulo;
	private String artista; 
	private Estado estadoActual;

	public Cancion(String titulo, String artista) {
		super();
		this.titulo = titulo;
		this.artista = artista;
		this.estadoActual = Estado.DETENIDO;
	}

	@Override
	public void play() {
		if (this.estadoActual != Estado.REPRODUCIENDO) {
			this.estadoActual = Estado.REPRODUCIENDO;
			System.out.println("Sonando: " + titulo);
		} else {
			System.out.println(titulo + " ya está sonando, no puedes volver a reproducirla.");
		}
	}

	@Override
	public void pause() {
		if (this.estadoActual == Estado.REPRODUCIENDO) {
			this.estadoActual = Estado.PAUSADO;
			System.out.println("Pausada: " + titulo);
		} else {
			System.out.println(titulo + " no se puede pausar porque no está sonando.");
		}
	}

	@Override
	public void stop() {
		if (this.estadoActual != Estado.DETENIDO) {
			this.estadoActual = Estado.DETENIDO;
			System.out.println("Detenida: " + titulo);
		} else {
			System.out.println(titulo + " ya está detenida, no puedes volver a detenerla.");
		}
	}

	@Override
	public String mostrar() {
		return toString();
	}

	@Override
	public String toString() {
		return "Cancion [titulo=" + titulo + ", artista=" + artista + ", estadoActual=" + estadoActual + "]";
	}
}