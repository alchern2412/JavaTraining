/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.alchern2412.tasks.maintask02.model.entity.electrodevice;

/**
 * For creating Coffee Grinder objects. Coffee Grinder has got cupCount : int.
 *
 * @author Alex
 */
public class CoffeeGrinder extends Electrodevice {

    /**
     * Maximum count of cups (Cups capacity).
     * Cup Count  = 1 by default.
     */
    private int cupCount = 1;

    public int getCupCount() {
        return cupCount;
    }
    
    /**
     * Count of cups can't be lower 1.
     * One by default.
     * 
     * @param cupCount 
     */
    public void setCupCount(int cupCount) {
        if (cupCount > 0) {
            this.cupCount = cupCount;
        }
    }

    public CoffeeGrinder(int power, int price) {
        super(power, price);
    }

    public CoffeeGrinder(int cupCount, int power, int price) {
        super(power, price);
        setCupCount(cupCount);
    }

}
