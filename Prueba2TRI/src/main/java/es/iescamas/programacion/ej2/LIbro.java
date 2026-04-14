package es.iescamas.programacion.ej2;

public class LIbro implements Catalogable{
	protected String titulo;
	protected String autor;
	protected int anyo;
	protected double precio;

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

	@Override
	public String getCodigo() {
		
		String sub = titulo.substring(0, 3).toUpperCase();
		System.out.println(sub);
		return "LIB-"+anyo+sub;
	}

	@Override
	public void mostrarEnCatalogo() {
		System.out.println(mostrarFicha()+"["+getCodigo()+"]");
		
	}
	
}
