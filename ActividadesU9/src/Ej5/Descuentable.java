package Ej5;

public interface Descuentable {
    
    // Método abstracto clásico: cada clase tendrá que decir cómo calcula su precio base
    double precioBase();
    
    // Método default: ya tiene código. Coge el precio base y le aplica la fórmula matemática.
    // Ninguna clase tendrá que volver a escribir esto, ¡ya viene de serie!
    default double precioFinal(double porcentaje) {
        return precioBase() * (1 - porcentaje / 100.0);
    }
}