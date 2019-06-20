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
    public void testTotalPowerAll() {
        LOG.info("totalPowerAll");
        int expResult = 16832;
        int result = DeviceExpert.totalPowerAll(housing);
        assertEquals(expResult, result);
    }

    @Test
    public void testTotalPowerOn() {
        LOG.info("totalPowerOn");
        int expResult = 6500;
        int result = DeviceExpert.totalPowerOn(housing);
        assertEquals(expResult, result);
    }

    @Test
    public void testSortByPower() {
        LOG.info("sortByPower");
        Electrodevice[] sortedDevices = new Electrodevice[]{
            coffeeGrinder2, coffeeGrinder1, vacoomCleaner3, washingMachine1, washingMachine2, vacoomCleaner1, washingMachine3,
            vacoomCleaner2};

        DeviceExpert.sortByPower(housing);
        assertArrayEquals(sortedDevices, housing.getElectrodevices());
    }

    @Test
    public void testSortByPrice() {
        LOG.info("sortByPrice");

        Electrodevice[] sortedDevices = new Electrodevice[]{
            coffeeGrinder2, coffeeGrinder1, vacoomCleaner1,
            washingMachine1, vacoomCleaner3, washingMachine2,
            vacoomCleaner2, washingMachine3};

        DeviceExpert.sortByPrice(housing);
        assertArrayEquals(sortedDevices, housing.getElectrodevices());
    }

    @Test
    public void testAddElectrodevice() {
        LOG.info("addElectrodevice");

        Housing housing1 = new Flat(1, 40, 2, "Minsk, Bobrujskaya 25, kv 314");

        Electrodevice device = new CoffeeGrinder(4, 500, 99);
        DeviceExpert.addElectrodevice(housing1, device);
        int expected = 1;
        assertEquals(expected, housing1.getElectrodevices().length);

    }

    @Test
    public void testRemoveElectrodevice() {
        LOG.info("removeElectrodevice");
        Electrodevice device = new CoffeeGrinder(4, 500, 99);
        Electrodevice[] devices = new Electrodevice[]{device};
        Housing housing1 = new Flat(1, 40, 2, "Minsk, Bobrujskaya 25, kv 314", devices);

        DeviceExpert.removeElectrodevice(housing1, device);
        int expected = 0;
        assertEquals(expected, housing1.getElectrodevices().length);
    }

    @Test
    public void testMaxPriceElectrodevice() {
        LOG.info("maxPriceElectrodevice");

        Electrodevice expResult = washingMachine3;
        Electrodevice result = DeviceExpert.maxPriceElectrodevice(housing);
        assertEquals(expResult, result);
    }

    @Test
    public void testMinPriceElectrodevice() {
        LOG.info("minPriceElectrodevice");

        Electrodevice expResult = coffeeGrinder2;
        Electrodevice result = DeviceExpert.minPriceElectrodevice(housing);
        assertEquals(expResult, result);
    }

    @Test
    public void testMaxPowerElectrodevice() {
        LOG.info("maxPowerElectrodevice");

        Electrodevice expResult = vacoomCleaner2;
        Electrodevice result = DeviceExpert.maxPowerElectrodevice(housing);
        assertEquals(expResult, result);
    }

    @Test
    public void testMinPowerElectrodevice() {
        LOG.info("minPowerElectrodevice");

        Electrodevice expResult = coffeeGrinder2;
        Electrodevice result = DeviceExpert.minPowerElectrodevice(housing);
        assertEquals(expResult, result);
    }

}
