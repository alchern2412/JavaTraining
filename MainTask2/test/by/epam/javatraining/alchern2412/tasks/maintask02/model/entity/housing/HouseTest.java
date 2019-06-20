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
public class HouseTest {
    
    public HouseTest() {
    }

    @Test
    public void testGetFrame() {
        System.out.println("getFrame");
        House instance = new House();
        String expResult = "";
        String result = instance.getFrame();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetFrame() {
        System.out.println("setFrame");
        String frame = "";
        House instance = new House();
        instance.setFrame(frame);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetRoof() {
        System.out.println("getRoof");
        House instance = new House();
        String expResult = "";
        String result = instance.getRoof();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetRoof() {
        System.out.println("setRoof");
        String roof = "";
        House instance = new House();
        instance.setRoof(roof);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetArea() {
        System.out.println("getArea");
        House instance = new House();
        double expResult = 0.0;
        double result = instance.getArea();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetArea() {
        System.out.println("setArea");
        double area = 0.0;
        House instance = new House();
        instance.setArea(area);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetFloorCount() {
        System.out.println("getFloorCount");
        House instance = new House();
        int expResult = 0;
        int result = instance.getFloorCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetFloorCount() {
        System.out.println("setFloorCount");
        int floorCount = 0;
        House instance = new House();
        instance.setFloorCount(floorCount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
