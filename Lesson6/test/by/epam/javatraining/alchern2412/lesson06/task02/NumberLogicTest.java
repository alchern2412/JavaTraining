/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.alchern2412.lesson06.task02;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Alex
 */
public class NumberLogicTest {

    @Test
    public void testCheckAscDescTrue1() {
        int number = 1357;
        boolean expected = true;

        assertEquals(expected, NumberLogic.checkAscDesc(number));

    }

    @Test
    public void testCheckAscDescTrue2() {
        int number = 9431;
        boolean expected = true;

        assertEquals(expected, NumberLogic.checkAscDesc(number));

    }

    @Test
    public void testCheckAscDescFalse() {
        int number = 1891;
        boolean expected = false;

        assertEquals(expected, NumberLogic.checkAscDesc(number));

    }

    @Test
    public void testCheckAscDescOneDigit() {
        int number = 1;
        boolean expected = true;

        assertEquals(expected, NumberLogic.checkAscDesc(number));

    }

    @Test
    public void testCheckAscDescNegativeNumberAscTrue() {
        int number = -1234589;
        boolean expected = true;

        assertEquals(expected, NumberLogic.checkAscDesc(number));
    }

    @Test
    public void testCheckAscDescNegativeNumberDescTrue() {
        int number = -9731;
        boolean expected = true;

        assertEquals(expected, NumberLogic.checkAscDesc(number));
    }

    @Test
    public void testCheckAscDescNegativeNumberFalse() {
        int number = -1238589;
        boolean expected = false;

        assertEquals(expected, NumberLogic.checkAscDesc(number));
    }

    @Test
    public void testCheckAscDescSameDigitsFalse() {
        int number = 5555;
        boolean expected = false;

        assertEquals(expected, NumberLogic.checkAscDesc(number));
    }
}
