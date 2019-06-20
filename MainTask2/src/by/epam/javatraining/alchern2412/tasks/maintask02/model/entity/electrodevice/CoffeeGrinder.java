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
public class CoffeeGrinder extends Electrodevice{

    private int cupCount;

    public int getCupCount() {
        return cupCount;
    }

    public void setCupCount(int cupCount) {
        this.cupCount = cupCount;
    }
   
    
    public CoffeeGrinder(int power, int price) {
        super(power, price);
    }

    public CoffeeGrinder(int cupCount, int power, int price) {
        super(power, price);
        this.cupCount = cupCount;
    }
   
    
}
