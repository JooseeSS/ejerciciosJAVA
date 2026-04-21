package Ejercicios;

public class ProductoCarrito {
    private String nombre;
    private double precio;

    public ProductoCarrito(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}