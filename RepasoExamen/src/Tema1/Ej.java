Gemini ha dicho
¡Me parece una decisión excelente! A veces, leer e interiorizar código bien estructurado y explicado es la mejor forma de que tu cerebro asimile los patrones antes de enfrentarte al "folio en blanco".

Como inteligencia artificial que te asiste, no me canso de explicar, así que vamos a desgranar cada línea para que no quede ninguna duda. Presta especial atención al Ejercicio 3, porque ese concepto de "pasar un objeto a otro" es un clásico en los exámenes de DAM.

Solución Ejercicio 1 (Básico): La clase Libro
Objetivo: Entender la estructura básica: Atributos privados, Constructor para inicializar, y un método propio.

Java
// Clase Libro
public class Libro {
    
    // 1. Atributos privados (Encapsulamiento)
    private String titulo;
    private String autor;
    private int paginas;

    // 2. Constructor: Nace el libro con todos sus datos
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    // 3. Método propio de la clase
    public void mostrarInfo() {
        // Usamos this para referirnos a los datos de ESTE libro en concreto
        System.out.println("El libro " + this.titulo + " escrito por " + this.autor + " tiene " + this.paginas + " páginas.");
    }

    // 4. Getters y Setters (Omito algunos por brevedad, pero en un examen ponlos todos si te lo piden)
    public String getTitulo() { return this.titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    // ... (haríamos lo mismo para autor y páginas) ...
}

// Clase Main (Para probarlo)
public class MainLibro {
    public static void main(String[] args) {
        // Instanciamos el objeto llamando al constructor
        Libro miLibro = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1200);
        
        // Llamamos al método que imprime la información
        miLibro.mostrarInfo(); 
    }
}
Solución Ejercicio 2 (Intermedio): La clase CuentaBancaria
Objetivo: Entender por qué usamos el encapsulamiento. Los métodos actúan como "porteros de discoteca" que validan los datos antes de modificar los atributos.

Java
public class CuentaBancaria {
    
    private String titular;
    private double saldo; // Usamos double porque el dinero tiene decimales

    // El constructor solo pide el titular. El saldo inicializamos nosotros a 0 por defecto.
    public CuentaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0; // Regla de negocio: toda cuenta nace con 0 euros.
    }

    // Método para ingresar dinero (el "portero" verifica que no ingreses dinero negativo)
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            System.out.println("Has ingresado " + cantidad + "€. Saldo actual: " + this.saldo + "€");
        } else {
            System.out.println("Error: La cantidad a ingresar debe ser mayor que 0.");
        }
    }

    // Método para retirar dinero (el "portero" verifica que haya dinero suficiente)
    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad a retirar debe ser mayor que 0.");
        } else if (this.saldo >= cantidad) {
            this.saldo -= cantidad;
            System.out.println("Has retirado " + cantidad + "€. Saldo actual: " + this.saldo + "€");
        } else {
            System.out.println("Error: Saldo insuficiente. Tienes " + this.saldo + "€");
        }
    }

    // Getter para consultar el saldo (¡Fíjate que no hay Setter de saldo! 
    // Solo se modifica mediante ingresar o retirar, máxima seguridad).
    public double getSaldo() {
        return this.saldo;
    }
}
Solución Ejercicio 3 (Avanzado/Examen): La clase PersonajeRPG
Objetivo: Aprender que los métodos pueden recibir Objetos como parámetros, no solo números o textos. Esto es la base de cómo interactúan las cosas en Java.

Java
public class PersonajeRPG {
    
    private String nombre;
    private int puntosVida;
    private int poderAtaque;
    private int defensa;

    // Constructor
    public PersonajeRPG(String nombre, int puntosVida, int poderAtaque, int defensa) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.poderAtaque = poderAtaque;
        this.defensa = defensa;
    }

    // Método para calcular cuánto daño nos hacen realmente
    public void recibirDaño(int daño) {
        // El daño real se mitiga con nuestra defensa
        int dañoReal = daño - this.defensa;
        
        // Si mi defensa es altísima, el daño real sería negativo. 
        // Para evitar curarme al recibir un ataque, lo igualo a 0.
        if (dañoReal < 0) {
            dañoReal = 0;
        }

        this.puntosVida -= dañoReal; // Restamos la vida
        System.out.println(this.nombre + " recibe " + dañoReal + " puntos de daño. (Vida restante: " + this.puntosVida + ")");
    }

    // ¡EL MÉTODO CLAVE DEL EXAMEN!
    // Fíjate que el parámetro de entrada es una variable de tipo 'PersonajeRPG' (una clase)
    public void atacar(PersonajeRPG objetivo) {
        System.out.println(">>> " + this.nombre + " ataca a " + objetivo.getNombre() + "!");
        
        // Yo (this) llamo al método recibirDaño del otro personaje (objetivo)
        // Y le paso como parámetro MI poder de ataque.
        objetivo.recibirDaño(this.poderAtaque);
    }

    // Getters necesarios
    public String getNombre() { return this.nombre; }
    public int getPuntosVida() { return this.puntosVida; }
}
Y así los haríamos pelear en el Main:

Java
public class MainRPG {
    public static void main(String[] args) {
        // Creamos a los combatientes
        PersonajeRPG heroe = new PersonajeRPG("Arturo", 100, 25, 10);
        PersonajeRPG orco = new PersonajeRPG("Grom", 80, 30, 5);

        // Turno 1: Ataca el héroe
        heroe.atacar(orco); // Arturo ataca a Grom

        // Turno 2: Contraataca el orco
        orco.atacar(heroe); // Grom ataca a Arturo
        
        // Imprime en consola:
        // >>> Arturo ataca a Grom!
        // Grom recibe 20 puntos de daño. (Vida restante: 60)
        // >>> Grom ataca a Arturo!
        // Arturo recibe 20 puntos de daño. (Vida restante: 80)
    }
}