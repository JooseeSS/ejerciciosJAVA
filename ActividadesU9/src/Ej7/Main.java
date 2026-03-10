package Ej7;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // 1. Array de productos
        Producto[] productos = {
            new Producto("Z99", "Informática", 1250.00),
            new Producto("B12", "Oficina", 45.50),
            new Producto("A01", "Mobiliario", 320.00),
            new Producto("M44", "Oficina", 12.99), 
            new Producto("X05", "Periféricos", 85.90)
        };

                ComparadorPrecioDesc comparadorPrecio = new ComparadorPrecioDesc();
        ComparadorCodigoAZ comparadorCodigo = new ComparadorCodigoAZ();

                Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        System.out.println("=== ARRAY ORIGINAL ===");
        mostrarArray(productos);

        while (opcion != 0) {
            System.out.println("\n--- MENÚ DE ORDENACIÓN ---");
            System.out.println("1: Orden natural por nombre A-Z (y precio asc.)");
            System.out.println("2: Precio descendente");
            System.out.println("3: Código A-Z");
            System.out.println("4: Mostrar todos");
            System.out.println("0: Salir");
            System.out.print("Elige una opción: ");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                
                switch (opcion) {
                    case 1:
                        
                        Arrays.sort(productos); 
                        System.out.println("\n✅ Ordenado por Nombre A-Z (Natural):");
                        mostrarArray(productos);
                        break;
                    case 2:
                        Arrays.sort(productos, comparadorPrecio);
                        System.out.println("\n✅ Ordenado por Precio Descendente:");
                        mostrarArray(productos);
                        break;
                    case 3:
                        Arrays.sort(productos, comparadorCodigo);
                        System.out.println("\n✅ Ordenado por Código A-Z:");
                        mostrarArray(productos);
                        break;
                    case 4:
                        System.out.println("\n📦 Mostrando todos los productos:");
                        mostrarArray(productos);
                        break;
                    case 0:
                        System.out.println("\nSaliendo del programa... ¡Genial!");
                        break;
                    default:
                        System.out.println("\n❌ Opción no válida. Introduce un número del 0 al 4.");
                }
            } else {
                System.out.println("\n❌ Error: Debes introducir un número.");
                scanner.next(); 
            }
        }
        
        scanner.close(); 
    }

    private static void mostrarArray(Producto[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].mostrar());
        }
    }
}