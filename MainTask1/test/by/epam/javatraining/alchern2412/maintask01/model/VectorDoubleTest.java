package by.epam.javatraining.alchern2412.maintask01.model;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Alex Chernyavsky
 */
public class VectorDoubleTest {

    VectorDouble vectorDouble;

    @Test
    public void testGet() throws Exception {
        double[] vector = {1.0, 4.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        int index = 1;
        double expResult = 4.0;
        double result = vectorDouble.get(index);
        assertEquals(expResult, result, .0);
    }

    @Test(expected = Exception.class)
    public void testGetBoundExc() throws Exception {
        double[] vector = {1.0, 4.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        int index = 20;
        vectorDouble.get(index);
    }

    @Test
    public void testSet() throws Exception {
        double[] vector = {1.0, 4.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        int index = 1;
        double expResult = 777;
        vectorDouble.set(expResult, index);
        assertEquals(expResult, vectorDouble.get(index), .0);
    }

    @Test(expected = Exception.class)
    public void testSetBoundExc() throws Exception {
        double[] vector = {1.0, 4.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        int index = 20;
        double element = 777.0;
        vectorDouble.set(element, index);
    }

    @Test
    public void testGetLength() throws Exception {
        double[] vector = {1.0, 4.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        int expResult = 4;
        int result = vectorDouble.getLength();
        assertEquals(expResult, result);
    }



}
