package InstrumentosYAbstracción;

public class Campana extends Instrumento{

	public Campana(Nota[] melodia, int numNotas) {
		super(melodia, numNotas);
	}
	@Override
	public void interpretar() {
		System.out.println("El la campana esta sonando");
		for(int i=0;i<super.numNotas;i++) {
			System.out.println(i);
		}
	}
}
