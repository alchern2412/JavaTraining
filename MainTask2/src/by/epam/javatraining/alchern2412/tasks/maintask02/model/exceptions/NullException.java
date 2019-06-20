/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.javatraining.alchern2412.tasks.maintask02.model.exceptions;

/**
 * Class to throw Exception when errors occur.
 * Base class for NullDeviceException, NullHousingException, NullDevicesException
 * 
 * @author Alex
 */
public class NullException extends Exception {
    public NullException() {
        super();
    }
    
    public NullException(String msg) {
        super(msg);
    }
}
