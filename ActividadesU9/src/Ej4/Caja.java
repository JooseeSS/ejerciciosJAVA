package Ej4;

public class Caja {
    
    public void cobrar(MetodoPago mp, double importe) {
        System.out.println("🛒 Procesando cobro de " + importe + "€...");
        
        boolean exito = mp.pagar(importe); 
        
                if (exito) {
            System.out.println("✅ TICKET: Operación registrada con éxito en la caja.\n");
        } else {
            System.out.println("⚠️ TICKET CANCELADO: Por favor, intente con otro método de pago.\n");
        }
    }
}