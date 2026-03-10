package Ej1;

public class CuentaCorriente {
    
    // Atributos (Datos necesarios)
    private double saldo;
    private double limiteDescubierto;
    public String nombre; // Público para facilitar el acceso, o podrías usar getters
    public String dni;

    // Constructor: Se necesita nombre y DNI. Saldo 0 y límite -50 por defecto.
    public CuentaCorriente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.saldo = 0;
        this.limiteDescubierto = -50;
    }

    // Método para sacar dinero
    // Devuelve true si la operación fue posible, false si no.
    public boolean sacarDinero(double cantidad) {
        // Calculamos cuánto quedaría si sacamos el dinero
        double posibleSaldo = this.saldo - cantidad;

        // Solo permitimos la operación si el resultado es mayor o igual al límite (-50)
        if (posibleSaldo >= this.limiteDescubierto) {
            this.saldo = posibleSaldo;
            System.out.println("Operación aceptada: Se han retirado " + cantidad + " euros.");
            return true;
        } else {
            System.out.println("Operación denegada: Supera el límite de descubierto.");
            return false;
        }
    }

    // Método para ingresar dinero
    public void ingresarDinero(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            System.out.println("Se han ingresado " + cantidad + " euros.");
        } else {
            System.out.println("La cantidad a ingresar debe ser positiva.");
        }
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("\n--- Información de la Cuenta ---");
        System.out.println("Titular: " + this.nombre);
        System.out.println("DNI: " + this.dni);
        System.out.println("Saldo actual: " + this.saldo + " euros");
        System.out.println("Límite de descubierto: " + this.limiteDescubierto + " euros");
        System.out.println("--------------------------------\n");
    }
}
