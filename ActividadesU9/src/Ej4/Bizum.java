package Ej4;

public class Bizum implements MetodoPago{
private double saldo;
private String telefono;
public Bizum(double saldo, String telefono) {
    this.saldo = saldo;
    this.telefono = telefono;
}
@Override
public boolean pagar(double importe) {
	if (importe > saldo) {
        System.out.println("❌ Bizum fallido: No tienes saldo suficiente en la cuenta vinculada.");
        return false;
    }
    
    this.saldo -= importe;
    System.out.println("📱 Pago de " + importe + "€ enviado por Bizum desde el " + telefono + ".");
    return true;
}



}
