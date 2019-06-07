package by.epam.javatraining.alchern2412.maintask01;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex Chernyavsky
 */
public class VectorLogicTest {

    //1 max
    @Test
    public void testFindMax() throws Exception {
        double[] vector = {1.0, 4.0, 10.0, 2.0};
        double expResult = 10;
        double result = VectorLogic.findMax(vector);
        assertEquals(expResult, result, .0);
    }

    @Test(expected = Exception.class)
    public void testFindMaxNullCheck() throws Exception {
        double[] vector = null;
        VectorLogic.findMax(vector);
    }

    //1 min
    @Test
    public void testFindMin() throws Exception {
        double[] vector = {1.0, 4.0, 10.0, 2.0};
        double expResult = 1;
        double result = VectorLogic.findMin(vector);
        assertEquals(expResult, result, .0);
    }

    @Test(expected = Exception.class)
    public void testFindMinNullCheck() throws Exception {
        double[] vector = null;
        VectorLogic.findMin(vector);
    }

    //2 arithm mean
    @Test
    public void testFindArithmeticMean() throws Exception {
        double[] vector = {1.0, 4.0, 10.0, 2.0};
        double expResult = 4.25;
        double result = VectorLogic.findArithmeticMean(vector);
        assertEquals(expResult, result, .000001);
    }

    @Test(expected = Exception.class)
    public void testFindArithmeticMeanNullCheck() throws Exception {
        double[] vector = null;
        VectorLogic.findArithmeticMean(vector);
    }

    //2 geometr. mean
    @Test
    public void testFindGeometricMean() throws Exception {
        double[] vector = {1.0, 4.0, 10.0, 2.0};
        double expResult = 2.990697562442;
        double result = VectorLogic.findGeometricMean(vector);
        assertEquals(expResult, result, .000001);
    }

    @Test(expected = Exception.class)
    public void testFindGeometricMeanNullCheck() throws Exception {
        double[] vector = null;
        VectorLogic.findGeometricMean(vector);
    }

    //3 is sorted?
    @Test
    public void testIsSortedAsc() throws Exception {
        double[] vector = {1.0, 4.0, 6.0, 22.0};
        boolean expResult = true;
        boolean result = VectorLogic.isSorted(vector);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsSortedDesc() throws Exception {
        double[] vector = {100.0, 40.0, 6.0, 2.0};
        boolean expResult = true;
        boolean result = VectorLogic.isSorted(vector);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsSortedFalse() throws Exception {
        double[] vector = {1.0, 14.0, 6.0, 22.0};
        boolean expResult = false;
        boolean result = VectorLogic.isSorted(vector);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsSortedOneNumber() throws Exception {
        double[] vector = {10.0};
        boolean expResult = true;
        boolean result = VectorLogic.isSorted(vector);
        assertEquals(expResult, result);
    }

    @Test(expected = Exception.class)
    public void testIsSortedNullCheck() throws Exception {
        double[] vector = null;
        VectorLogic.isSorted(vector);
    }

    // 4. find local min/max
    @Test
    public void testFindLocalMin() throws Exception {
        double[] vector = {1.0, 4.0, 3.0, 10.0, 2.0};
        int expResult = 2;
        int result = VectorLogic.findLocalMin(vector);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindLocalMinNotFound() throws Exception {
        double[] vector = {1.0, 4.0, 6.0, 10.0, 2.0};
        int expResult = -1;
        int result = VectorLogic.findLocalMin(vector);
        assertEquals(expResult, result);
    }

    @Test(expected = Exception.class)
    public void testFindLocalMinNullCheck() throws Exception {
        double[] vector = null;
        VectorLogic.findLocalMin(vector);
    }

    @Test
    public void testFindLocalMax() throws Exception {
        double[] vector = {1.0, 4.0, 3.0, 10.0, 2.0};
        int expResult = 1;
        int result = VectorLogic.findLocalMax(vector);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindLocalMaxNotFound() throws Exception {
        double[] vector = {1.0, 4.0, 6.0, 10.0, 20.0};
        int expResult = -1;
        int result = VectorLogic.findLocalMax(vector);
        assertEquals(expResult, result);
    }

    @Test(expected = Exception.class)
    public void testFindLocalMaxNullCheck() throws Exception {
        double[] vector = null;
        VectorLogic.findLocalMax(vector);
    }
    
    // linear search
    
    @Test
    public void testFindElementLinear() throws Exception {
        double[] vector = {1.0, 4.0, 3.0, 10.0, 2.0};
        double element = 3.0;
        int expResult = 2;
        int result = VectorLogic.findElementLinear(element, vector);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindElementLinearNotFound() throws Exception {
        double[] vector = {1.0, 4.0, 3.0, 10.0, 2.0};
        double element = 111;
        int expResult = -1;
        int result = VectorLogic.findElementLinear(element, vector);
        assertEquals(expResult, result);
    }

    @Test(expected = Exception.class)
    public void testFindElementLinearNullCheck() throws Exception {
        double[] vector = null;
        double element = 111;
        VectorLogic.findElementLinear(element, vector);
    }
    
    // binary search
    
    @Test
    public void testFindElementBinary() throws Exception {
        double[] vector = {1.0, 4.0, 3.0, 10.0, 2.0};
        double element = 3.0;
        int expResult = 2;
        int result = VectorLogic.findElementBinary(element, vector);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindElementBinaryNotFound() throws Exception {
        double[] vector = {1.0, 4.0, 3.0, 10.0, 2.0};
        double element = 111;
        int expResult = -1;
        int result = VectorLogic.findElementBinary(element, vector);
        assertEquals(expResult, result);
    }

    @Test(expected = Exception.class)
    public void testFindElementBinaryNullCheck() throws Exception {
        double[] vector = null;
        double element = 111;
        VectorLogic.findElementBinary(element, vector);
    }

    // . reverse
    @Test
    public void testReverseEven() throws Exception {
        double[] vector = {1.0, 4.0, 10.0, 2.0};
        double[] expResult = {2.0, 10.0, 4.0, 1.0};
        double[] result = VectorLogic.reverse(vector);
        for (int i = 0; i < vector.length; i++) {
            assertArrayEquals(expResult, result, 0.000000001);
        }
    }

    @Test
    public void testReverseOdd() throws Exception {
        double[] vector = {1.0, 4.0, 15.0, 10.0, 2.0};
        double[] expResult = {2.0, 10.0, 15.0, 4.0, 1.0};
        double[] result = VectorLogic.reverse(vector);
        for (int i = 0; i < vector.length; i++) {
            assertArrayEquals(expResult, result, 0.000000001);
        }
    }

    @Test(expected = Exception.class)
    public void testReverseNullCheck() throws Exception {
        double[] vector = null;
        VectorLogic.reverse(vector);
    }
    

}
