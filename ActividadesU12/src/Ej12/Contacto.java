package Ej12;

import java.util.Objects;

public abstract class Contacto implements Imprimible, Comparable<Contacto> {
    protected String nombre;
    protected String telefono;

    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() { return nombre; }
    public String getTelefono() { return telefono; }

    public abstract String getTipo();

    @Override
    public int compareTo(Contacto otro) {
        return this.nombre.compareToIgnoreCase(otro.getNombre());
    }

	@Override
	public int hashCode() {
		return Objects.hash(nombre, telefono);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contacto other = (Contacto) obj;
		return Objects.equals(nombre, other.nombre) && Objects.equals(telefono, other.telefono);
	}

   
   
}