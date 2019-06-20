package by.epam.javatraining.alchern2412.lesson06.task05;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex Chernyavsky
 */
public class NumberLogicTest {

    @Test
    public void testIsPrimeNumberTrue() {
        int[] numbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47,
            53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        boolean expResult = true;
        for (int i = 0; i < numbers.length; i++) {
            boolean result = NumberLogic.isPrimeNumber(numbers[i]);
            assertEquals(expResult, result);
        }
    }

    @Test
    public void testIsPrimeNumberFalse() {
        int[] numbers = {4, 169, 121, 10, 25};
        boolean expResult = false;
        for (int i = 0; i < numbers.length; i++) {
            boolean result = NumberLogic.isPrimeNumber(numbers[i]);
            assertEquals(expResult, result);
        }
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
