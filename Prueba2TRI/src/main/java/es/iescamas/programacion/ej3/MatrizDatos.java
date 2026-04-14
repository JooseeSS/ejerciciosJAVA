package es.iescamas.programacion.ej3;

public class MatrizDatos implements OperableMatriz {
	private int[][] datos;

	public MatrizDatos(int[][] datos) {
		super();
		this.datos = datos;
	}

	public int[][] getDatos() {
		return datos;
	}

	public void setDatos(int[][] datos) {
		this.datos = datos;
	}

	@Override
	public int[][] sumar(int[][] otra) {
		if (otra.length != datos.length || otra == null) {
			throw new IllegalArgumentException("Las matrices deben tener el mismo tamaño y no pueden ser nulas");
		}

		int[][] matrizSumada = new int[datos.length][datos.length];

		for (int fila = 0; fila < datos.length; fila++) {
			for (int col = 0; col < datos[fila].length; col++) {

				matrizSumada[col][fila] = datos[col][fila] + otra[col][fila];

			}
		}

		return matrizSumada;

	}

	@Override
	public void mostrarResultado() {
		/*
		 * Yo entiendo que este metido debe imprimir lo que seria matrizSumada pero
		 * claro esa matriz es propia de un metodo entonces no se como seria del todo
		 * pero claro si lo que hay que imprimir es la matriz datos sería así
		 * System.out.println(datos.toString());
		 */
		int[][] matrizSumada = (sumar(datos));
		for (int fila = 0; fila < matrizSumada.length; fila++) {
			for (int col = 0; col < matrizSumada[fila].length; col++) {
				System.out.println(matrizSumada[fila][col]);
			}
		}
		System.out.println(sumar(datos));

	}
}
