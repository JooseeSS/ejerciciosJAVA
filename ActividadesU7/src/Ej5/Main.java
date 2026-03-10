package Ej5;

public class Main {
    public static void main(String[] args) {
        
        // 1. Creamos varias cuentas diferentes
        CuentaCorriente c1 = new CuentaCorriente("Pepito Grillo", "11111A");
        CuentaCorriente c2 = new CuentaCorriente("Pinocho", "22222B");
        CuentaCorriente c3 = new CuentaCorriente(5000); // Cuenta anónima

        System.out.println("=== ESTADO INICIAL ===");
        c1.mostrarInformacion(); // Dirá "Banco Central"
        c2.mostrarInformacion(); // Dirá "Banco Central"
        c3.mostrarInformacion(); // Dirá "Banco Central"

        // 2. Cambiamos el nombre del banco
        // Fíjate que no llamamos a c1.cambiar... sino a la CLASE CuentaCorriente
        System.out.println("\n>>> El banco ha sido comprado. Cambiando nombre a 'Gran Banco Java'...\n");
        
        CuentaCorriente.cambiarNombreBanco("Gran Banco Java");

        // 3. Verificamos que TODAS han cambiado sin tocarlas una a una
        System.out.println("=== ESTADO FINAL ===");
        c1.mostrarInformacion(); // ¡Ahora dirá "Gran Banco Java"!
        c2.mostrarInformacion(); // ¡También esta!
        c3.mostrarInformacion(); // ¡Y esta!
    }
}