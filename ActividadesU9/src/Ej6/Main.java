package Ej6;

public class Main {

	public static void main(String[] args) {

		Producto[] misProductos = { new Producto("A01", "Informática", 850.50),
				new Producto("A02", "Periféricos", 150.00), new Producto("A03", "Oficina", 25.75),
				new Producto("A05", "Oficina", 29.75),

				new Producto("A04", "Mobiliario", 150.00) };

		Valorable[] arrayParaOrdenar = misProductos;

		System.out.println("ARRAY ORIGINAL (Sin ordenar):");
		mostrarArray(arrayParaOrdenar);

		ordenarPorPrecioAscYNombre(arrayParaOrdenar);

		System.out.println("\n ARRAY ORDENADO (Precio Ascendente + Nombre A-Z):");
		mostrarArray(arrayParaOrdenar);
	}

	static void ordenarPorPrecioAscYNombre(Valorable[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length - 1 - i; j++) {

				boolean necesitaIntercambio = false;

				if (arr[j].getPrecio() > arr[j + 1].getPrecio()) {
					necesitaIntercambio = true;
				}

				else if (arr[j].getPrecio() == arr[j + 1].getPrecio()) {

					if (arr[j].getNombre().compareToIgnoreCase(arr[j + 1].getNombre()) > 0) {
						necesitaIntercambio = true;
					}
				}

				if (necesitaIntercambio) {
					Valorable temporal = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temporal;
				}
			}
		}
	}

	private static void mostrarArray(Valorable[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].toString());
		}
	}
}