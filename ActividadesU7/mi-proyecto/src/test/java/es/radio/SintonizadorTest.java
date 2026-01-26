package es.radio; 

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class SintonizadorTest {

    // 2. CORRECCIÓN: El objeto debe ser de la clase 'Sintonizador', NO 'SintonizadorTest'
    private Sintonizador radio;

    @BeforeEach
    void setUp() {
        // 3. Instanciamos la lógica, no el test
        radio = new Sintonizador();
    }

    @Test
    void testEstadoInicial() {
        // 4. CORRECCIÓN: getFrecuencia con 'F' mayúscula
        assertEquals(80.0, radio.getFrecuencia(), "La frecuencia inicial debe ser 80.0");
    }

    @Test
    void testSubirFrecuencia() {
        radio.up();
        assertEquals(80.5, radio.getFrecuencia(), 0.001, "Debería subir 0.5 MHz");
    }

    @Test
    void testBajarFrecuencia() {
        radio.setFrecuencia(90.0);
        radio.down(); 
        assertEquals(89.5, radio.getFrecuencia(), 0.001, "Debería bajar 0.5 MHz");
    }

    @Test
    void testLimiteSuperior_Loop() {
        radio.setFrecuencia(108.0);
        radio.up();
        assertEquals(80.0, radio.getFrecuencia(), 0.001, "Al pasar 108.0 debe volver a 80.0");
    }

    @Test
    void testLimiteInferior_Loop() {
        radio.setFrecuencia(80.0);
        radio.down();
        assertEquals(108.0, radio.getFrecuencia(), 0.001, "Al bajar de 80.0 debe ir a 108.0");
    }

    @Test
    void testDisplayRetornaValor() {
        radio.setFrecuencia(95.5);
        double valorRetornado = radio.display();
        assertEquals(95.5, valorRetornado, "El método display debe retornar la frecuencia actual");
    }
}