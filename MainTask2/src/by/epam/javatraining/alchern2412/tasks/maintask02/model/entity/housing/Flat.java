/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.javatraining.alchern2412.tasks.maintask02.model.entity.housing;

import by.epam.javatraining.alchern2412.tasks.maintask02.model.entity.electrodevice.Electrodevice;

/**
 *
 * @author Alex
 */
public class Flat extends Housing {
    /*fields*/
    
    private int floor;

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getFloor() {
        return floor;
    }
    
    public int square;

    public void setSquare(int square) {
        this.square = square;
    }

    public int getSquare() {
        return square;
    }
        
    /*Constructors*/
    public Flat() {
        this(1, 0, 1, "Unknown Address");
    }

    public Flat(int floor, int square, int roomCount, String address) {
       this(floor, square, roomCount, address, null);
    }

    public Flat(int floor, int square, int roomCount, String address
            , Electrodevice[] electrodevices) {
        super(roomCount, address, electrodevices);
        this.floor = floor;
        this.square = square;
    }
    
    

}
