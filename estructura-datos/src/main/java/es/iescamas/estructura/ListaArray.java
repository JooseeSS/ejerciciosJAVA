package es.iescamas.estructura;

public class ListaArray {
    
    protected Integer[] tabla;
    protected int numElementos;

    /**
     * Constructor por defecto. Inicializa el array con tamaño 10 
     * (como se muestra en la diapositiva) y 0 elementos.
     */
    public ListaArray() {
        this.tabla = new Integer[10];
        this.numElementos = 0;
    }

    /**
     * Método auxiliar privado para ampliar la capacidad del array.
     * Se llama automáticamente cuando intentamos añadir y el array está lleno.
     */
    private void ampliarCapacidad() {
        Integer[] nuevaTabla = new Integer[this.tabla.length * 2];
        for (int i = 0; i < this.numElementos; i++) {
            nuevaTabla[i] = this.tabla[i];
        }
        this.tabla = nuevaTabla;
    }

    /**
     * Devuelve el número real de elementos almacenados.
     */
    public int size() {
        return this.numElementos;
    }

    /**
     * Añade un número al final de la lista.
     */
    public void addFinal(Integer n) {
        // Si el array está lleno, lo redimensionamos antes de añadir
        if (this.numElementos == this.tabla.length) {
            ampliarCapacidad();
        }
        this.tabla[this.numElementos] = n;
        this.numElementos++;
    }

    /**
     * Devuelve el elemento en la posición indicada.
     */
    public Integer get(int index) {
        if (index < 0 || index >= this.numElementos) {
            return null; // O podríamos lanzar una excepción IndexOutOfBoundsException
        }
        return this.tabla[index];
    }

    /**
     * Elimina el elemento en la posición indicada y desplaza el resto a la izquierda.
     */
    public Integer remove(int index) {
        if (index < 0 || index >= this.numElementos) {
            return null;
        }
        
        Integer valorEliminado = this.tabla[index];
        
        // Desplazamos los elementos hacia la izquierda para rellenar el hueco
        for (int i = index; i < this.numElementos - 1; i++) {
            this.tabla[i] = this.tabla[i + 1];
        }
        
        this.numElementos--; // Reducimos el contador
        this.tabla[this.numElementos] = null; // Limpiamos la última posición por limpieza
        
        return valorEliminado;
    }

    /**
     * Busca un número y devuelve su índice. Si no existe, devuelve -1.
     */
    public int indexOf(Integer n) {
        for (int i = 0; i < this.numElementos; i++) {
            // Usamos .equals() porque estamos comparando objetos Integer
            if (this.tabla[i].equals(n)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Representación en formato texto de la lista.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < this.numElementos; i++) {
            sb.append(this.tabla[i]);
            if (i < this.numElementos - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}