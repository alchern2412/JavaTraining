package by.epam.javatraining.alchern2412.lesson06.task02;

import by.epam.javatraining.alchern2412.lesson06.View;

/**
 *
 * @author Alex
 */
public class Test {

    public static void main(String[] args) {
        int number = 1357;
        View.print(NumberLogic.checkAscDesc(number));   // true
        
        number = 8531;
        View.print(NumberLogic.checkAscDesc(number));   // true
        
        number = 1557;
        View.print(NumberLogic.checkAscDesc(number));   // false
        
        number = -1357;
        View.print(NumberLogic.checkAscDesc(number));   //  true
        
        number = -1337;
        View.print(NumberLogic.checkAscDesc(number));   //  false
    }
}
