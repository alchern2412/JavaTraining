/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.alchern2412.tasks.maintask02.model.entity.electrodevice;

/**
 * For creating Vacuum Cleaner objects. Extends Electrodevice
 *
 * @author Alex
 */
public class VacuumCleaner extends Electrodevice {

    /**
     * Weigth of Vacuum Cleaner
     */
    private int weight;

    public int getWeight() {
        return weight;
    }

    /**
     * Weight of Vacuum Cleaner
     * Can't be lower 0.
     * 
     * @param weight Weight = 1 by default
     */
    public void setWeight(int weight) {
        this.weight = weight > 0 ? weight : 0;
    }

    public VacuumCleaner(int power, int price) {
        super(power, price);
    }

    public VacuumCleaner(int weight, int power, int price) {
        super(power, price);
        setWeight(weight);
    }

}
