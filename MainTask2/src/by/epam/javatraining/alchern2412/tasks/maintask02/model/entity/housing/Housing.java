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

    private String address;

    public String getAddress() {
        return address;
    }

    private Electrodevice[] electrodevices;

    public Electrodevice[] getElectrodevices() {
        return electrodevices;
    }

    public void setElectrodevices(Electrodevice[] electrodevices) {
        this.electrodevices = electrodevices;
    }

    public Housing() {
        this("Unknown Address");
    }

    public Housing(String address) {
        this(address, null);
    }

    public Housing(String address, Electrodevice[] electrodevices) {
        this.address = address;
        this.electrodevices = electrodevices;
    }

}
