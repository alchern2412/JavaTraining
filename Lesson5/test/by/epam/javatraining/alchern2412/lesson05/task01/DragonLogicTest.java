package by.epam.javatraining.alchern2412.lesson05.task01;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Alex Chernyavsky
 */

public class DragonLogicTest {
    
    /* 0 <= x < 200 */
    @Test
    public void testFindHeadCountUnderMark1() {
        int age = 10;   
        int expected = 33;  
        assertEquals(expected, DragonLogic.findHeadCount(age));
    }
    
    /* 200 <= x < 300 */
    @Test
    public void testFindHeadCountOverMark1() {
        int age = 222;  
        int expected = 646;
        assertEquals(expected, DragonLogic.findHeadCount(age));
    }
    
    /*x >= 300*/
    @Test
    public void testFindHeadCountOverMark2() {
        int age = 333;  
        int expected = 834;
        assertEquals(expected, DragonLogic.findHeadCount(age));
    }
    
    /*x < 0*/
    @Test
    public void testFindHeadCountUnderZero() {
        int age = -3;  
        int expected = -1;
        assertEquals(expected, DragonLogic.findHeadCount(age));
    }
    
    
    /* 0 <= x < 200 */
    @Test
    public void testFindEyesCountUnderMark1() {
        int age = 10;   
        int expected = 66;  
        assertEquals(expected, DragonLogic.findEyesCount(age));
    }
    
    /* 200 <= x < 300 */
    @Test
    public void testFindEyesCountOverMark1() {
        int age = 222;  
        int expected = 1292;
        assertEquals(expected, DragonLogic.findEyesCount(age));
    }
    
    /*x >= 300*/
    @Test
    public void testFindEyesCountOverMark2() {
        int age = 333;  
        int expected = 1668;
        assertEquals(expected, DragonLogic.findEyesCount(age));
    }
    
    /*x < 0*/
    @Test
    public void testFindEyesCountUnderZero() {
        int age = -3;  
        int expected = -1;
        assertEquals(expected, DragonLogic.findEyesCount(age));
    }
    
    
}
