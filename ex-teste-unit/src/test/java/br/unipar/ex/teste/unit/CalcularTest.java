
package br.unipar.ex.teste.unit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalcularTest {
    
    private Calcular calc;
    
    public CalcularTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        calc = new Calcular();
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testSomarValores() {
        assertEquals(4, calc.somarValores(2, 2));
    }
    
}
