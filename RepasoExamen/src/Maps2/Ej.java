Soluciones del Tema 6: Streams
Solución Ejercicio 1 (Básico): Filtrar números pares
Aquí usamos filter para dejar pasar solo los números que cumplen la condición matemática de ser pares.

Java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EjercicioPares {
    public static void main(String[] args) {
        // Un truco rápido para crear listas con datos iniciales (Arrays.asList)
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> pares = numeros.stream()
            // Filtro: Si el resto de dividir entre 2 es 0, es par. Deja pasarlo.
            .filter(n -> n % 2 == 0)
            .collect(Collectors.toList());

        System.out.println("Números pares: " + pares); // Imprime: [2, 4, 6, 8, 10]
    }
}
Solución Ejercicio 2 (Intermedio): Transformar palabras en números
Aquí usamos map. Entra un String en la cinta transportadora, pero sale un Integer. ¡Hemos mutado el dato!

Java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EjercicioLongitud {
    public static void main(String[] args) {
        List<String> palabras = Arrays.asList("Sol", "Estrella", "Luna", "Galaxia");

        List<Integer> longitudes = palabras.stream()
            // Mapa: Coge la palabra y devuélveme solo su tamaño numérico
            .map(palabra -> palabra.length())
            .collect(Collectors.toList());

        System.out.println("Longitudes: " + longitudes); // Imprime: [3, 8, 4, 7]
    }
}
Solución Ejercicio 3 (Avanzado/Examen): Videojuegos baratos
Este es el patrón rey: filtrar objetos por una condición y luego extraer solo un atributo específico de los que han sobrevivido.

Java
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Videojuego {
    private String titulo;
    private double precio;

    public Videojuego(String titulo, double precio) {
        this.titulo = titulo;
        this.precio = precio;
    }

    public String getTitulo() { return titulo; }
    public double getPrecio() { return precio; }
}

public class EjercicioVideojuegos {
    public static void main(String[] args) {
        List<Videojuego> catalogo = new ArrayList<>();
        catalogo.add(new Videojuego("The Witcher 3", 15.0));
        catalogo.add(new Videojuego("Cyberpunk 2077", 45.0));
        catalogo.add(new Videojuego("Hollow Knight", 12.5));
        catalogo.add(new Videojuego("Elden Ring", 60.0));

        // Magia en una sola línea (aunque la dividimos para que se lea mejor)
        List<String> juegosBaratos = catalogo.stream()
            .filter(juego -> juego.getPrecio() < 20.0) // 1. Sobreviven Witcher y Hollow
            .map(juego -> juego.getTitulo())           // 2. Extraemos sus títulos
            .collect(Collectors.toList());             // 3. Los metemos en una lista

        System.out.println("Juegos por menos de 20€: " + juegosBaratos); 
    }
}