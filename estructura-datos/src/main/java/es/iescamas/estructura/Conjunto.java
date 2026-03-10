package es.iescamas.estructura;

public class Conjunto extends ConjuntoArray {

    /**
     * Constructor por defecto.
     */
    public Conjunto() {
        super();
    }

    /**
     * Devuelve la cantidad de elementos.
     */
    public int numeroElementos() {
        return this.size();
    }

    /**
     * Inserta un número (aprovecha la lógica sin duplicados del padre).
     */
    public boolean insertar(Integer n) {
        return this.add(n); 
    }

    /**
     * Recorre el otro conjunto y añade sus elementos a este.
     */
    public void anadirElementosDe(Conjunto otro) {
        for (int i = 0; i < otro.numeroElementos(); i++) {
            this.insertar(otro.get(i));
        }
    }

    /**
     * Elimina un elemento concreto.
     */
    public boolean eliminarElemento(Integer n) {
        return this.removeValue(n);
    }

    /**
     * Elimina de este conjunto todos los elementos que coincidan con el otro.
     */
    public void eliminarTodos(Conjunto otro) {
        for (int i = 0; i < otro.numeroElementos(); i++) {
            this.eliminarElemento(otro.get(i));
        }
    }

    /**
     * Comprueba si un elemento está en el conjunto.
     */
    public boolean pertenece(Integer n) {
        return this.contains(n);
    }

    /**
     * Representación en formato cadena tipo conjunto matemático: { 1, 2, 3 }
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{ ");
        for (int i = 0; i < this.size(); i++) {
            sb.append(this.get(i));
            if (i < this.size() - 1) sb.append(", ");
        }
        sb.append(" }");
        return sb.toString();
    }

    /**
     * Busca y devuelve el valor más pequeño del conjunto.
     */
    public int minimo() {
        if (this.size() == 0) return 0;
        int min = this.get(0);
        for (int i = 1; i < this.size(); i++) {
            if (this.get(i) < min) min = this.get(i);
        }
        return min;
    }

    /**
     * Busca y devuelve el valor más grande del conjunto.
     */
    public int maximo() {
        if (this.size() == 0) return 0;
        int max = this.get(0);
        for (int i = 1; i < this.size(); i++) {
            if (this.get(i) > max) max = this.get(i);
        }
        return max;
    }

    /**
     * Calcula la media aritmética de los elementos.
     */
    public double media() {
        if (this.size() == 0) return 0.0;
        double suma = 0;
        for (int i = 0; i < this.size(); i++) {
            suma += this.get(i);
        }
        return suma / this.size();
    }

   

    /**
     * Comprueba si c1 está totalmente incluido en c2 (c1 es subconjunto de c2).
     */
    public static boolean incluido(Conjunto c1, Conjunto c2) {
        for (int i = 0; i < c1.numeroElementos(); i++) {
            if (!c2.pertenece(c1.get(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Unión: Todos los elementos de c1 y c2 juntos.
     */
    public static Conjunto union(Conjunto c1, Conjunto c2) {
        Conjunto resultado = new Conjunto();
        resultado.anadirElementosDe(c1);
        resultado.anadirElementosDe(c2);
        return resultado; // Al insertarlos en "resultado", ya se filtran los repetidos
    }

    /**
     * Intersección: Solo los elementos que están presentes en c1 Y en c2 a la vez.
     */
    public static Conjunto interseccion(Conjunto c1, Conjunto c2) {
        Conjunto resultado = new Conjunto();
        for (int i = 0; i < c1.numeroElementos(); i++) {
            Integer elemento = c1.get(i);
            if (c2.pertenece(elemento)) {
                resultado.insertar(elemento);
            }
        }
        return resultado;
    }

    /**
     * Diferencia: Elementos que están en c1 pero NO están en c2.
     */
    public static Conjunto diferencia(Conjunto c1, Conjunto c2) {
        Conjunto resultado = new Conjunto();
        for (int i = 0; i < c1.numeroElementos(); i++) {
            Integer elemento = c1.get(i);
            if (!c2.pertenece(elemento)) {
                resultado.insertar(elemento);
            }
        }
        return resultado;
    }
}