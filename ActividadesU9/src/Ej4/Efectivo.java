package Ej4;

public class Efectivo implements MetodoPago{
private double dineroCartera;

public Efectivo(double dineroCartera) {
	super();
	this.dineroCartera = dineroCartera;
}

@Override
public boolean pagar(double importe) {
	if (importe > dineroCartera) {
        System.out.println("❌ Efectivo insuficiente: Solo llevas " + dineroCartera + "€ encima.");
        return false;
    }
    
    this.dineroCartera -= importe;
    System.out.println("💵 Pago de " + importe + "€ realizado en metálico. Te quedan " + this.dineroCartera + "€ en la cartera.");
    return true;
}
}
