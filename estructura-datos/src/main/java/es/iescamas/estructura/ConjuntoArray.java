package es.iescamas.estructura;

public class ConjuntoArray extends ListaArray {

    /**
     * Constructor por defecto que llama al de ListaArray.
     */
    public ConjuntoArray() {
        super();
    }

    /**
     * Comprueba si un número ya existe en el conjunto.
     * Reutiliza el método indexOf de la clase padre.
     */
    public boolean contains(Integer n) {
        return this.indexOf(n) != -1;
    }

    /**
     * Añade un número solo si no existe previamente (sin duplicados).
     */
    public boolean add(Integer n) {
        if (!this.contains(n)) {
            this.addFinal(n);
            return true; // Se añadió con éxito
        }
        return false; // Ya existía, no se añade
    }

    /**
     * Elimina un número concreto buscando su valor (no su índice).
     */
    public boolean removeValue(Integer n) {
        int index = this.indexOf(n);
        if (index != -1) {
            this.remove(index); // Reutiliza el remove(index) de la clase padre
            return true;
        }
        return false;
    }
}