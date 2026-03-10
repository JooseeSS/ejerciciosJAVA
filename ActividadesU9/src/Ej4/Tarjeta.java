package Ej4;

public class Tarjeta implements MetodoPago{
private double saldoDisponible;
private double limite;
public Tarjeta(double saldoDisponible, double limite) {
    this.saldoDisponible = saldoDisponible;
    this.limite = limite;
}
	@Override
	public boolean pagar(double importe) {
		if(importe>limite) {
			System.out.println("supera el limite");
			return false;
		}
		if(importe>saldoDisponible) {
			System.out.println("no hay dinero suficiente");
			return false;
		}
		this.saldoDisponible-=importe;
		System.out.println("Pago de " + importe + "€ aceptado con Tarjeta. Saldo restante: " + this.saldoDisponible + "€");
        return true;
	}

}
