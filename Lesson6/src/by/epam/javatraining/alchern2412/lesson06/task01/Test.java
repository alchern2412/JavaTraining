/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.alchern2412.lesson06.task01;

import by.epam.javatraining.alchern2412.lesson06.View;

/**
 *
 * @author Alex
 */
public class Test {

    public static void main(String[] args) throws Exception {
        int number = 1000;

        int headCount = HeadsOrTails.headsCount(number);
        
        View.print("Number: " + number + ", head count: " + headCount + ", "
        + "tail count: " + (number - headCount));
    }

}
