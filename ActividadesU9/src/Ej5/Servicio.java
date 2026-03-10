package Ej5;

public class Servicio implements Descuentable {
    
    private String descripcion;
    private double tarifa;

    public Servicio(String descripcion, double tarifa) {
        this.descripcion = descripcion;
        this.tarifa = tarifa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public double precioBase() {
        return this.tarifa; // El precio base de un servicio es su tarifa
    }
}