package es.iescamas.programacion.ej2;

public class LibroDigital extends LIbro {
private String formato;

public LibroDigital(String titulo, String autor, int anyo, double precio, String formato) {
	super(titulo, autor, anyo, precio);
	this.formato = formato;
}

public String getFormato() {
	return formato;
}

public void setFormato(String formato) {
	this.formato = formato;
}


	@Override
	public void mostrarEnCatalogo() {
		System.out.println(mostrarFicha()+"["+getCodigo()+"-"+formato.toUpperCase()+"]");
		
	}
}


