package es.iescamas.estructura;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ColaArrayTest {

    private ColaArray cola;

    @BeforeEach
    void setUp() {
        // Inicializamos la cola vacía antes de cada test
        cola = new ColaArray();
    }

    @Test
    void testEnqueueYDequeue() {
        cola.enqueue(100);
        cola.enqueue(200);
        cola.enqueue(300);
        
        // Comprobamos que salen en el mismo orden que entraron (FIFO)
        assertEquals(100, cola.dequeue(), "El primer elemento en salir debe ser el 100");
        assertEquals(200, cola.dequeue(), "El segundo elemento en salir debe ser el 200");
        assertEquals(1, cola.size(), "Debería quedar 1 elemento tras dos dequeue()");
    }

    @Test
    void testFirst() {
        cola.enqueue(50);
        cola.enqueue(60);
        
        // first() debe devolver el primer elemento sin sacarlo de la cola
        assertEquals(50, cola.first(), "first() debe devolver 50");
        assertEquals(2, cola.size(), "El tamaño no debe cambiar después de hacer first()");
    }
}