/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.alchern2412.tasks.maintask02.model.entity.electrodevice;

import java.util.Comparator;

/**
 * This class is an abstraction for creating real Electrodevices (ex: Washing
 * Machine, Coffee Grinder etc.).
 *
 * @author Alex
 */
public abstract class Electrodevice implements Comparable<Electrodevice> {
    /*fields*/

    /**
     * The field indicates whether the device is On or Off
     */
    private boolean run = false;

    /**
     * Check device On or Off
     *
     * @return if device is On - true; else false
     */
    public boolean isRun() {
        return run;
    }

    /**
     * Used for On or Off electrodevice
     *
     * @param run if true - device On, else - off.
     */
    public void setRun(boolean run) {
        this.run = run;
    }

    /**
     * Power of Electrodevice
     */
    private int power;

    /**
     * Power getter
     *
     * @return
     */
    public int getPower() {
        return power;
    }

    /**
     * Power setter.
     * Power can't be lower zero. Default 0.
     * 
     * @param power 
     */
    public void setPower(int power) {
        if (power >= 0) {
            this.power = power;
        } else {
            this.power = 0;
        }
    }

    /**
     * Price of Electrodevice
     */
    private int price;

    /**
     * Price getter
     * 
     * @return Price of Electrodevice 
     */
    public int getPrice() {
        return price;
    }

    /**
     * Price setter
     * 
     * @param price Price of Electrodevice 
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /*Constructors*/
    
    /**
     * Default constructor
     * Price and Power is 0 by default
     * isRun = false.
     */
    public Electrodevice() {
        this(0, 0);
    }
    
    /**
     * Mid Constructor.
     * isRun = false by default.
     * 
     * @param power Power of Electrodevice
     * @param price Price of Electrodevice
     */
    public Electrodevice(int power, int price) {
        this.power = power;
        this.price = price;
    }

    public Electrodevice(int power, int price, boolean run) {
        this.power = power;
        this.price = price;
        this.run = run;
    }

    /**
     * Overrided method for equality objects Electrodevice.
     * 
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Electrodevice other = (Electrodevice) obj;
        if (run != other.isRun() || power != other.getPower()
                || price != other.getPrice()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = run == true ? 31 : 17;
        int result = 1;
        result = prime * result + price;
        result = prime * result + power;
        return result;
    }

    @Override
    public String toString() {
        return "Electrodevice [Power=" + power
                + ", Price=" + price
                + ", Run=" + run + "]";
    }

    /**
     * Comparator by power for sorting by power
     */
    public static final Comparator<Electrodevice> COMPARE_BY_POWER
            = (Electrodevice o1, Electrodevice o2) -> {
                if (o1.getPower() == o2.getPower()) {
                    return 0;
                } else if (o1.getPower() > o2.getPower()) {
                    return 1;
                } else {
                    return -1;
                }
            };

    /**
     * Comparator by price for sorting by price
     */
    public static final Comparator<Electrodevice> COMPARE_BY_PRICE
            = (Electrodevice o1, Electrodevice o2) -> {
                if (o1.getPrice() == o2.getPrice()) {
                    return 0;
                } else if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else {
                    return -1;
                }
            };

    /**
     * For Arrays.findBinary(...)
     * 
     * @param o
     * @return 
     */
    @Override
    public int compareTo(Electrodevice o) {
        return toString().compareTo(o.toString());
    }

}
