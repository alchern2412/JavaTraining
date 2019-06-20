/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.javatraining.alchern2412.tasks.maintask02.model.entity.electrodevice;

/**
 * Used for creating Washing Machine objects
 * 
 * Extends Electrodevice
 * 
 * @author Alex
 */
public class WashingMachine extends Electrodevice {

    /**
     * Capacity of Washing Machine
     * 
     * Can't be lower 0.
     */
    private int capacity;

    /**
     * Capacity getter
     * 
     * @return 
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Capacity of Washing Machine
     * 
     * Can't be lower 0.
     * 
     * @param capacity Capacity. Zero by default
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity > 0 ? capacity : 0;
    }
    
    /*Constructors*/
    
    public WashingMachine(int power, int price) {
        super(power, price);
    }

    public WashingMachine(int capacity, int power, int price) {
        super(power, price);
        this.capacity = capacity;
    }
    
    
}
