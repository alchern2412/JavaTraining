/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.alchern2412.lesson06.task05;

/**
 *
 * @author Alex
 */
public class NumberLogic {

    private static final int SIMPLE_MULTIPLIER5 = 5;
    private static final int SIMPLE_MULTIPLIER2 = 2;
    private static final int SIMPLE_MULTIPLIER3 = 3;

    public static boolean isPrimeNumber(int number) {
        if (number < SIMPLE_MULTIPLIER2) {
            return false;
        } else if (number != SIMPLE_MULTIPLIER2
                && number != SIMPLE_MULTIPLIER3
                && number != SIMPLE_MULTIPLIER5
                && (number % SIMPLE_MULTIPLIER2 == 0
                || number % SIMPLE_MULTIPLIER3 == 0
                || number % SIMPLE_MULTIPLIER5 == 0)) {
            return false;

        }
        return true;
    }

}
