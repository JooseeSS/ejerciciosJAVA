package Ej5;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("========================================");
        System.out.println("   MÉTODO 1: USANDO UN ARRAY CLÁSICO");
        System.out.println("========================================\n");

        // 1. Creamos objetos y los metemos en un array estático
        Producto p1 = new Producto("Teclado Mecánico", 100.0);
        Servicio s1 = new Servicio("Reparación de pantalla", 50.0);
        
        Descuentable[] arrayDescuentables = { p1, s1 };

        // 2. Recorremos el array con un bucle for tradicional
        for (int i = 0; i < arrayDescuentables.length; i++) {
            Descuentable item = arrayDescuentables[i];
            
            System.out.println("-> Artículo " + (i + 1) + ":");
            System.out.println("Precio Base: " + item.precioBase() + "€");
            
            // Usamos el método default de la interfaz para aplicar un 10% de descuento
            System.out.println("Precio Final (10% dto): " + item.precioFinal(10.0) + "€\n");
        }


        System.out.println("========================================");
        System.out.println("   MÉTODO 2: USANDO UN ARRAYLIST");
        System.out.println("========================================\n");

        // 3. Creamos una lista dinámica
        List<Descuentable> listaDescuentables = new ArrayList<>();
        
        listaDescuentables.add(new Producto("Ratón Gaming", 60.0));
        listaDescuentables.add(new Servicio("Formateo de PC", 40.0));

        // 4. Recorremos la lista con un bucle for-each
        for (Descuentable item : listaDescuentables) {
            
            // Para saber el nombre o descripción, tendríamos que hacer un "cast", 
            // pero como solo nos piden los precios, usamos el polimorfismo directamente:
            System.out.println("Precio Base: " + item.precioBase() + "€");
            
            // Esta vez aplicamos un 50% de descuento (mitad de precio)
            System.out.println("Precio Final (50% dto): " + item.precioFinal(50.0) + "€\n");
        }
    }
}