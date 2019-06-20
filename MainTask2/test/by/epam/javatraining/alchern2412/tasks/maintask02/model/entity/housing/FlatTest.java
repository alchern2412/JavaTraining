/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.javatraining.alchern2412.tasks.maintask02.model.entity.housing;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex
 */
public class FlatTest {
    
    public FlatTest() {
    }

    @Test
    public void testSetFloor() {
        System.out.println("setFloor");
        int floor = 0;
        Flat instance = new Flat();
        instance.setFloor(floor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetFloor() {
        System.out.println("getFloor");
        Flat instance = new Flat();
        int expResult = 0;
        int result = instance.getFloor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetSquare() {
        System.out.println("setSquare");
        int square = 0;
        Flat instance = new Flat();
        instance.setSquare(square);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetSquare() {
        System.out.println("getSquare");
        Flat instance = new Flat();
        int expResult = 0;
        int result = instance.getSquare();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
