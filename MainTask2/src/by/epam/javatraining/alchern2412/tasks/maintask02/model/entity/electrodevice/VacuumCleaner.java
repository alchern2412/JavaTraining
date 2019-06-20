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
public class VacuumCleaner extends Electrodevice {
    
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public VacuumCleaner(int power, int price) {
        super(power, price);
    }

    public VacuumCleaner(int weight, int power, int price) {
        super(power, price);
        this.weight = weight;
    }
    
    
}
