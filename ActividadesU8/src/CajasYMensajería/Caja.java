package CajasYMensajería;

public class Caja {
	protected final int ancho;
	protected final int alto;
	protected final int fondo;
	protected final Unidad unidad;
	protected String etiqueta;

	public Caja(int ancho, int alto, int fondo, Unidad unidad) {
		super();
		this.ancho = ancho;
		this.alto = alto;
		this.fondo = fondo;
		this.unidad = unidad;
	}

	public double getVolumen() {
		double volumen = this.ancho * this.alto * this.fondo;

		if (this.unidad == Unidad.CM) {
			volumen = volumen / 1000000.0;
		}
		return volumen;

	}

	public String getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}

	public String toString() {
		return "El volumen de la caja es. " + this.getVolumen() + " y su etiqueta es esta: " + this.etiqueta;
	}
}
