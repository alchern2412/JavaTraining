/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.alchern2412.lesson06.task01;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Alex
 */
public class HeadsOrTailsTest {

    /**
     * Test of headsCount method, of class HeadsOrTails.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testHeadsCount() throws Exception {
        int shotsNumber = 1000;

        int result = HeadsOrTails.headsCount(shotsNumber);
        if (result > shotsNumber || result < 0) {
            fail();
        }
    }

    @Test(expected = Exception.class)
    public void testHeadsCountNegativeNumber() throws Exception {
        int shotsNumber = -4;

        int result = HeadsOrTails.headsCount(shotsNumber);

    }

}
