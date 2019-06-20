/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.javatraining.alchern2412.tasks.maintask02.model.entity.housing;

import by.epam.javatraining.alchern2412.tasks.maintask02.model.entity.electrodevice.Electrodevice;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex
 */
public class HousingTest {
    
    public HousingTest() {
    }

    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Housing instance = new HousingImpl();
        String expResult = "";
        String result = instance.getAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetRoomCount() {
        System.out.println("setRoomCount");
        int roomCount = 0;
        Housing instance = new HousingImpl();
        instance.setRoomCount(roomCount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetRoomCount() {
        System.out.println("getRoomCount");
        Housing instance = new HousingImpl();
        int expResult = 0;
        int result = instance.getRoomCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetElectrodevices() {
        System.out.println("getElectrodevices");
        Housing instance = new HousingImpl();
        Electrodevice[] expResult = null;
        Electrodevice[] result = instance.getElectrodevices();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetElectrodevices() {
        System.out.println("setElectrodevices");
        Electrodevice[] electrodevices = null;
        Housing instance = new HousingImpl();
        instance.setElectrodevices(electrodevices);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class HousingImpl extends Housing {
    }
    
}
