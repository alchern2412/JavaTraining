package by.epam.javatraining.alchern2412.lesson06.task05;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex Chernyavsky
 */
public class NumberLogicTest {

    @Test
    public void testIsPrimeNumberSM2() {
        int number = 2;
        boolean expResult = true;
        boolean result = NumberLogic.isPrimeNumber(number);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsPrimeNumberSM3() {
        int number = 3;
        boolean expResult = true;
        boolean result = NumberLogic.isPrimeNumber(number);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsPrimeNumberSM5() {
        int number = 5;
        boolean expResult = true;
        boolean result = NumberLogic.isPrimeNumber(number);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsPrimeNumberTrue() {
        int number = 197;
        boolean expResult = true;
        boolean result = NumberLogic.isPrimeNumber(number);
        assertEquals(expResult, result);
    }    

    @Test
    public void testIsPrimeNumberFalse() {
        int number = 4;
        boolean expResult = false;
        boolean result = NumberLogic.isPrimeNumber(number);
        assertEquals(expResult, result);
    }    
    
    @Test
    public void testIsPrimeNumberZero() {
        int number = 0;
        boolean expResult = false;
        boolean result = NumberLogic.isPrimeNumber(number);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsPrimeNumberOne() {
        int number = 1;
        boolean expResult = false;
        boolean result = NumberLogic.isPrimeNumber(number);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsPrimeNumberNegativeNumber() {
        int number = -19;
        boolean expResult = false;
        boolean result = NumberLogic.isPrimeNumber(number);
        assertEquals(expResult, result);
    }
}
