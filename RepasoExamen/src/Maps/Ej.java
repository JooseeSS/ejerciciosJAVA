import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class EjemploColecciones {
    public static void main(String[] args) {

        System.out.println("--- 1. ARRAYLIST (Admite duplicados, mantiene el orden) ---");
        // Creamos una List de Strings
        List<String> listaCompra = new ArrayList<>();
        
        listaCompra.add("Manzanas");
        listaCompra.add("Peras");
        listaCompra.add("Manzanas"); // ¡Duplicado permitido!

        // Bucle for-each: "Por cada String 'fruta' dentro de 'listaCompra'..."
        for (String fruta : listaCompra) {
            System.out.println("- " + fruta);
        }
        System.out.println("La lista tiene " + listaCompra.size() + " elementos.");


        System.out.println("\n--- 2. HASHSET (NO admite duplicados, no garantiza orden) ---");
        // Creamos un Set de Strings
        Set<String> dniVotantes = new HashSet<>();
        
        dniVotantes.add("11111111A");
        dniVotantes.add("22222222B");
        boolean añadido = dniVotantes.add("11111111A"); // Intento añadir un duplicado
        
        System.out.println("¿Se añadió el duplicado? " + añadido); // Imprimirá false
        
        for (String dni : dniVotantes) {
            System.out.println("Votante registrado: " + dni);
        }


        System.out.println("\n--- 3. HASHMAP (Pares Clave -> Valor) ---");
        // Creamos un Map. OJO: Tiene dos genéricos <TipoClave, TipoValor>
        Map<String, Integer> edadesAmigos = new HashMap<>();
        
        // En los Map no usamos 'add', usamos 'put' (poner)
        edadesAmigos.put("Carlos", 25);
        edadesAmigos.put("Lucía", 22);
        edadesAmigos.put("Marcos", 28);
        
        // Si hago un put con una clave que ya existe, SOBREESCRIBE el valor anterior
        edadesAmigos.put("Carlos", 26); // Carlos acaba de cumplir años

        // Búsqueda instantánea usando la clave (get)
        System.out.println("¿Qué edad tiene Lucía? " + edadesAmigos.get("Lucía") + " años.");

        // Recorrer un Map es un poco diferente (recorremos sus "Entry" o pares)
        for (Map.Entry<String, Integer> pareja : edadesAmigos.entrySet()) {
            System.out.println("Nombre: " + pareja.getKey() + " - Edad: " + pareja.getValue());
        }
    }
}


import java.util.ArrayList;
import java.util.List;

public class EjercicioArrayList {
    public static void main(String[] args) {
        // 1. Instanciamos la lista (buena práctica: declarar como List, instanciar como ArrayList)
        List<Double> notas = new ArrayList<>();
        
        // 2. Añadimos elementos
        notas.add(7.5);
        notas.add(4.0);
        notas.add(9.2);
        notas.add(5.5);
        notas.add(8.0);

        // 3. Calculamos la suma con un for-each
        double suma = 0;
        for (Double nota : notas) {
            suma += nota; // Acumulamos el valor
        }
        
        // 4. Calculamos la media usando el tamaño dinámico de la lista (.size())
        double media = suma / notas.size();
        System.out.println("La nota media es: " + media);
    }
}
Solución Ejercicio 2 (Intermedio): El HashSet que ignora duplicados
Aquí demostramos la principal cualidad de los Sets.

Java
import java.util.HashSet;
import java.util.Set;

public class EjercicioHashSet {
    public static void main(String[] args) {
        Set<String> participantes = new HashSet<>();
        
        participantes.add("Ana");
        participantes.add("Luis");
        participantes.add("Carlos");
        participantes.add("Ana"); // ¡Duplicado intencionado! El HashSet lo ignorará en silencio.

        // Imprimimos el tamaño. El resultado será 3, porque la segunda "Ana" no entró.
        System.out.println("Número de participantes únicos: " + participantes.size());
    }
}
Solución Ejercicio 3 (Avanzado/Examen): HashMap + Objetos

Esta es la estructura mental que debes tener: una Clave (String) que abre la puerta a un Valor (Objeto Producto).

Java
import java.util.HashMap;
import java.util.Map;

// 1. La clase Producto
class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
}

// 2. El Main con el HashMap
public class EjercicioHashMap {
    public static void main(String[] args) {
        // Creamos el diccionario: Clave (String, el código) -> Valor (Producto)
        Map<String, Producto> inventario = new HashMap<>();
        
        // Usamos put() para añadir. Instanciamos el producto directamente dentro del put.
        inventario.put("B001", new Producto("Teclado", 25.50));
        inventario.put("B002", new Producto("Ratón", 15.75));
        inventario.put("B003", new Producto("Monitor", 120.00));

        // Simulamos la lectura de un escáner
        String codigoEscaneado = "B002";
        
        // Recuperamos el objeto usando su clave
        Producto prodEncontrado = inventario.get(codigoEscaneado);

        // MUY IMPORTANTE: Siempre comprobar si el resultado es null (por si el código no existía)
        if (prodEncontrado != null) {
            System.out.println("Producto escaneado: " + prodEncontrado.getNombre() + " - " + prodEncontrado.getPrecio() + "€");
        } else {
            System.out.println("Error: Producto no encontrado en el inventario.");
        }
    }
}