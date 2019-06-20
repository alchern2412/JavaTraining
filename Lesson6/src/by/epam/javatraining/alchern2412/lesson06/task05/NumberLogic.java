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

    private static boolean isFalseNumber(int number) {
        return number <= 1;
    }

    public static boolean isPrimeNumber(int number) {

        if (isFalseNumber(number)) {
            return false;
        }
        
        boolean result = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                result = false;
                break;
            }
        }

        return result;
    }

}
