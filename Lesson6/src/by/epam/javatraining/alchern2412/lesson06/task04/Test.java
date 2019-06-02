package by.epam.javatraining.alchern2412.lesson06.task04;

import by.epam.javatraining.alchern2412.lesson06.View;

/**
 *
 * @author Alex Chernyavsky
 */
// Controller class
public class Test {

    public static void main(String[] args) {
        int number = 4;
        View.print("All digits of number '" + number + "' are even or odd? -> " 
                + NumberLogic.checkEvenOddDigits(number));  // true
        
        number = 46824006;
        View.print("All digits of number '" + number + "' are even or odd? -> " 
                + NumberLogic.checkEvenOddDigits(number));  // true
        
        number = 13573539;
        View.print("All digits of number '" + number + "' are even or odd? -> " 
                + NumberLogic.checkEvenOddDigits(number));  // true
        
        number = 1345632;
        View.print("All digits of number '" + number + "' are even or odd? -> " 
                + NumberLogic.checkEvenOddDigits(number));  //  false
        
        number = -975;
        View.print("All digits of number '" + number + "' are even or odd? -> " 
                + NumberLogic.checkEvenOddDigits(number));  // true
        
    }
}
