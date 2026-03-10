package es.iescamas.estructura;

public class ColaArray extends ListaArray {

    public ColaArray() {
        super();
    }

    /**
     * Encola un elemento (al final de la cola).
     */
    public void enqueue(Integer n) {
        this.addFinal(n);
    }

    /**
     * Desencola un elemento (el primero que entró).
     */
    public Integer dequeue() {
        if (isEmpty()) return null;
        // Al eliminar la posición 0, el método remove() de la clase padre 
        // ya se encarga de desplazar el resto a la izquierda (simulando que la cola avanza)
        return this.remove(0); 
    }

    /**
     * Consulta el primer elemento sin eliminarlo.
     */
    public Integer first() {
        if (isEmpty()) return null;
        return this.get(0);
    }

    /**
     * Comprueba si la cola está vacía.
     */
    public boolean isEmpty() {
        return this.size() == 0;
    }
}