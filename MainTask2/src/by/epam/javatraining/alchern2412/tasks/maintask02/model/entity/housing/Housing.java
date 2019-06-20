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
public abstract class Housing {

    /*fields*/
    
    private String address;

    public String getAddress() {
        return address;
    }

    private int roomCount;

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public int getRoomCount() {
        return roomCount;
    }
        
    private Electrodevice[] electrodevices;

    public Electrodevice[] getElectrodevices() {
        return electrodevices;
    }

    public void setElectrodevices(Electrodevice[] electrodevices) {
        this.electrodevices = electrodevices;
    }

    
    /*Constructors*/
    
    public Housing() {
        this(1, "Unknown Address");
    }

    public Housing(int roomCount, String address) {
        this(roomCount, address, null);
    }

    public Housing(int roomCount, String address, Electrodevice[] electrodevices) {
        this.address = address;
        this.electrodevices = electrodevices;
        this.roomCount = roomCount;
    }

}
