package Ej1;

public class HoraExacta extends Hora{
private int segundo;

public HoraExacta(int hora, int minuto, int segundo) {
	super(hora, minuto);
	this.segundo = segundo;
}

public int getSegundo() {
	return segundo;
}

public void setSegundo(int segundo) {
	this.segundo = segundo;
}
public boolean setSegundos(int valor) {
	if(valor>=0&&valor<60) {
		this.segundo=valor;
		return true;
	}
	return false;
}
public void inc() {
	this.segundo++;
	if(this.segundo>=60) {
		this.segundo=0;
		super.inc();
	}
}
/* Compara si la hora actual (this) es igual a otra hora recibida.
* @param otraHora El objeto con el que queremos comparar.
* @return true si hora, minutos y segundos coinciden; false si son distintas.
*/
public boolean esIgual(HoraExacta otraHora) {
   // Comparamos los tres atributos: hora, minutos y segundos.
   // Usamos '&&' porque TODAS las condiciones deben ser verdaderas.
   boolean horasIguales = this.hora == otraHora.hora;
   boolean minutosIguales = this.minuto == otraHora.minuto;
   boolean segundosIguales = this.segundo == otraHora.segundo;

   return horasIguales && minutosIguales && segundosIguales;
   
   // Versión resumida en una sola línea (para programadores pro):
   // return this.hora == otraHora.hora && this.minutos == otraHora.minutos && this.segundos == otraHora.segundos;
}
public String toString() {
    return String.format("%02d:%02d:%02d", super.hora, super.minuto, this.segundo);
}
}
