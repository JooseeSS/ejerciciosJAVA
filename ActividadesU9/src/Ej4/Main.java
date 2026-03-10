package Ej4;

public class Main {

    public static void main(String[] args) {
        
        Caja caja = new Caja();
/*List<MetodoPago> carteraLista = new ArrayList<>();
        
     
        carteraLista.add(miTarjeta);
        carteraLista.add(miBizum);
        carteraLista.add(miEfectivo);

     
        for (MetodoPago metodo : carteraLista) {
            System.out.println("Intento de pago con ArrayList (Importe: 60.0€)");
            caja.cobrar(metodo, 60.0);
        }*/
        // Preparamos nuestras carteras
        MetodoPago miTarjeta = new Tarjeta(100.0, 50.0); // 100€ de saldo, 50€ de límite
        MetodoPago miBizum = new Bizum(200.0, "612345678");
        MetodoPago miEfectivo = new Efectivo(20.0); // Solo llevo un billete de 20€

        // 1. Pago correcto con tarjeta
        caja.cobrar(miTarjeta, 30.0);

        // 2. Pago que falla con tarjeta (supera el límite de 50€)
        caja.cobrar(miTarjeta, 60.0);

        // 3. Pago correcto con Bizum
        caja.cobrar(miBizum, 150.0);

        // 4. Pago que falla en efectivo (cuesta 50 y llevo 20)
        caja.cobrar(miEfectivo, 50.0);
    }
}