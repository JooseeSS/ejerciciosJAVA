package Ej9;

public class Podcast implements Mostrable,Reproducible {
	private String titulo;
	private String locutor; 
	private Estado estadoActual;
	
	public Podcast(String titulo, String locutor) {
		super();
		this.titulo = titulo;
		this.locutor = locutor;
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
	public String toString() {
		return "Podcast [titulo=" + titulo + ", locutor=" + locutor + ", estadoActual=" + estadoActual + "]";
	}

	@Override
	public String mostrar() {
		// TODO Auto-generated method stub
		return toString();
	}

}
