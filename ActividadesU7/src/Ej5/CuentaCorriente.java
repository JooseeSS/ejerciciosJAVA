package Ej5;

public class CuentaCorriente {
    
    // ---------------------------------------------------------
    // NUEVO ATRIBUTO ESTATICO (Compartido por todos)
    // ---------------------------------------------------------
    // Al ser static, solo existe UNA variable nombreBanco en la memoria
    // para todas las cuentas.
    static String nombreBanco = "Banco Central"; 

    // Atributos de instancia (cada cuenta tiene el suyo propio)
    private double saldo;
    private double limiteDescubierto;
    public String nombre;
    String dni;

    // ---------------------------------------------------------
    // NUEVO METODO ESTATICO (Para cambiar el banco de TODOS)
    // ---------------------------------------------------------
    public static void cambiarNombreBanco(String nuevoNombre) {
        nombreBanco = nuevoNombre;
    }

    // --- CONSTRUCTORES (Igual que antes) ---
    public CuentaCorriente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.saldo = 0;
        this.limiteDescubierto = -50;
    }

    public CuentaCorriente(double saldo) {
        this.saldo = saldo;
        this.limiteDescubierto = 0;
    }

    // --- METODOS (Ligeramente modificados para mostrar el banco) ---

    public boolean sacarDinero(double cantidad) {
        if ((saldo - cantidad) >= limiteDescubierto) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }

    public void ingresarDinero(double cantidad) {
        saldo += cantidad;
    }

    public void mostrarInformacion() {
        System.out.println("--- " + nombreBanco + " ---"); // Mostramos el banco
        System.out.println("Titular: " + (nombre != null ? nombre : "Sin titular"));
        System.out.println("Saldo: " + saldo);
        System.out.println("-------------------------");
    }
}