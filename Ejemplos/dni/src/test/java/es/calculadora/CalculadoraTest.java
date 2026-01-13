package es.calculadora;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

    private Calculadora cal;

    @BeforeEach
    void setUp() throws Exception {
        cal = new Calculadora(10, 2);
    }

    @Test
    void testSumar() {
       
        int resultadoEsperado = 12;
        
       
        int resultadoReal = cal.sumar();
        
        
        assertEquals(resultadoEsperado, resultadoReal, "La suma debería ser 12");
    }

    @Test
    void testRestar() {
        int resultadoEsperado = 8; 
        int resultadoReal = cal.restar();
        
        assertEquals(resultadoEsperado, resultadoReal, "La resta debería ser 8");
    }

    @Test
    void testMultiplicar() {
        int resultadoEsperado = 20; 
        int resultadoReal = cal.multiplicar();
        
        assertEquals(resultadoEsperado, resultadoReal, "La multiplicación debería ser 20");
    }

    @Test
    void testDividir() {
        double resultadoEsperado = 5.0; 
        double resultadoReal = cal.dividir();
        
        assertEquals(resultadoEsperado, resultadoReal, "La división debería ser 5.0");
    }
    
    @Test
    void testDividirDecimales() {
        
        cal.setNum2(4); 
        
        double resultadoEsperado = 2.5; 
        double resultadoReal = cal.dividir();
        
        assertEquals(resultadoEsperado, resultadoReal, "La división debería dar decimales exactos");
    }

    @Test
    void testDividirPorCero() {
        
        cal.setNum2(0);
        
       
        double resultadoEsperado = 0.0;
        double resultadoReal = cal.dividir();
        
        assertEquals(resultadoEsperado, resultadoReal, "Al dividir por cero esperamos que devuelva 0.0 (error controlado)");
    }
}