package Ej4;

public class CuentaCorriente {
    
    // 1. SALDO y LIMITE: "private"
    // Solo visibles dentro de esta misma clase (CuentaCorriente).
    // Ninguna otra clase (ni vecina ni externa) puede tocarlos directamente.
    private double saldo;
    private double limiteDescubierto;

    // 2. NOMBRE: "public"
    // Visible desde cualquier lugar del universo (cualquier paquete o clase).
    public String nombre;

    // 3. DNI: (Sin modificador / Default)
    // Al no poner nada, se activa la visibilidad de "paquete" (package-private).
    // Solo visible por clases "vecinas" (que estén en la carpeta Ej4).
    String dni; 

    // -------------------------------------------------------------
    // CONSTRUCTORES Y MÉTODOS (Se mantienen igual para que funcione)
    // -------------------------------------------------------------
    
    public CuentaCorriente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.saldo = 0;
        this.limiteDescubierto = -50;
    }

    public CuentaCorriente(double saldoInicial) {
        this.saldo = saldoInicial;
        this.limiteDescubierto = 0;
    }

    public CuentaCorriente(double saldoInicial, double limiteDescubierto, String dni) {
        this.saldo = saldoInicial;
        this.limiteDescubierto = limiteDescubierto;
        this.dni = dni;
    }

    public boolean sacarDinero(double cantidad) {
        double posibleSaldo = this.saldo - cantidad;
        if (posibleSaldo >= this.limiteDescubierto) {
            this.saldo = posibleSaldo;
            System.out.println("Operación aceptada. Saldo actual: " + this.saldo);
            return true;
        } else {
            System.out.println("Operación denegada.");
            return false;
        }
    }

    public void ingresarDinero(double cantidad) {
        this.saldo += cantidad;
    }

    public void mostrarInformacion() {
        System.out.println("Titular: " + nombre + " | DNI: " + dni + " | Saldo: " + saldo);
    }
}