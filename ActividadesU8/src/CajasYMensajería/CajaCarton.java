package CajasYMensajería;

public class CajaCarton extends Caja{
private static double cartonTotal=0;

public CajaCarton(int ancho, int alto, int fondo) {
	super(ancho, alto, fondo, Unidad.CM);
	double superficie = 2 * ((super.ancho * super.alto) + (super.ancho * super.fondo) + (super.alto * super.fondo));

	cartonTotal =+ superficie;
}

@Override
public double getVolumen() {
    
	return super.getVolumen() * 0.8;
}
/**
 * Método estático para consultar el total.
 * Se llama usando el nombre de la clase: CajaCarton.getCartonTotal()
 */
public static double getCartonTotal() {
    return cartonTotal;
}
}
