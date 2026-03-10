package Ej1;

public class Factura implements Imprimible{
private int id;
private String cliente;
private int importe;
public Factura(int id, String cliente, int importe) {
	super();
	this.id = id;
	this.cliente = cliente;
	this.importe = importe;
}
@Override
public String imprimir() {
	// TODO Auto-generated method stub
	return toString();
}
@Override
public String toString() {
	return "Factura [id=" + id + ", cliente=" + cliente + ", importe=" + importe + "]";
}

}
