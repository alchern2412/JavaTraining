/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.alchern2412.tasks.maintask02.model.entity.housing;

import by.epam.javatraining.alchern2412.tasks.maintask02.model.entity.electrodevice.Electrodevice;
import java.util.Arrays;

/**
 * Used to create House with Electrodevices.
 * 
 * @author Alex
 */
public class House extends Housing {

    /*fieds*/
    
    /**Frame of House*/
    private String frame;

    /**
     * Frame getter.
     * 
     * @return frame of House 
     */
    public String getFrame() {
        return frame;
    }

    /**
     * Frame setter
     * 
     * @param frame frame of house  
     */
    public void setFrame(String frame) {
        this.frame = frame;
    }

    /**Roof of House*/
    private String roof;

    /**Roof getter
     * 
     * 
     * @return roof of House*/
    public String getRoof() {
        return roof;
    }

    /**
     * Roof setter
     * 
     * @param roof roof of house
     */
    public void setRoof(String roof) {
        this.roof = roof;
    }

    /**Area of House*/
    private double area;

    /**Area getter
     * 
     * @return Area of House*/
    public double getArea() {
        return area;
    }

    /**
     * Area setter.
     * 
     * @param area area of House 
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**Floor count of House*/
    private int floorCount;

    public int getFloorCount() {
        return floorCount;
    }

    /**
     * Floor count setter.
     * 
     * @param floorCount floor count of House.
     */
    public void setFloorCount(int floorCount) {
        this.floorCount = floorCount;
    }

    /*Constructors*/
    
    /**Default constructor.
     * All fieds fill Unknowned */
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
        House other = (House) obj;
        return getAddress() == other.getAddress() && getRoomCount() == other.getRoomCount()
                && Arrays.equals(getElectrodevices(), other.getElectrodevices())
                && getFrame() == other.getFrame());
    }

}
