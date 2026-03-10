package InstrumentosYAbstracción;

public class Piano extends Instrumento{
	public Piano(Nota[] melodia, int numNotas) {
		super(melodia, numNotas);
		
	}

@Override
	public void interpretar() {
		System.out.println("El piano esta sonando");
		for(int i=0;i<super.numNotas;i++) {
			System.out.println(i);
		}
	}
}
