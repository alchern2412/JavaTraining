package by.epam.javatraining.alchern2412.lesson06.task05;

import by.epam.javatraining.alchern2412.lesson06.View;

/**
 *
 * @author Alex
 */
public class Test {

    public static void main(String[] args) {
        int number = 1;
        View.print("Is prime number '" + number + "' -> "
                + NumberLogic.isPrimeNumber(number));  // false

        number = 2;
        View.print("Is prime number '" + number + "' -> "
                + NumberLogic.isPrimeNumber(number));  // true
        
        number = 3;
        View.print("Is prime number '" + number + "' -> "
                + NumberLogic.isPrimeNumber(number));  // true
        
        number = 4;
        View.print("Is prime number '" + number + "' -> "
                + NumberLogic.isPrimeNumber(number));  // false
        
        number = 199;
        View.print("Is prime number '" + number + "' -> "
                + NumberLogic.isPrimeNumber(number));  // true
        
        number = -197;
        View.print("Is prime number '" + number + "' -> "
                + NumberLogic.isPrimeNumber(number));  // false
    }
}
