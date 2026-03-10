package es.iescamas.estructura;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ListaArrayTest {

    private ListaArray lista;

    /**
     * Este método se ejecuta antes de CADA test. 
     * Nos asegura que siempre empezamos con una lista limpia y vacía.
     */
    @BeforeEach
    void setUp() {
        lista = new ListaArray();
    }

    @Test
    void testAddFinalYSize() {
        lista.addFinal(10);
        lista.addFinal(20);
        
        // Comprobamos que el tamaño es correcto tras añadir
        assertEquals(2, lista.size(), "El tamaño de la lista debería ser 2");
        // Comprobamos que los elementos están en el orden correcto
        assertEquals(10, lista.get(0), "El primer elemento debería ser 10");
        assertEquals(20, lista.get(1), "El segundo elemento debería ser 20");
    }

    @Test
    void testRemove() {
        lista.addFinal(5);
        lista.addFinal(15);
        lista.addFinal(25);
        
        // Eliminamos el elemento de la posición 1 (el valor 15)
        Integer eliminado = lista.remove(1);
        
        assertEquals(15, eliminado, "El valor eliminado debería ser 15");
        assertEquals(2, lista.size(), "El tamaño debería reducirse a 2 tras borrar");
        // Comprobamos el desplazamiento a la izquierda: el 25 debió moverse a la posición 1
        assertEquals(25, lista.get(1), "El valor 25 debió desplazarse a la posición 1");
    }

    @Test
    void testRedimensionamiento() {
        // Añadimos 15 elementos para forzar que el array original (de 10) crezca
        for (int i = 0; i < 15; i++) {
            lista.addFinal(i);
        }
        
        assertEquals(15, lista.size(), "La lista debería haber crecido y contener 15 elementos");
        assertEquals(14, lista.get(14), "El último elemento debería ser 14");
    }
}