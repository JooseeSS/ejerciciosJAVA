package es.iescamas.programacion.ej2;

public class Main {

	public static void main(String[] args) {
		LIbro miLibro = new LIbro("Los Gladiadores", "Aitana Soriano ", 2006, 21.10);
		LibroDigital miLibroDigital = new LibroDigital("Vida y Placeres", "Juan Serrano ", 1889, 57.80, "Epub");
		Catalogable[] misLibros = { miLibro, miLibroDigital };
		for (Catalogable catalogable : misLibros) {
			catalogable.mostrarEnCatalogo();
		}
		/*
		 * Se heredan todos los atributos y el contructor se pone con super y para
		 * machacar el metodo ponemos override y java se encagrga solo de usar el metodo
		 * dependiendo del objeto que sea
		 */
	}

}
