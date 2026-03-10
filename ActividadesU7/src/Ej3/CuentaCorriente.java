package Ej3;

public class CuentaCorriente {
    
    private double saldo;
    private double limiteDescubierto;
    public String nombre;
    public String dni;

    // ---------------- CONSTRUCTORES SOBRECARGADOS ----------------

    // Constructor 1: El original (Nombre y DNI). Saldo 0, Límite -50.
    public CuentaCorriente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.saldo = 0;
        this.limiteDescubierto = -50;
    }

    // Constructor 2: Solo saldo inicial. Sin titular. Límite 0.
    public CuentaCorriente(double saldoInicial) {
        this.saldo = saldoInicial;
        this.limiteDescubierto = 0; // Requisito explícito
        // nombre y dni se quedan en null automáticamente al no asignarlos
    }

    // Constructor 3: Saldo, límite y DNI. (Sin nombre según enunciado).
    public CuentaCorriente(double saldoInicial, double limiteDescubierto, String dni) {
        this.saldo = saldoInicial;
        this.limiteDescubierto = limiteDescubierto;
        this.dni = dni;
        // nombre se queda en null
    }

    // ---------------- MÉTODOS (Igual que antes) ----------------

    public boolean sacarDinero(double cantidad) {
        double posibleSaldo = this.saldo - cantidad;
        if (posibleSaldo >= this.limiteDescubierto) {
            this.saldo = posibleSaldo;
            System.out.println("Operación aceptada: Se han retirado " + cantidad + " euros.");
            return true;
        } else {
            System.out.println("Operación denegada: Supera el límite de descubierto.");
            return false;
        }
    }

    public void ingresarDinero(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            System.out.println("Se han ingresado " + cantidad + " euros.");
        } else {
            System.out.println("La cantidad a ingresar debe ser positiva.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("\n--- Información de la Cuenta ---");
        // Usamos un operador ternario para que no imprima "null" si no hay nombre
        System.out.println("Titular: " + (this.nombre != null ? this.nombre : "No asignado"));
        System.out.println("DNI: " + (this.dni != null ? this.dni : "No asignado"));
        System.out.println("Saldo actual: " + this.saldo + " euros");
        System.out.println("Límite de descubierto: " + this.limiteDescubierto + " euros");
        System.out.println("--------------------------------\n");
    }
}