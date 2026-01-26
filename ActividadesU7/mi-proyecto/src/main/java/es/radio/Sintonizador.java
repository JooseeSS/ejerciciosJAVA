package es.radio;


public class Sintonizador {

	// Atributo
    private double frecuencia;
    
    // Constantes
    private final double MAX_FRECUENCIA = 108.0;
    private final double MIN_FRECUENCIA = 80.0;
    private final double SALTO = 0.5;
    
    //  Constructor
    public Sintonizador() {
        this.frecuencia = MIN_FRECUENCIA;
    }
    
    // Getters y Setters
    public double getFrecuencia() {
		return frecuencia;
	}
	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}


	// Metodo up
    public double up() {
        this.frecuencia += SALTO;
        if (this.frecuencia > MAX_FRECUENCIA) {
            this.frecuencia = MIN_FRECUENCIA;
        }
        return this.frecuencia;
    }
    

	// Metodo down
    public double down() {
        this.frecuencia -= SALTO;
        if (this.frecuencia < MIN_FRECUENCIA) {
            this.frecuencia = MAX_FRECUENCIA;
        }
        return this.frecuencia;
    }
    
    // Metodo Display
    public double display() {
        System.out.println("Sintonizando: " + this.frecuencia + " MHz");
        return this.frecuencia; // Ahora devolvemos el valor
    }
}