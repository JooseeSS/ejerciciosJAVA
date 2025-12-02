package Ej6;



public class Texto {
    
    // Atributos
    private String cadena; // Aquí guardamos el texto
    private int longitudMaxima; // El tope de caracteres permitidos

    // Constructor: Define el tamaño máximo e inicia la cadena vacía
    public Texto(int longitudMaxima) {
        this.longitudMaxima = longitudMaxima;
        this.cadena = ""; // Importante inicializarla vacía, no null
    }

    // ---------------- MÉTODOS PARA AÑADIR CARACTERES ----------------

    // Añadir carácter al principio
    public void addCaracterPrincipio(char c) {
        if (cadena.length() + 1 <= longitudMaxima) {
            this.cadena = c + this.cadena;
            System.out.println("Carácter '" + c + "' añadido al inicio.");
        } else {
            System.out.println("Error: No cabe el carácter (Límite alcanzado).");
        }
    }

    // Añadir carácter al final
    public void addCaracterFinal(char c) {
        if (cadena.length() + 1 <= longitudMaxima) {
            this.cadena = this.cadena + c;
            System.out.println("Carácter '" + c + "' añadido al final.");
        } else {
            System.out.println("Error: No cabe el carácter (Límite alcanzado).");
        }
    }

    // ---------------- MÉTODOS PARA AÑADIR CADENAS ----------------

    // Añadir cadena al principio
    public void addCadenaPrincipio(String texto) {
        if (cadena.length() + texto.length() <= longitudMaxima) {
            this.cadena = texto + this.cadena;
            System.out.println("Texto \"" + texto + "\" añadido al inicio.");
        } else {
            System.out.println("Error: No cabe el texto completo.");
        }
    }

    // Añadir cadena al final
    public void addCadenaFinal(String texto) {
        if (cadena.length() + texto.length() <= longitudMaxima) {
            this.cadena = this.cadena + texto;
            System.out.println("Texto \"" + texto + "\" añadido al final.");
        } else {
            System.out.println("Error: No cabe el texto completo.");
        }
    }

    // ---------------- OTROS MÉTODOS ----------------

    public int contarVocales() {
        int contador = 0;
        String vocales = "aeiouAEIOUáéíóúÁÉÍÓÚ"; // Incluimos tildes por si acaso

        // Recorremos la cadena letra por letra
        for (int i = 0; i < cadena.length(); i++) {
            char letraActual = cadena.charAt(i);
            // Si la letra actual está en nuestra lista de vocales, sumamos 1
            if (vocales.indexOf(letraActual) != -1) {
                contador++;
            }
        }
        return contador;
    }

    // Método extra para poder ver cómo va quedando el texto
    public void mostrarTexto() {
        System.out.println("Estado actual: [" + cadena + "] (Longitud: " + cadena.length() + "/" + longitudMaxima + ")");
    }
}