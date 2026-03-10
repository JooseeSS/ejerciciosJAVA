package Ej8;

import java.util.*;

public class Reserva implements Validable, Mostrable {
private String fecha;
private int numPersonas;


public Reserva(String fecha, int numPersonas) {
	super();
	this.fecha = fecha;
	this.numPersonas = numPersonas;
}
@Override
public String mostrar() {
	// TODO Auto-generated method stub
	return "Reserva -> Fecha: " + fecha + " | Comensales: " + numPersonas;
}
@Override
public void validar() throws IllegalArgumentException {
	if (fecha == null || fecha.trim().isEmpty()) {
        throw new IllegalArgumentException("Reserva inválida: La fecha es obligatoria.");
    }
	if (numPersonas <= 0) {
        throw new IllegalArgumentException("Reserva inválida: El número de comensales debe ser mayor que 0.");
    }
	
}
}
