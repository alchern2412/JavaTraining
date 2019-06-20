/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.javatraining.alchern2412.tasks.maintask02.model.entity.electrodevice;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex
 */
public class ElectrodeviceTest {
    
    public ElectrodeviceTest() {
    }

    @Test
    public void testIsRun() {
        System.out.println("isRun");
        Electrodevice instance = null;
        boolean expResult = false;
        boolean result = instance.isRun();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetRun() {
        System.out.println("setRun");
        boolean run = false;
        Electrodevice instance = null;
        instance.setRun(run);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPower() {
        System.out.println("getPower");
        Electrodevice instance = null;
        int expResult = 0;
        int result = instance.getPower();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetPower() {
        System.out.println("setPower");
        int power = 0;
        Electrodevice instance = null;
        instance.setPower(power);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Electrodevice instance = null;
        int expResult = 0;
        int result = instance.getPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        int price = 0;
        Electrodevice instance = null;
        instance.setPrice(price);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Electrodevice instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Electrodevice instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Electrodevice instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ElectrodeviceImpl extends Electrodevice {

        public ElectrodeviceImpl() {
            super(0, 0);
        }
    }
    
}
