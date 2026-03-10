package es.iescamas.estructura;

public class PilaArray extends ListaArray {

    public PilaArray() {
        super(); // Llama al constructor de ListaArray
    }

    /**
     * Apila un elemento (lo pone en la cima).
     */
    public void push(Integer n) {
        this.addFinal(n); // Aprovechamos el método de la clase padre
    }

    /**
     * Desapila y devuelve el elemento de la cima.
     */
    public Integer pop() {
        if (isEmpty()) return null;
        // La cima es el último elemento añadido
        return this.remove(this.size() - 1); 
    }

    /**
     * Devuelve el elemento de la cima sin eliminarlo.
     */
    public Integer peek() {
        if (isEmpty()) return null;
        return this.get(this.size() - 1);
    }

    /**
     * Comprueba si la pila está vacía.
     */
    public boolean isEmpty() {
        return this.size() == 0;
    }
}