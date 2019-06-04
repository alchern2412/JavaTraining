/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.alchern2412.lesson05.task02;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Alex
 */
public class LetterLogicTest {

    //test true
    @Test
    public void testIsVowel1True() {
        char letter = 'a';
        boolean expected = true;

        assertEquals(expected, LetterLogic.isVowel1(letter));
    }

    @Test
    public void testIsVowel1False() {
        char letter = 'b';
        boolean expected = false;

        assertEquals(expected, LetterLogic.isVowel1(letter));
    }

    @Test
    public void testIsVowel2True() {
        char letter = 'a';
        boolean expected = true;

        assertEquals(expected, LetterLogic.isVowel2(letter));
    }

    @Test
    public void testIsVowel2False() {
        char letter = 'b';
        boolean expected = false;

        assertEquals(expected, LetterLogic.isVowel2(letter));
    }

    @Test
    public void testIsVowel3True() {
        char letter = 'a';
        boolean expected = true;

        assertEquals(expected, LetterLogic.isVowel3(letter));
    }

    @Test
    public void testIsVowel3False() {
        char letter = 'b';
        boolean expected = false;

        assertEquals(expected, LetterLogic.isVowel3(letter));
    }

    @Test
    public void testIsVowel4True() {
        char letter = 'a';
        boolean expected = true;

        assertEquals(expected, LetterLogic.isVowel3(letter));
    }

    @Test
    public void testIsVowel4False() {
        char letter = 'b';
        boolean expected = false;

        assertEquals(expected, LetterLogic.isVowel3(letter));
    }

    @Test
    public void testIsVowel5True() {
        char letter = 'a';
        boolean expected = true;

        assertEquals(expected, LetterLogic.isVowel3(letter));
    }

    @Test
    public void testIsVowel5False() {
        char letter = 'b';
        boolean expected = false;

        assertEquals(expected, LetterLogic.isVowel3(letter));
    }
    
    @Test
    public void testIsVowel6True() {
        char letter = 'a';
        boolean expected = true;

        assertEquals(expected, LetterLogic.isVowel3(letter));
    }

    @Test
    public void testIsVowel6False() {
        char letter = 'b';
        boolean expected = false;

        assertEquals(expected, LetterLogic.isVowel3(letter));
    }
}
