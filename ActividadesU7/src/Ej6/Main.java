package Ej6;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- CREANDO TEXTO (Máx 15 caracteres) ---");
        Texto t = new Texto(15);
        t.mostrarTexto();

        // 1. Añadimos al principio
        t.addCaracterPrincipio('H');
        t.addCadenaFinal("ola");
        t.mostrarTexto(); // Debería poner "Hola"

        // 2. Añadimos espacio y más texto
        t.addCaracterFinal(' ');
        t.addCadenaFinal("Mundo");
        t.mostrarTexto(); // Debería poner "Hola Mundo" (10 caracteres)

        // 3. Probamos añadir al principio
        t.addCadenaPrincipio("¡"); 
        t.mostrarTexto(); // "¡Hola Mundo" (11 caracteres)

        // 4. Intentamos desbordar la memoria
        // Tenemos 11 chars. El límite es 15. Quedan 4 libres.
        // Intentamos meter "Java" (4 letras) -> Debe entrar.
        System.out.println("\nIntentando añadir 'Java' (4 letras)...");
        t.addCadenaFinal("Java"); 
        t.mostrarTexto();

        // 5. Intentamos meter 1 sola letra más
        // Estamos en 15/15. No debería entrar.
        System.out.println("\nIntentando añadir un punto final '.' ...");
        t.addCaracterFinal('.'); 

        // 6. Contamos vocales
        // Texto final: "¡Hola MundoJava"
        // Vocales: o, a, u, o, a, a -> Total 6
        System.out.println("\nNúmero de vocales en el texto: " + t.contarVocales());
    }
}