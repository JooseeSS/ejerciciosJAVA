package es.iescamas.programacion.ej1;

public class LIbro {
	private String titulo;
	private String autor;
	private int anyo;
	private double precio;

	public LIbro(String titulo, String autor, int anyo, double precio) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anyo = anyo;
		this.precio = precio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	


	public String mostrarFicha() {
		return "[" + anyo + "] "+titulo+" - " + autor + "(" + precio + "€";
	}
	
}
