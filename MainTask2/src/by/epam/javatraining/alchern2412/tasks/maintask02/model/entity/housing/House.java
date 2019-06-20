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
public class House extends Housing {

    /*fieds*/
    private String frame;

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    private String roof;

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    private double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    private int floorCount;

    public int getFloorCount() {
        return floorCount;
    }

    public void setFloorCount(int floorCount) {
        this.floorCount = floorCount;
    }

    /*Constructors*/
    
    public House() {
        this("UnknownFrame", "UnknownRoof", 0, 1, 1, "UnknownAddress");
    }

    public House(String frame, String roof, double area, int floorCount
            , int roomCount, String address, Electrodevice[] electrodevices) {
        super(roomCount, address, electrodevices);
        this.frame = frame;
        this.roof = roof;
        this.area = area;
        this.floorCount = floorCount;
    }

    public House(String frame, String roof, double area, int floorCount
            , int roomCount, String address) {
        super(roomCount, address);
        this.frame = frame;
        this.roof = roof;
        this.area = area;
        this.floorCount = floorCount;
    }

}
