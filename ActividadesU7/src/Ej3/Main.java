package Ej3; // Esta línea es importante porque estás en la carpeta Ej3

public class Main {
    public static void main(String[] args) {

        System.out.println("--- INICIO DE PRUEBAS DEL EJERCICIO 3 ---\n");

        // -------------------------------------------------------------
        // PRUEBA 1: Constructor con Nombre y DNI (Saldo 0, Límite -50)
        // -------------------------------------------------------------
        System.out.println(">>> 1. Probando Constructor (Nombre, DNI)");
        CuentaCorriente cuenta1 = new CuentaCorriente("Juan Pérez", "11111111H");
        
        cuenta1.mostrarInformacion();
        
        System.out.println("* Ingresamos 100 euros:");
        cuenta1.ingresarDinero(100);
        
        System.out.println("* Sacamos 50 euros (Posible):");
        cuenta1.sacarDinero(50);
        
        System.out.println("* Intentamos sacar 200 euros (Imposible, supera límite -50):");
        cuenta1.sacarDinero(200); 
        
        System.out.println("-------------------------------------------------------------\n");


        // -------------------------------------------------------------
        // PRUEBA 2: Constructor solo con Saldo (Sin titular, Límite 0)
        // -------------------------------------------------------------
        System.out.println(">>> 2. Probando Constructor (Solo Saldo)");
        CuentaCorriente cuenta2 = new CuentaCorriente(2000); // Saldo inicial 2000
        
        cuenta2.mostrarInformacion();
        
        System.out.println("* Sacamos 2000 euros (Queda a 0):");
        cuenta2.sacarDinero(2000);
        
        System.out.println("* Intentamos sacar 1 euro (Imposible, límite es 0):");
        cuenta2.sacarDinero(1);
        
        System.out.println("-------------------------------------------------------------\n");


        // -------------------------------------------------------------
        // PRUEBA 3: Constructor Completo (Saldo, Límite, DNI)
        // -------------------------------------------------------------
        System.out.println(">>> 3. Probando Constructor (Saldo, Límite, DNI)");
        // Creamos una cuenta con 100 de saldo y límite de -100
        CuentaCorriente cuenta3 = new CuentaCorriente(100, -100, "22222222J");
        
        cuenta3.mostrarInformacion();
        
        System.out.println("* Sacamos 200 euros (Debe permitirlo y quedar en -100):");
        cuenta3.sacarDinero(200); // 100 - 200 = -100 (Justo el límite)
        
        cuenta3.mostrarInformacion(); // Verificamos que el saldo sea -100
    }
}