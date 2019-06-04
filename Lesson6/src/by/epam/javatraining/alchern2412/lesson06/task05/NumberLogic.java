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

    public static boolean isPrimeNumber(int number) {

        final int SIMPLE_MULTIPLIER_FIRST = 5;
        final int SIMPLE_MULTIPLIER_SECOND = 2;
        final int SIMPLE_MULTIPLIER_THIRD = 3;

        if (number < SIMPLE_MULTIPLIER_SECOND  || (number != SIMPLE_MULTIPLIER_SECOND
                && number != SIMPLE_MULTIPLIER_THIRD
                && number != SIMPLE_MULTIPLIER_FIRST
                && (number % SIMPLE_MULTIPLIER_SECOND == 0
                || number % SIMPLE_MULTIPLIER_THIRD == 0
                || number % SIMPLE_MULTIPLIER_FIRST
                == 0))) {
            return false;

        }

        return true;
    }

}
