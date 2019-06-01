package by.epam.javatraining.alchern2412.lesson05.task02;

/**
 *
 * @author Alex
 */
public class LetterLogic {
    
    public static boolean isVowel1(char letter) {
        
        return letter == 'a' || letter == 'e' || letter == 'o' 
                || letter == 'y' || letter == 'u' || letter == 'i' 
                || letter == 'A' || letter == 'E' || letter == 'O' 
                || letter == 'Y' || letter == 'U' || letter == 'I';
    }
    
    public static boolean isVowel2(char letter) {
        // or toUpperCase check equality with AEOYUI
        letter = Character.toLowerCase(letter); 
        return letter == 'a' || letter == 'e' || letter == 'o' 
                || letter == 'y' || letter == 'u' || letter == 'i' ;
    }
        
    public static boolean isVowel3(char letter) {
        return "eyuioaEYUIOA".indexOf(letter) != -1;
    }
}
