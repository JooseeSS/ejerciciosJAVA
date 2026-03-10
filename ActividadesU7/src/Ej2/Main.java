package Ej2;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- CUENTA 1 (Constructor Original) ---");
        CuentaCorriente c1 = new CuentaCorriente("Juan Pérez", "11111111A");
        c1.mostrarInformacion();

        System.out.println("--- CUENTA 2 (Solo Saldo) ---");
        // Usará el constructor que pone el límite a 0 y sin titular
        CuentaCorriente c2 = new CuentaCorriente(1000); 
        c2.mostrarInformacion();
        
        // Probamos el límite de 0 de la cuenta 2
        System.out.println("Intentando sacar 1001 euros de la Cuenta 2...");
        c2.sacarDinero(1001); // Debería fallar porque el límite es 0

        System.out.println("\n--- CUENTA 3 (Saldo, Límite, DNI) ---");
        // Usará el tercer constructor
        CuentaCorriente c3 = new CuentaCorriente(500, -100, "22222222B");
        c3.mostrarInformacion();
    }
}