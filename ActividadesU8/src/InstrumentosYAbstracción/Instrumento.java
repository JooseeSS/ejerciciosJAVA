package InstrumentosYAbstracción;

public abstract class Instrumento {
final int MAX =100;
protected Nota[] melodia;
protected int numNotas;
public Instrumento(Nota[] melodia, int numNotas) {
	super();
	this.melodia = new Nota[MAX];
	this.numNotas = 0;
}
public Nota[] getMelodia() {
	return melodia;
}
public void setMelodia(Nota[] melodia) {
	this.melodia = melodia;
}
public int getNumNotas() {
	return numNotas;
}
public void setNumNotas(int numNotas) {
	this.numNotas = numNotas;
}
public int getMAX() {
	return MAX;
}
	
	public void add(Nota nota) {
	if(numNotas<melodia.length) {
		melodia[numNotas]=nota;
		numNotas++;
	}else
		throw new  IllegalArgumentException("La lista esta completa");

	}
	public abstract void interpretar();
}
