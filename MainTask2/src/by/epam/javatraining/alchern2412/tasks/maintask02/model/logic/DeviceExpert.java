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
 * Used to work with an array of Electrodevices class Housing.
 *
 * @author Alex
 */
public class DeviceExpert {

    /**
     * The initial value of the power if the class does not have a Housing
     * Eletrodevice.
     */
    private static final int EMPTY_HOUSING = 0;

    /**
     * Logger for DeviceExpert Class
     */
    private static final Logger LOG = Logger.getRootLogger();

    /**
     * The method checks Housing for null value. In which case throws Exception.
     */
    private static void isNullHousing(Housing housing) throws NullException {
        if (housing == null) {
            LOG.warn("Housing can't be null");
            throw new NullHousingException("Null Housing");
        }
    }

    /**
     * The method checks Electrodevice for null value. In which case throws
     * Exception.
     *
     * @param device device are checked
     */
    private static void isNullDevice(Electrodevice device) throws NullException {
        if (device == null) {
            LOG.warn("Device can't be null");
            throw new NullDeviceException("Null Device");
        }
    }

    /**
     * The method checks Electrodevices of Housing for null value. In which case
     * returns true or false
     *
     * @param housing Housing, devices which are checked
     */
    private static boolean isNullDevices(Housing housing) {
        if (housing.getElectrodevices() == null) {
            LOG.warn("Device can't be null");
            return true;
        }
        return false;
    }

    /**
     * the method returns the total power of all Housing electrodevices.
     *
     * @param housing Housing, devices power which are checked
     */
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

    /**
     * the method returns the total power of Housing electrodevices which ON.
     *
     * @param housing Housing, devices power which are checked
     */
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

    /**
     * This method sort Electrodevices of Housing by Power.
     *
     * @param housing Housing, devices power which are checked
     */
    public static void sortByPower(Housing housing) throws NullException {
        isNullHousing(housing);
        if (isNullDevices(housing)) {
            return;
        }
        Arrays.sort(housing.getElectrodevices(), Electrodevice.COMPARE_BY_POWER);
    }

    /**
     * This method sort Electrodevices of Housing by Price.
     *
     * @param housing Housing, devices power which are checked
     */
    public static void sortByPrice(Housing housing) throws NullException {
        isNullHousing(housing);
        if (isNullDevices(housing)) {
            return;
        }
        Arrays.sort(housing.getElectrodevices(), Electrodevice.COMPARE_BY_PRICE);
    }

    /**
     * This method add Electrodevice to Housing. If housing is null, new
     * Electrodevices array will be created.
     *
     * @param housing Housing, devices power which are checked
     * @param device Device, which will be added
     */
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

    /**
     * This method remove Electrodevice from Housing. If device is not founded,
     * return false.
     *
     * @param housing Housing, devices power which are checked
     * @param device Device, which will be removed
     */
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

    /**
     * This method returns the electrodevice with the maximum price.
     *
     * @param housing Housing, devices power which are checked
     * @return electrodevice with the maximum price
     */
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

    /**
     * This method returns the electrodevice with the minimum price.
     *
     * @param housing Housing, devices power which are checked
     * @return electrodevice with the minimum price
     */
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

    /**
     * This method returns the electrodevice with the maximum power.
     *
     * @param housing Housing, devices power which are checked
     * @return electrodevice with the maximum power
     */
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

    /**
     * This method returns the electrodevice with the minimum power.
     *
     * @param housing Housing, devices power which are checked
     * @return electrodevice with the minimum power
     */
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

    /**
     * This method return Electrodevice[] by parameters
     *
     * @param housing Housing
     * @param fromPrice Start price
     * @param toPrice Finish price
     * @param fromPower Start Power
     * @param toPower Finish Power
     * @return Electrodevice array
     * @throws NullException
     */
    public static Electrodevice[] findElectrodevices(Housing housing, int fromPower,
            int toPower, int fromPrice, int toPrice) throws NullException {
        isNullHousing(housing);
        if (isNullDevices(housing)) {
            return null;
        }
        Electrodevice[] tmp = new Electrodevice[housing.getElectrodevices().length];
        int i = 0;
        for (Electrodevice device : housing.getElectrodevices()) {
            if (device.getPower() >= fromPower && device.getPower() <= toPower
                    && device.getPrice() >= fromPrice
                    && device.getPrice() <= toPrice) {
                tmp[i] = device;
                i++;
            }
        }
        Electrodevice[] result;
        if (i == housing.getElectrodevices().length) {
            result = tmp;
        } else {
            result = new Electrodevice[i];
            for (int j = 0; j < result.length; j++) {
                result[j] = tmp[j];
            }
        }
        return result;
    }
}
