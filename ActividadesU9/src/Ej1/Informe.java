package Ej1;

public class Informe implements Imprimible{
private String id;
private String autor;
private int paginas;
public Informe(String id, String autor, int paginas) {
	super();
	this.id = id;
	this.autor = autor;
	this.paginas = paginas;
}
@Override
public String imprimir() {
	// TODO Auto-generated method stub
	return toString();
}
@Override
public String toString() {
	return "Informe [id=" + id + ", autor=" + autor + ", paginas=" + paginas + "]";
}

}
