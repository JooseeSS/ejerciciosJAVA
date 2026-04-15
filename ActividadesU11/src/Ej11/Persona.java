package Ej11;

import java.io.Serializable;

public  class Persona implements Serializable {
	private static final long serialVersionUID = 1L;
	String nombre;
	int edad;
	String email;

	public Persona(String nombre, int edad, String email) {
		this.nombre = nombre;
		this.edad = edad;
		this.email = email;
	}

	@Override
	public String toString() {
		return nombre + " (" + edad + " años) - " + email;
	}
}
