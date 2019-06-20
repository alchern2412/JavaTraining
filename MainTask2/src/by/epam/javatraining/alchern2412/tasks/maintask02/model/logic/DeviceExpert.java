/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.alchern2412.tasks.maintask02.model.logic;

import by.epam.javatraining.alchern2412.tasks.maintask02.model.entity.electrodevice.Electrodevice;
import by.epam.javatraining.alchern2412.tasks.maintask02.model.entity.housing.Housing;
import java.util.Arrays;
import org.apache.log4j.Logger;

/**
 *
 * @author Alex
 */
public class DeviceExpert {

    private static final int ERROR_CODE = -1;
    private static final Logger LOG = Logger.getRootLogger();

    private static boolean isNullHousing(Housing housing) {
        return housing == null;
    }

    private static boolean isNullDevice(Electrodevice device) {
        return device == null;
    }

    private static boolean isNullDevices(Housing housing) {
        return housing.getElectrodevices() == null;
    }

    public static int totalPowerAll(Housing housing) {
        if (isNullHousing(housing)) {
            LOG.warn("housing can't be null");
            return ERROR_CODE;
        }
        if(isNullDevices(housing)) {
            LOG.warn("housing.getElectrodevices is empty");
            return ERROR_CODE;
        }
        int result = 0;
        for (Electrodevice device : housing.getElectrodevices()) {
            result += device.getPower();
        }
        return result;
    }

    public static int totalPowerOn(Housing housing) {
        if (isNullHousing(housing)) {
            LOG.warn("housing can't be null");
            return ERROR_CODE;
        }
        if(isNullDevices(housing)) {
            LOG.warn("housing.getElectrodevices is empty");
            return ERROR_CODE;
        }
        int result = 0;
        for (Electrodevice device : housing.getElectrodevices()) {
            if (device.isRun()) {
                result += device.getPower();
            }
        }
        return result;
    }

    public static void sortByPower(Housing housing) {
        if (isNullHousing(housing)) {
            LOG.warn("housing can't be null");
            return;
        }
        if(isNullDevices(housing)) {
            LOG.warn("housing.getElectrodevices is empty");
            return;
        }
        Arrays.sort(housing.getElectrodevices(), Electrodevice.COMPARE_BY_POWER);
    }

    public static void sortByPrice(Housing housing) {
        if (isNullHousing(housing)) {
            LOG.warn("housing can't be null");
            return;
        }
        if(isNullDevices(housing)) {
            LOG.warn("housing.getElectrodevices is empty");
            return;
        }
        Arrays.sort(housing.getElectrodevices(), Electrodevice.COMPARE_BY_PRICE);
    }

    public static void addElectrodevice(Housing housing, Electrodevice device) {
        if (isNullHousing(housing)) {
            LOG.warn("housing can't be null");
            return;
        }
        if (isNullDevice(device)) {
            LOG.warn("electrodevice can't be null");
            return;
        }

        Electrodevice[] newDevices;
        if (!isNullDevices(housing)) {
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

    public static boolean removeElectrodevice(Housing housing, Electrodevice device) {
        // check parms eq. null
        if (isNullHousing(housing)) {
            LOG.warn("housing can't be null");
            return false;
        }
        if (isNullDevice(device)) {
            LOG.warn("electrodevice can't be null");
            return false;
        }
        if(isNullDevices(housing)) {
            LOG.warn("housing.getElectrodevices is empty");
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

    public static Electrodevice maxPriceElectrodevice(Housing housing) {
        if (isNullHousing(housing)) {
            LOG.warn("housing can't be null");
            return null;
        }
        if(isNullDevices(housing)) {
            LOG.warn("housing.getElectrodevices is empty");
            return null;
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

    public static Electrodevice minPriceElectrodevice(Housing housing) {
        if (isNullHousing(housing)) {
            LOG.warn("housing can't be null");
            return null;
        }
        if(isNullDevices(housing)) {
            LOG.warn("housing.getElectrodevices is empty");
            return null;
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
    
    public static Electrodevice maxPowerElectrodevice(Housing housing) {
        if (isNullHousing(housing)) {
            LOG.warn("housing can't be null");
            return null;
        }
        if(isNullDevices(housing)) {
            LOG.warn("housing.getElectrodevices is empty");
            return null;
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

    public static Electrodevice minPowerElectrodevice(Housing housing) {
        if (isNullHousing(housing)) {
            LOG.warn("housing can't be null");
            return null;
        }
        if(isNullDevices(housing)) {
            LOG.warn("housing.getElectrodevices is empty");
            return null;
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
