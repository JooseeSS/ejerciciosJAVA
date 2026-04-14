package es.iescamas.programacion.ej3;

public class MatrizCuadrada extends MatrizDatos{

	public MatrizCuadrada(int[][] datos) {
		super(datos);
		// TODO Auto-generated constructor stub
	}
@Override
public void mostrarResultado() {
	int[][] matrizSumada = (sumar(super.getDatos()));
	for (int fila = 0; fila < matrizSumada.length; fila++) {
		for (int col = 0; col < matrizSumada[fila].length; col++) {
			System.out.println(matrizSumada[fila][col]);
		}
	}

	System.out.println(sumar(super.getDatos())+ "Matriz Cuadrada: " + getDatos().length+" x "+getDatos().length);

}
}
