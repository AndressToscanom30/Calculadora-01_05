package ProyCrote3;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraClassTest {
    
    public CalculadoraClassTest() {
    }

        @Test
    public void testSuma() {
        System.out.println("--Suma");
        double num1 = 1.0;
        double num2 = 1.0;
        CalculadoraClass instance = new CalculadoraClass();
        double expResult = 2.0;
        double result = instance.suma(num1, num2);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testResta() {
        System.out.println("--Resta");
        double num1 = 4.0;
        double num2 = 2.0;
        CalculadoraClass instance = new CalculadoraClass();
        double expResult = 2.0;
        double result = instance.resta(num1, num2);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testMultiplicacion() {
        System.out.println("--Multiplicacion");
        double num1 = 2.0;
        double num2 = 2.0;
        CalculadoraClass instance = new CalculadoraClass();
        double expResult = 4.0;
        double result = instance.multiplicacion(num1, num2);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testDivision() {
        System.out.println("--Division");
        double num1 = 10.0;
        double num2 = 2.0;
        CalculadoraClass instance = new CalculadoraClass();
        double expResult = 5.0;
        double result = instance.division(num1, num2);
        assertEquals(expResult, result, 0);
    }
    
}
