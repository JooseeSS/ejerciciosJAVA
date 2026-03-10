package es.iescamas.estructura;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConjuntoArrayTest {

    private ConjuntoArray conjuntoBase;

    @BeforeEach
    void setUp() {
        // Inicializamos el conjunto base
        conjuntoBase = new ConjuntoArray();
    }

    @Test
    void testAddSinDuplicados() {
        assertTrue(conjuntoBase.add(1), "Debe permitir añadir el 1 por primera vez");
        assertTrue(conjuntoBase.add(2), "Debe permitir añadir el 2");
        
        // Intentamos añadir un duplicado
        assertFalse(conjuntoBase.add(1), "Debe devolver false al intentar añadir el 1 de nuevo");
        assertEquals(2, conjuntoBase.size(), "El tamaño debe ser 2, el duplicado se ignora");
    }

    @Test
    void testRemoveValue() {
        conjuntoBase.add(10);
        conjuntoBase.add(20);
        
        // Eliminamos por valor, no por índice
        assertTrue(conjuntoBase.removeValue(10), "Debe devolver true al eliminar el 10");
        assertFalse(conjuntoBase.contains(10), "El 10 ya no debe estar en el conjunto");
        assertFalse(conjuntoBase.removeValue(99), "Debe devolver false si intentamos borrar un valor que no existe");
    }
}