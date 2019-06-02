/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.alchern2412.lesson06.task04;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex
 */
public class NumberLogicTest {

    @Test
    public void testCheckEvenOddDigitsOdd() {
        int number = 1357953;
        boolean expResult = true;
        boolean result = NumberLogic.checkEvenOddDigits(number);

        assertEquals(expResult, result);
    }

    @Test
    public void testCheckEvenOddDigitsEven() {
        int number = 286402;
        boolean expResult = true;
        boolean result = NumberLogic.checkEvenOddDigits(number);

        assertEquals(expResult, result);
    }

    @Test
    public void testCheckEvenOddDigitsOneDigit() {
        int number = 8;
        boolean expResult = true;
        boolean result = NumberLogic.checkEvenOddDigits(number);

        assertEquals(expResult, result);
    }

    @Test
    public void testCheckEvenOddDigitsFalse1() {
        int number = 286412;
        boolean expResult = false;
        boolean result = NumberLogic.checkEvenOddDigits(number);

        assertEquals(expResult, result);
    }

    @Test
    public void testCheckEvenOddDigitsFalse2() {
        int number = 13352117;
        boolean expResult = false;
        boolean result = NumberLogic.checkEvenOddDigits(number);

        assertEquals(expResult, result);
    }

    @Test
    public void testCheckEvenOddDigitsNegativeTrue() {
        int number = -1335117;
        boolean expResult = true;
        boolean result = NumberLogic.checkEvenOddDigits(number);

        assertEquals(expResult, result);
    }

    @Test
    public void testCheckEvenOddDigitsNegativeFalse() {
        int number = -133514111;
        boolean expResult = false;
        boolean result = NumberLogic.checkEvenOddDigits(number);

        assertEquals(expResult, result);
    }
}
