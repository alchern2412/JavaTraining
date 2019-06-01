/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.alchern2412.lesson05.task03;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Alex
 */
public class MoodSensorTest {

    @Test
    public void testMyMood() {
        String expected1 = "Bad";
        String expected2 = "Moderate";
        String expected3 = "Good";
        String expected4 = "Great";

        String result = MoodSensor.myMood();

        if (expected1 != result && expected2 != result
                && expected3 != result && expected4 != result) {
            fail("Expected " + expected1 + "|" + expected2 + "|"
                    + expected3 + "|" + expected4 + ". But result: " + result);
        }

    }
}
