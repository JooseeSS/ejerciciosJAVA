package Ej6;

public class Producto implements Valorable {

	private String codigo;
	private String nombre;
	private double precio;

	public Producto(String codigo, String nombre, double precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}

	@Override
	public double getPrecio() {
		return this.precio;
	}

	@Override
	public String getNombre() {
		return this.nombre;
	}

	public String getCodigo() {
		return this.codigo;
	}

	@Override
	public String toString() {
		return String.format("[%s] %-15s -> %.2f€", codigo, nombre, precio);
	}
}