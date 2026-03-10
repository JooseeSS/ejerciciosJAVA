package Ej5;

public class Producto implements Descuentable {
    
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public double precioBase() {
        return this.precio; // El precio base de un producto es su atributo precio
    }
}