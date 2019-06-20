/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.javatraining.alchern2412.tasks.maintask02.model.exceptions;

/**
 * Class to throw Exception when errors occur.
 * 
 * @author Alex
 */
public class NullDevicesException extends NullException {

    public NullDevicesException() {
        super();
    }
    
    public NullDevicesException(String msg) {
        super(msg);
    }
}
