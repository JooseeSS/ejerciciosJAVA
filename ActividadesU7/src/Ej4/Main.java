package Ej4;

public class Main {
    public static void main(String[] args) {
        
        // Creamos la cuenta para probar
        CuentaCorriente c = new CuentaCorriente("Ana Gómez", "12345678Z");

        System.out.println("--- COMPROBANDO VISIBILIDAD ---");

        // 1. PRUEBA DE NOMBRE (Public)
        // Esto DEBE funcionar porque es public.
        c.nombre = "Ana María Gómez"; 
        System.out.println("Nombre modificado directamente: " + c.nombre);


        // 2. PRUEBA DE DNI (Package / Default)
        // Esto DEBE funcionar porque Main y CuentaCorriente están en el mismo paquete (Ej4).
        // Son "vecinos".
        c.dni = "99999999A"; 
        System.out.println("DNI modificado directamente (vecino): " + c.dni);


        // 3. PRUEBA DE SALDO (Private)
        // Esto NO debe funcionar. Si quitas las barras (//) verás que Eclipse lo subraya en rojo.
        // Dice: "The field CuentaCorriente.saldo is not visible"
        
        // c.saldo = 50000;  // <--- ¡ERROR! No puedes tocarlo.
        // System.out.println(c.saldo); // <--- ¡ERROR! No puedes leerlo.


        // 4. PRUEBA DE LÍMITE (Private)
        // Mismo caso, está protegido.
        
        // c.limiteDescubierto = -1000; // <--- ¡ERROR!
        

        System.out.println("\nPara modificar el saldo, estamos obligados a usar los métodos públicos:");
        c.ingresarDinero(100); // Esto sí funciona, es la "puerta" correcta.
        c.mostrarInformacion();
    }
}