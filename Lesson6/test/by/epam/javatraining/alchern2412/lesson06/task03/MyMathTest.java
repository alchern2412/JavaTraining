/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.alchern2412.lesson06.task03;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex
 */
public class MyMathTest {

    @Test
    public void testFactorial() throws Exception {
        int number = 5;
        int expected = 120;

        assertEquals(expected, MyMath.factorial(number));
    }

    @Test(expected = Exception.class)
    public void testFactorialNegativeNumber() throws Exception {
        int number = -5;
        MyMath.factorial(number);
    }

    @Test
    public void testFactorialZero() throws Exception {
        int number = 0;
        int expected = 1;
        assertEquals(expected, MyMath.factorial(number));
    }
    
    @Test
    public void testFactorialOne() throws Exception {
        int number = 1;
        int expected = 1;
        assertEquals(expected, MyMath.factorial(number));
    }
    
    
}
