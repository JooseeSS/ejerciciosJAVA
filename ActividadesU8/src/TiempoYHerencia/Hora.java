package Ej1;

public class Hora {
protected int hora=0;
protected int minuto=0;
public Hora(int hora, int minuto) {
	super();
	this.hora = hora;
	this.minuto = minuto;
}
public int getHora() {
	return hora;
}
public void setHora(int hora) {
	this.hora = hora;
}
public int getMinuto() {
	return minuto;
}
public void setMinuto(int minuto) {
	this.minuto = minuto;
}

	public void inc() {
		minuto++;
		if(minuto==60) {
			minuto=0;
			hora++;
			if(hora==24) {
			minuto=0;
			hora=0;
				}
			}
		}
	
	public  boolean setMinutos(int valor) {
		if(valor>=0&&valor<60) {
			this.minuto=valor;
			return true;
		}
		return false;
	}
	public boolean setHoras(int valor) {
		if(valor>=0&&valor<60) {
			this.hora=valor;
			return true;
		}
		return false;
	}
	
	
public String toString() {
return String.format("%02d:%02d",hora, minuto);

}

}
