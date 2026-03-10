package Ej7;

public class Producto implements Comparable<Producto>, Mostrable{
	private String codigo;
    private String nombre;
    private double precio;
    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
    
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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

	@Override
	public String mostrar() {
		// TODO Auto-generated method stub
		return String.format("[%s] %-15s -> %.2f€", codigo, nombre, precio);
	}

	@Override
	public int compareTo(Producto o) {
		int comparacionNombre = this.nombre.compareToIgnoreCase(o.nombre);
		
		if(comparacionNombre!=0) {
			return comparacionNombre;
		}
		
		
		return Double.compare(this.precio, o.precio);
	}

}
