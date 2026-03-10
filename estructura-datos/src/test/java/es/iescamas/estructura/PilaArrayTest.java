package es.iescamas.estructura;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PilaArrayTest {

    private PilaArray pila;

    @BeforeEach
    void setUp() {
        // Inicializamos la pila antes de cada test para que esté vacía
        pila = new PilaArray();
    }

    @Test
    void testPushYPop() {
        pila.push(10);
        pila.push(20);
        pila.push(30);
        
        // Comprobamos que salen en orden inverso al que entraron (LIFO)
        assertEquals(30, pila.pop(), "El primer elemento en salir debe ser el 30 (la cima)");
        assertEquals(20, pila.pop(), "El segundo elemento en salir debe ser el 20");
        assertEquals(1, pila.size(), "Debería quedar 1 elemento en la pila tras dos pop()");
    }

    @Test
    void testPeek() {
        pila.push(5);
        pila.push(15);
        
        // peek() debe devolver la cima sin sacarla de la pila
        assertEquals(15, pila.peek(), "peek() debe devolver 15");
        assertEquals(2, pila.size(), "El tamaño no debe cambiar después de hacer peek()");
    }

    @Test
    void testPilaVacia() {
        assertTrue(pila.isEmpty(), "La pila debe estar vacía al crearse");
        pila.push(1);
        assertFalse(pila.isEmpty(), "La pila no debe estar vacía tras añadir un elemento");
    }
}