package es.texto;
/**
 * Notas rápidas para que el alumnado haga TDD “bien”

Empieza implementando constructores + getters + longitud().

Luego anadirFinal(char) y anadirInicio(char).

Después anadirFinal(String) y anadirInicio(String) con regla “todo o nada” (si no cabe, no modifica).

Finalmente contarVocales().
 */
public class Texto {

    private String contenido;
    private final int maxLongitud;
    
    // Constante para facilitar la búsqueda de vocales
    private static final String VOCALES = "aeiouAEIOUáéíóúÁÉÍÓÚüÜ"; 

    /**
     * Constructor: Crea un texto vacío con la capacidad indicada.
     * @param maxLongitud Capacidad máxima de caracteres.
     */
    public Texto(int maxLongitud) {
        if (maxLongitud <= 0) {
            throw new IllegalArgumentException("maxLongitud debe ser > 0");
        }
        this.contenido = "";
        this.maxLongitud = maxLongitud;
    }

    /**
     * Constructor: Crea un texto con contenido inicial.
     * @param contenidoInicial Cadena de inicio.
     * @param maxLongitud Capacidad máxima.
     */
    public Texto(String contenidoInicial, int maxLongitud) {
        if (maxLongitud <= 0) {
            throw new IllegalArgumentException("maxLongitud debe ser > 0");
        }
        if (contenidoInicial == null) {
            throw new IllegalArgumentException("contenidoInicial no puede ser null");
        }
        if (contenidoInicial.length() > maxLongitud) {
            throw new IllegalArgumentException("contenidoInicial supera maxLongitud");
        }
        this.contenido = contenidoInicial;
        this.maxLongitud = maxLongitud;
    }

    // -------------------------------------------------
    // MÉTODOS GETTER E INFORMACIÓN
    // -------------------------------------------------

    public String getContenido() {
        return this.contenido;
    }

    public int longitud() {
        return this.contenido.length();
    }

    @Override
    public String toString() {
        return this.contenido;
    }

    // -------------------------------------------------
    // AÑADIR CARACTERES
    // -------------------------------------------------

    /**
     * Añade un carácter al principio si hay hueco.
     */
    public boolean anadirInicio(char c) {
        if (this.longitud() + 1 > this.maxLongitud) {
            return false; // No cabe
        }
        this.contenido = c + this.contenido;
        return true;
    }

    /**
     * Añade un carácter al final si hay hueco.
     */
    public boolean anadirFinal(char c) {
        if (this.longitud() + 1 > this.maxLongitud) {
            return false; // No cabe
        }
        this.contenido = this.contenido + c;
        return true;
    }

    // -------------------------------------------------
    // AÑADIR CADENAS
    // -------------------------------------------------

    /**
     * Añade una cadena al principio si cabe completa.
     */
    public boolean anadirInicio(String cadena) {
        if (cadena == null) {
            throw new IllegalArgumentException("cadena no puede ser null");
        }
        if (this.longitud() + cadena.length() > this.maxLongitud) {
            return false; // No cabe
        }
        this.contenido = cadena + this.contenido;
        return true;
    }

    /**
     * Añade una cadena al final si cabe completa.
     */
    public boolean anadirFinal(String cadena) {
        if (cadena == null) {
            throw new IllegalArgumentException("cadena no puede ser null");
        }
        if (this.longitud() + cadena.length() > this.maxLongitud) {
            return false; // No cabe
        }
        this.contenido = this.contenido + cadena;
        return true;
    }

    // -------------------------------------------------
    // FUNCIONALIDAD EXTRA
    // -------------------------------------------------

    /**
     * Cuenta cuántas vocales (mayúsculas y minúsculas) hay en el texto.
     */
    public int contarVocales() {
        int contador = 0;
        // Recorremos el texto carácter a carácter
        for (int i = 0; i < this.contenido.length(); i++) {
            char c = this.contenido.charAt(i);
            // Verificamos si el carácter actual existe en nuestra lista de VOCALES
            if (VOCALES.indexOf(c) != -1) {
                contador++;
            }
        }
        return contador;
    }
}