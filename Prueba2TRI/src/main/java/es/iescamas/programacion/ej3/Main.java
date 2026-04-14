package es.iescamas.programacion.ej3;

public class Main {

	public static void main(String[] args) {
		int[][] m1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] m2 = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
		MatrizDatos miMatriz = new MatrizDatos(m1);
		MatrizCuadrada miMatrizCuadrada= new MatrizCuadrada(m2);
		
		OperableMatriz[] matrices = {miMatriz,miMatrizCuadrada};
		for (OperableMatriz operableMatriz : matrices) {
			operableMatriz.mostrarResultado();
		}
	}

}
