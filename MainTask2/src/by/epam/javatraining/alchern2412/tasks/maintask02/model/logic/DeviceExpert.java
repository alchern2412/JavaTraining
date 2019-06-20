/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.alchern2412.tasks.maintask02.model.logic;

import by.epam.javatraining.alchern2412.tasks.maintask02.model.entity.electrodevice.Electrodevice;
import by.epam.javatraining.alchern2412.tasks.maintask02.model.entity.housing.Housing;
import by.epam.javatraining.alchern2412.tasks.maintask02.model.exceptions.NullDeviceException;
import by.epam.javatraining.alchern2412.tasks.maintask02.model.exceptions.NullDevicesException;
import by.epam.javatraining.alchern2412.tasks.maintask02.model.exceptions.NullException;
import by.epam.javatraining.alchern2412.tasks.maintask02.model.exceptions.NullHousingException;
import java.util.Arrays;
import org.apache.log4j.Logger;

/**
 *
 * @author Alex
 */
public class DeviceExpert {

    private static final int EMPTY_HOUSING = 0;
    private static final Logger LOG = Logger.getRootLogger();

    private static void isNullHousing(Housing housing) throws NullException {
        if (housing == null) {
            LOG.warn("Housing can't be null");
            throw new NullHousingException("Null Housing");
        }
    }

    private static void isNullDevice(Electrodevice device) throws NullException {
        if (device == null) {
            LOG.warn("Device can't be null");
            throw new NullDeviceException("Null Device");
        }
    }

    private static boolean isNullDevices(Housing housing) {
        if (housing.getElectrodevices() == null) {
            LOG.warn("Device can't be null");
            return true;
        }
        return false;
    }

    public static int totalPowerAll(Housing housing) throws NullException {
        isNullHousing(housing);
        if (isNullDevices(housing)) {
            return EMPTY_HOUSING;
        }
        int result = EMPTY_HOUSING;
        for (Electrodevice device : housing.getElectrodevices()) {
            result += device.getPower();
        }
        return result;
    }

    public static int totalPowerOn(Housing housing) throws NullException {
        isNullHousing(housing);
        if (isNullDevices(housing)) {
            return EMPTY_HOUSING;
        }
        int result = EMPTY_HOUSING;
        for (Electrodevice device : housing.getElectrodevices()) {
            if (device.isRun()) {
                result += device.getPower();
            }
        }
        return result;
    }

    public static void sortByPower(Housing housing) throws NullException {
        isNullHousing(housing);
        if (isNullDevices(housing)) {
            return;
        }
        Arrays.sort(housing.getElectrodevices(), Electrodevice.COMPARE_BY_POWER);
    }

    public static void sortByPrice(Housing housing) throws NullException {
        isNullHousing(housing);
        if (isNullDevices(housing)) {
            return;
        }
        Arrays.sort(housing.getElectrodevices(), Electrodevice.COMPARE_BY_PRICE);
    }

    public static void addElectrodevice(Housing housing, Electrodevice device) throws NullException {
        isNullHousing(housing);
        isNullDevice(device);

        Electrodevice[] newDevices;
        if (!isNullDevices(housing)) {
            if (Arrays.binarySearch(housing.getElectrodevices(), device) >= 0) {
                LOG.warn("This electrodevice already exists");
                return;
            }

            final int LENGTH = housing.getElectrodevices().length;
            Electrodevice[] oldDevices = housing.getElectrodevices();
            newDevices = new Electrodevice[LENGTH + 1];
            System.arraycopy(oldDevices, 0, newDevices, 0, LENGTH);
            newDevices[newDevices.length - 1] = device;

        } else {
            newDevices = new Electrodevice[]{device};
        }

        housing.setElectrodevices(newDevices);
    }

    public static boolean removeElectrodevice(Housing housing, Electrodevice device) throws NullException {
        // check parms eq. null
        isNullHousing(housing);
        isNullDevice(device);
        if (isNullDevices(housing)) {
            return false;
        }

        // logic
        boolean result = false;
        int index = Arrays.binarySearch(housing.getElectrodevices(), device);
        if (index >= 0) {
            final int OLD_LENGTH = housing.getElectrodevices().length;
            Electrodevice[] newDevices = new Electrodevice[OLD_LENGTH - 1];
            for (int i = 0, j = 0; i < OLD_LENGTH; i++) {
                if (j != index) {
                    newDevices[j] = housing.getElectrodevices()[i];
                    j++;
                }
            }
            housing.setElectrodevices(newDevices);
            result = true;
        }

        return result;
    }

    public static Electrodevice maxPriceElectrodevice(Housing housing) throws NullException {
        isNullHousing(housing);
        if (isNullDevices(housing)) {
            throw new NullDevicesException();
        }
        Electrodevice max = null;
        if (!isNullDevices(housing)) {
            Electrodevice[] devices = housing.getElectrodevices();
            max = devices[0];
            for (Electrodevice device : devices) {
                if (max.getPrice() < device.getPrice()) {
                    max = device;
                }
            }
        } else {
            LOG.warn("housing.getElectrodevices() = null");
        }
        return max;
    }

    public static Electrodevice minPriceElectrodevice(Housing housing) throws NullException {
        isNullHousing(housing);
        if (isNullDevices(housing)) {
            throw new NullDevicesException();
        }
        Electrodevice min = null;
        if (!isNullDevices(housing)) {
            Electrodevice[] devices = housing.getElectrodevices();
            min = devices[0];
            for (Electrodevice device : devices) {
                if (min.getPrice() > device.getPrice()) {
                    min = device;
                }
            }
        } else {
            LOG.warn("housing.getElectrodevices() = null");
        }
        return min;
    }

    public static Electrodevice maxPowerElectrodevice(Housing housing) throws NullException {
        isNullHousing(housing);
        if (isNullDevices(housing)) {
            throw new NullDevicesException();
        }
        Electrodevice max = null;
        if (!isNullDevices(housing)) {
            Electrodevice[] devices = housing.getElectrodevices();
            max = devices[0];
            for (Electrodevice device : devices) {
                if (max.getPower() < device.getPower()) {
                    max = device;
                }
            }
        } else {
            LOG.warn("housing.getElectrodevices() = null");
        }
        return max;
    }

    public static Electrodevice minPowerElectrodevice(Housing housing) throws NullException {
        isNullHousing(housing);
        if (isNullDevices(housing)) {
            throw new NullDevicesException();
        }
        Electrodevice min = null;
        if (!isNullDevices(housing)) {
            Electrodevice[] devices = housing.getElectrodevices();
            min = devices[0];
            for (Electrodevice device : devices) {
                if (min.getPower() > device.getPower()) {
                    min = device;
                }
            }
        } else {
            LOG.warn("housing.getElectrodevices() = null");
        }
        return min;
    }
}
