/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.alchern2412.tasks.maintask02.model.entity.electrodevice;

import java.util.Comparator;

/**
 *
 * @author Alex
 */
public abstract class Electrodevice implements Comparable<Electrodevice> {
    /*fields*/

    private boolean run = false;

    public boolean isRun() {
        return run;
    }

    public void setRun(boolean run) {
        this.run = run;
    }

    private int power;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    /*Constructors*/
    public Electrodevice(int power, int price) {
        this.power = power;
        this.price = price;
    }

    public Electrodevice(int power, int price, boolean run) {
        this.power = power;
        this.price = price;
        this.run = run;
    }

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

    @Override
    public int compareTo(Electrodevice o) {
        return toString().compareTo(o.toString());
    }

}
