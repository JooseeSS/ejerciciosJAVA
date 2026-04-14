package Ej11;

import java.time.LocalDate;
import Ej11.Identificable;
import Ej11.Mostrable;

public class Producto implements Identificable, Mostrable {
    
   
    private String id;
    private String nombre;
    private double precio;
    private CategoriaProducto categoria;
    private LocalDate fechaCaducidad;

    public Producto(String id, String nombre, double precio, CategoriaProducto categoria, LocalDate fechaCaducidad) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.fechaCaducidad = fechaCaducidad;
    }

  
    @Override
    public String getId() {
        return id;
    }

   
    @Override
    public void mostrar() {
        System.out.println(this.toString());
    }

   
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
    
    public CategoriaProducto getCategoria() { return categoria; }
    public void setCategoria(CategoriaProducto categoria) { this.categoria = categoria; }
    
    public LocalDate getFechaCaducidad() { return fechaCaducidad; }
    public void setFechaCaducidad(LocalDate fechaCaducidad) { this.fechaCaducidad = fechaCaducidad; }

    @Override
    public String toString() {
        return String.format("Producto [ID: %s | Nombre: %-15s | Precio: %.2f€ | Cat: %s | Caduca: %s]", 
                             id, nombre, precio, categoria, fechaCaducidad);
    }
}