/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.alchern2412.tasks.maintask02.model.logic;

import by.epam.javatraining.alchern2412.tasks.maintask02.model.entity.electrodevice.CoffeeGrinder;
import by.epam.javatraining.alchern2412.tasks.maintask02.model.entity.electrodevice.Electrodevice;
import by.epam.javatraining.alchern2412.tasks.maintask02.model.entity.electrodevice.VacuumCleaner;
import by.epam.javatraining.alchern2412.tasks.maintask02.model.entity.electrodevice.WashingMachine;
import by.epam.javatraining.alchern2412.tasks.maintask02.model.entity.housing.Flat;
import by.epam.javatraining.alchern2412.tasks.maintask02.model.entity.housing.Housing;
import by.epam.javatraining.alchern2412.tasks.maintask02.model.exceptions.NullException;
import org.apache.log4j.Logger;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Alex
 */
public class DeviceExpertTest {

    private static final Logger LOG = Logger.getRootLogger();

    private Housing housing;
    Electrodevice coffeeGrinder1 = new CoffeeGrinder(12, 1000, 199);
    Electrodevice coffeeGrinder2 = new CoffeeGrinder(4, 500, 99);

    Electrodevice washingMachine1 = new WashingMachine(20, 1500, 504);

    Electrodevice washingMachine2 = new WashingMachine(50, 1900, 978);
    Electrodevice washingMachine3 = new WashingMachine(70, 3000, 5500);

    Electrodevice vacoomCleaner1 = new VacuumCleaner(15, 2500, 307);
    Electrodevice vacoomCleaner2 = new VacuumCleaner(30, 5000, 1400);
    Electrodevice vacoomCleaner3 = new VacuumCleaner(17, 1432, 509);

    @Before
    public void beforeTests() {

        washingMachine1.setRun(true);
        vacoomCleaner2.setRun(true);

        Electrodevice[] devices = new Electrodevice[]{coffeeGrinder1, coffeeGrinder2, washingMachine1, washingMachine2, washingMachine3, vacoomCleaner1, vacoomCleaner2, vacoomCleaner3};
        housing = new Flat(1, 40, 2, "Minsk, Bobrujskaya 25, kv 314", devices);

    }

    @Test
    public void testTotalPowerAll() throws NullException {
        LOG.info("totalPowerAll");
        int expResult = 16832;
        int result = DeviceExpert.totalPowerAll(housing);
        assertEquals(expResult, result);
    }

    @Test(expected = NullException.class)
    public void testTotalPowerAllNull() throws NullException {
        LOG.info("totalPowerAll");
        DeviceExpert.totalPowerAll(null);
    }

    @Test
    public void testTotalPowerAllNullDevices() throws NullException {
        LOG.info("totalPowerAll");
        int expResult = 0;
        Housing h = new Flat();
        int result = DeviceExpert.totalPowerAll(h);
        assertEquals(expResult, result);
    }

    @Test
    public void testTotalPowerOn() throws NullException {
        LOG.info("totalPowerOn");
        int expResult = 6500;
        int result = DeviceExpert.totalPowerOn(housing);
        assertEquals(expResult, result);
    }

    @Test(expected = NullException.class)
    public void testTotalPowerOnNull() throws NullException {
        LOG.info("totalPowerOn");
        DeviceExpert.totalPowerOn(null);
    }

    @Test
    public void testTotalPowerOnNullDevices() throws NullException {
        LOG.info("totalPowerOn");
        int expResult = 0;
        Housing h = new Flat();
        int result = DeviceExpert.totalPowerOn(h);
        assertEquals(expResult, result);
    }

    @Test
    public void testSortByPower() throws NullException {
        LOG.info("sortByPower");
        Electrodevice[] sortedDevices = new Electrodevice[]{
            coffeeGrinder2, coffeeGrinder1, vacoomCleaner3, washingMachine1, washingMachine2, vacoomCleaner1, washingMachine3,
            vacoomCleaner2};

        DeviceExpert.sortByPower(housing);
        assertArrayEquals(sortedDevices, housing.getElectrodevices());
    }

    @Test(expected = NullException.class)
    public void testSortByPowerNull() throws NullException {
        LOG.info("sortByPower");
        DeviceExpert.sortByPower(null);
    }

    @Test
    public void testSortByPowerNullDevices() throws NullException {
        LOG.info("sortByPower");
        Housing h = new Flat();
        DeviceExpert.sortByPower(h);
    }

    @Test
    public void testSortByPrice() throws NullException {
        LOG.info("sortByPrice");

        Electrodevice[] sortedDevices = new Electrodevice[]{
            coffeeGrinder2, coffeeGrinder1, vacoomCleaner1,
            washingMachine1, vacoomCleaner3, washingMachine2,
            vacoomCleaner2, washingMachine3};

        DeviceExpert.sortByPrice(housing);
        assertArrayEquals(sortedDevices, housing.getElectrodevices());
    }

    @Test(expected = NullException.class)
    public void testSortByPriceNull() throws NullException {
        LOG.info("sortByPrice");
        DeviceExpert.sortByPrice(null);
    }

    @Test
    public void testSortByPriceNullDevices() throws NullException {
        LOG.info("sortByPower");
        Housing h = new Flat();

        DeviceExpert.sortByPrice(h);
    }

    @Test
    public void testAddElectrodevice() throws NullException {
        LOG.info("addElectrodevice");

        Housing housing1 = new Flat(1, 40, 2, "Minsk, Bobrujskaya 25, kv 314");

        Electrodevice device = new CoffeeGrinder(4, 500, 99);
        DeviceExpert.addElectrodevice(housing1, device);
        int expected = 1;
        assertEquals(expected, housing1.getElectrodevices().length);
    }
    
    @Test(expected = NullException.class)
    public void testAddElectrodeviceNull() throws NullException {
        LOG.info("addElectrodevice");

        Housing housing1 = null;

        Electrodevice device = new CoffeeGrinder(4, 500, 99);
        DeviceExpert.addElectrodevice(housing1, device);
    }
    
    @Test
    public void testAddElectrodeviceExistDevice() throws NullException {
        LOG.info("addElectrodevice");

        Housing housing1 = new Flat(1, 40, 2, "Minsk, Bobrujskaya 25, kv 314");

        Electrodevice device = new CoffeeGrinder(4, 500, 99);
        DeviceExpert.addElectrodevice(housing1, device);
        DeviceExpert.addElectrodevice(housing1, device);
        DeviceExpert.addElectrodevice(housing1, device);
        int expected = 1;
        assertEquals(expected, housing1.getElectrodevices().length);
    }

    @Test
    public void testRemoveElectrodevice() throws NullException {
        LOG.info("removeElectrodevice");
        Electrodevice device = new CoffeeGrinder(4, 500, 99);
        Electrodevice[] devices = new Electrodevice[]{device};
        Housing housing1 = new Flat(1, 40, 2, "Minsk, Bobrujskaya 25, kv 314", devices);

        boolean result = DeviceExpert.removeElectrodevice(housing1, device);
        boolean expected = true;
        assertEquals(expected, result);
    }
    
    @Test(expected = NullException.class)
    public void testRemoveElectrodeviceNull() throws NullException {
        LOG.info("removeElectrodevice");
        Electrodevice device = new CoffeeGrinder(4, 500, 99);
        boolean result = DeviceExpert.removeElectrodevice(null, device);
        boolean expected = false;
        assertEquals(result, expected);
    }
    
    @Test(expected = NullException.class)
    public void testRemoveElectrodeviceRemoveNull() throws NullException {
        LOG.info("removeElectrodevice");
        Housing housing1 = new Flat(1, 40, 2, "Minsk, Bobrujskaya 25, kv 314", null);

        DeviceExpert.removeElectrodevice(housing1, null);
    }

    @Test
    public void testMaxPriceElectrodevice() throws NullException {
        LOG.info("maxPriceElectrodevice");

        Electrodevice expResult = washingMachine3;
        Electrodevice result = DeviceExpert.maxPriceElectrodevice(housing);
        assertEquals(expResult, result);
    }
    
    @Test(expected = NullException.class)
    public void testMaxPriceElectrodeviceNull() throws NullException {
        LOG.info("maxPriceElectrodevice");

        Electrodevice expResult = null;
        Electrodevice result = DeviceExpert.maxPriceElectrodevice(null);
        assertEquals(expResult, result);
    }

    @Test
    public void testMinPriceElectrodevice() throws NullException {
        LOG.info("minPriceElectrodevice");

        Electrodevice expResult = coffeeGrinder2;
        Electrodevice result = DeviceExpert.minPriceElectrodevice(housing);
        assertEquals(expResult, result);
    }

    @Test(expected = NullException.class)
    public void testMinPriceElectrodeviceNull() throws NullException {
        LOG.info("maxPriceElectrodevice");

        Electrodevice expResult = null;
        Electrodevice result = DeviceExpert.minPriceElectrodevice(null);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMaxPowerElectrodevice() throws NullException {
        LOG.info("maxPowerElectrodevice");

        Electrodevice expResult = vacoomCleaner2;
        Electrodevice result = DeviceExpert.maxPowerElectrodevice(housing);
        assertEquals(expResult, result);
    }

    @Test(expected = NullException.class)
    public void testMaxPowerElectrodeviceNull() throws NullException {
        LOG.info("maxPriceElectrodevice");

        Electrodevice expResult = null;
        Electrodevice result = DeviceExpert.maxPowerElectrodevice(null);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMinPowerElectrodevice() throws NullException {
        LOG.info("minPowerElectrodevice");

        Electrodevice expResult = coffeeGrinder2;
        Electrodevice result = DeviceExpert.minPowerElectrodevice(housing);
        assertEquals(expResult, result);
    }

    @Test(expected = NullException.class)
    public void testMinPowerElectrodeviceNull() throws NullException {
        LOG.info("maxPriceElectrodevice");

        Electrodevice expResult = null;
        Electrodevice result = DeviceExpert.minPowerElectrodevice(null);
        assertEquals(expResult, result);
    }
}
