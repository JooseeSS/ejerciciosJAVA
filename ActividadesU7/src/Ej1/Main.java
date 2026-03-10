package Ej1;

public class Main {
    public static void main(String[] args) {
        // 1. Crear la cuenta (Solo pide Nombre y DNI)
        CuentaCorriente miCuenta = new CuentaCorriente("Juan Pérez", "12345678Z");

        // Mostramos el estado inicial (Saldo debe ser 0)
        miCuenta.mostrarInformacion();

        // 2. Ingresar dinero
        miCuenta.ingresarDinero(100);
        
        // 3. Sacar dinero (Operación válida)
        // Tenemos 100, sacamos 50. Quedan 50.
        miCuenta.sacarDinero(50); 
        
        // 4. Sacar dinero hasta entrar en descubierto (Operación válida)
        // Tenemos 50. Sacamos 80. Saldo será -30 (permitido porque límite es -50)
        miCuenta.sacarDinero(80);
        
        miCuenta.mostrarInformacion(); // Verificamos saldo negativo

        // 5. Sacar dinero superando el límite (Operación denegada)
        // Tenemos -30. Queremos sacar 30 más. El resultado sería -60.
        // Como -60 es menor que -50, no debería dejar.
        boolean resultado = miCuenta.sacarDinero(30);
        
        System.out.println("¿Pudo sacar el dinero extra?: " + resultado);
    }
}
