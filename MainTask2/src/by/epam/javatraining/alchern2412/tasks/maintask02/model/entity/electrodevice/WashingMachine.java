/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.javatraining.alchern2412.tasks.maintask02.model.entity.electrodevice;

/**
 *
 * @author Alex
 */
public class WashingMachine extends Electrodevice {

    private int capacity;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    public WashingMachine(int power, int price) {
        super(power, price);
    }

    public WashingMachine(int capacity, int power, int price) {
        super(power, price);
        this.capacity = capacity;
    }
    
    
}
