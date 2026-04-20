package ExamenAntesDeFeria;

import java.io.Serializable;
import java.util.Objects;

public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;
	private int codigo;
	private String nombre;
	private double precio;

	public Producto(int codigo, String nombre, double precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}
	

	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	@Override
	public int hashCode() {
		return Objects.hash(codigo, nombre, precio);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return codigo == other.codigo && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	// toString para mostrar el producto
	public String toString() {
		return "Producto[codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
}
