package es.iescamas.estructura;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConjuntoTest {

    private Conjunto c1;
    private Conjunto c2;

    @BeforeEach
    void setUp() {
        // Inicializamos los conjuntos limpios antes de cada test
        c1 = new Conjunto();
        c2 = new Conjunto();
    }

    @Test
    void testInsertarYNumeroElementos() {
        assertTrue(c1.insertar(10), "Debe permitir insertar un número nuevo");
        assertTrue(c1.insertar(20), "Debe permitir insertar otro número nuevo");
        assertFalse(c1.insertar(10), "No debe insertar un número si ya existe (duplicado)");
        
        assertEquals(2, c1.numeroElementos(), "El número de elementos debe ser 2, ignorando duplicados");
    }

    @Test
    void testPertenece() {
        c1.insertar(5);
        
        assertTrue(c1.pertenece(5), "El conjunto debe confirmar que el 5 pertenece a él");
        assertFalse(c1.pertenece(99), "El conjunto debe devolver false para un elemento que no existe");
    }

    @Test
    void testAnadirElementosDe() {
        c1.insertar(1);
        c1.insertar(2);
        
        c2.insertar(2); 
        c2.insertar(3);
        c2.insertar(4);
        
        c1.anadirElementosDe(c2);
        
        assertEquals(4, c1.numeroElementos(), "c1 debe tener ahora 4 elementos (el 2 no se duplica)");
        assertTrue(c1.pertenece(1) && c1.pertenece(2) && c1.pertenece(3) && c1.pertenece(4), "c1 debe contener 1, 2, 3 y 4");
    }

    @Test
    void testEliminarElemento() {
        c1.insertar(5);
        c1.insertar(15);
        
        assertTrue(c1.eliminarElemento(5), "Debe devolver true al eliminar un elemento existente");
        assertFalse(c1.pertenece(5), "El 5 ya no debe pertenecer al conjunto");
        assertEquals(1, c1.numeroElementos(), "Solo debe quedar 1 elemento");
        assertFalse(c1.eliminarElemento(99), "Debe devolver false al intentar borrar algo que no existe");
    }

    @Test
    void testEliminarTodos() {
        c1.insertar(1);
        c1.insertar(2);
        c1.insertar(3);
        c1.insertar(4);
        
        c2.insertar(2);
        c2.insertar(3);
        c2.insertar(99); // Este no está en c1, no debería afectar
        
        c1.eliminarTodos(c2);
        
        assertEquals(2, c1.numeroElementos(), "c1 solo debe quedarse con 2 elementos");
        assertTrue(c1.pertenece(1) && c1.pertenece(4), "c1 debe contener el 1 y el 4");
        assertFalse(c1.pertenece(2) || c1.pertenece(3), "c1 no debe contener ni el 2 ni el 3");
    }

    @Test
    void testToString() {
        c1.insertar(7);
        c1.insertar(8);
        c1.insertar(9);
        
        String resultado = c1.toString();
        assertEquals("{ 7, 8, 9 }", resultado, "El toString debe devolver exactamente el formato esperado");
        
        Conjunto vacio = new Conjunto();
        assertEquals("{  }", vacio.toString(), "Un conjunto vacío debe devolver {  }");
    }

    @Test
    void testMinimo() {
        c1.insertar(10);
        c1.insertar(5);
        c1.insertar(15);
        c1.insertar(2);
        
        assertEquals(2, c1.minimo(), "El valor mínimo debe ser 2");
        
        Conjunto vacio = new Conjunto();
        assertEquals(0, vacio.minimo(), "Según la lógica implementada, un conjunto vacío devuelve 0 en minimo()");
    }

    @Test
    void testMaximo() {
        c1.insertar(10);
        c1.insertar(5);
        c1.insertar(25);
        c1.insertar(2);
        
        assertEquals(25, c1.maximo(), "El valor máximo debe ser 25");
        
        Conjunto vacio = new Conjunto();
        assertEquals(0, vacio.maximo(), "Según la lógica implementada, un conjunto vacío devuelve 0 en maximo()");
    }

    @Test
    void testMedia() {
        c1.insertar(10);
        c1.insertar(20);
        c1.insertar(30);
        
        assertEquals(20.0, c1.media(), "La media de 10, 20 y 30 debe ser 20.0");
        
        Conjunto vacio = new Conjunto();
        assertEquals(0.0, vacio.media(), "Según la lógica implementada, un conjunto vacío devuelve 0.0 en media()");
    }

    @Test
    void testIncluido() {
        c1.insertar(1);
        c1.insertar(2);
        
        c2.insertar(1);
        c2.insertar(2);
        c2.insertar(3);
        
        assertTrue(Conjunto.incluido(c1, c2), "c1 {1, 2} debe estar incluido en c2 {1, 2, 3}");
        assertFalse(Conjunto.incluido(c2, c1), "c2 {1, 2, 3} NO debe estar incluido en c1 {1, 2}");
    }

    @Test
    void testUnion() {
        c1.insertar(1);
        c1.insertar(2);
        
        c2.insertar(2);
        c2.insertar(3);
        
        Conjunto union = Conjunto.union(c1, c2);
        
        assertEquals(3, union.numeroElementos(), "La unión debe tener 3 elementos");
        assertTrue(union.pertenece(1) && union.pertenece(2) && union.pertenece(3), "Debe contener 1, 2 y 3");
    }

    @Test
    void testInterseccion() {
        c1.insertar(1);
        c1.insertar(2);
        c1.insertar(3);
        
        c2.insertar(2);
        c2.insertar(3);
        c2.insertar(4);
        
        Conjunto inter = Conjunto.interseccion(c1, c2);
        
        assertEquals(2, inter.numeroElementos(), "La intersección debe tener 2 elementos");
        assertTrue(inter.pertenece(2) && inter.pertenece(3), "La intersección debe contener el 2 y el 3");
    }

    @Test
    void testDiferencia() {
        c1.insertar(1);
        c1.insertar(2);
        c1.insertar(3);
        
        c2.insertar(2);
        c2.insertar(4);
        
        Conjunto dif = Conjunto.diferencia(c1, c2);
        
        assertEquals(2, dif.numeroElementos(), "La diferencia debe tener 2 elementos");
        assertTrue(dif.pertenece(1) && dif.pertenece(3), "La diferencia c1 - c2 debe ser el 1 y el 3 (están en c1 pero no en c2)");
        assertFalse(dif.pertenece(2), "El 2 no debe estar porque está presente en ambos");
    }
}