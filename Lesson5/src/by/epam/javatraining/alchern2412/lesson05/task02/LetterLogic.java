package by.epam.javatraining.alchern2412.lesson05.task02;

/**
 *
 * @author Alex
 */
public class LetterLogic {

    private static final String TEMPLATE = "eyuioaEYUIOA";

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
                || letter == 'y' || letter == 'u' || letter == 'i';
    }

    public static boolean isVowel3(char letter) {
        return TEMPLATE.indexOf(letter) != -1;
    }

    public static boolean isVowel4(char letter) {
        return TEMPLATE.contains(Character.toString(letter));
    }

    public static boolean isVowel5(char letter) {
        Character.toLowerCase(letter);
        switch (letter) {
            case 'a':
            case 'e':
            case 'y':
            case 'u':
            case 'i':
            case 'o':
                return true;
        }
        return false;
    }

    public static boolean isVowel6(char letter) {
        for (char let : TEMPLATE.toCharArray()) {
            if (let == letter) {
                return true;
            }
        }
        return false;
    }
}
