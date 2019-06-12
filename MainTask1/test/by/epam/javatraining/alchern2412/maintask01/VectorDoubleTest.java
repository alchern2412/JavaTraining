package by.epam.javatraining.alchern2412.maintask01;

import static org.junit.Assert.*;
import org.junit.Ignore;
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

    //1 max
    @Test
    public void testFindMax() throws Exception {
        double[] vector = {1.0, 4.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        double expResult = 10;
        double result = vectorDouble.findMax();
        assertEquals(expResult, result, .0);
    }

    @Test(expected = Exception.class)
    public void testFindMaxNullCheck() throws Exception {
        double[] vector = null;
        vectorDouble = new VectorDouble(vector);
        vectorDouble.findMax();
    }

    //1 min
    @Test
    public void testFindMin() throws Exception {
        double[] vector = {1.0, 4.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        double expResult = 1;
        double result = vectorDouble.findMin();
        assertEquals(expResult, result, .0);
    }

    @Test(expected = Exception.class)
    public void testFindMinNullCheck() throws Exception {
        double[] vector = null;
        vectorDouble = new VectorDouble(vector);
        vectorDouble.findMin();
    }

    //2 arithm mean
    @Test
    public void testFindArithmeticMean() throws Exception {
        double[] vector = {1.0, 4.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        double expResult = 4.25;
        double result = vectorDouble.findArithmeticMean();
        assertEquals(expResult, result, .000001);
    }

    @Test(expected = Exception.class)
    public void testFindArithmeticMeanNullCheck() throws Exception {
        double[] vector = null;
        vectorDouble = new VectorDouble(vector);
        vectorDouble.findArithmeticMean();
    }

    //2 geometr. mean
    @Test
    public void testFindGeometricMean() throws Exception {
        double[] vector = {1.0, 4.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        double expResult = 2.990697562442;
        double result = vectorDouble.findGeometricMean();
        assertEquals(expResult, result, .000001);
    }

    @Test(expected = Exception.class)
    public void testFindGeometricMeanNullCheck() throws Exception {
        double[] vector = null;
        vectorDouble = new VectorDouble(vector);
        vectorDouble.findGeometricMean();
    }

    //3 is sorted?
    @Test
    public void testIsSortedAsc() throws Exception {
        double[] vector = {1.0, 4.0, 6.0, 22.0};
        vectorDouble = new VectorDouble(vector);
        boolean expResult = true;
        boolean result = vectorDouble.isSorted();
        assertEquals(expResult, result);
    }

    @Test
    public void testIsSortedDesc() throws Exception {
        double[] vector = {100.0, 40.0, 6.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        boolean expResult = true;
        boolean result = vectorDouble.isSorted();
        assertEquals(expResult, result);
    }

    @Test
    public void testIsSortedFalse() throws Exception {
        double[] vector = {1.0, 14.0, 6.0, 22.0};
        vectorDouble = new VectorDouble(vector);
        boolean expResult = false;
        boolean result = vectorDouble.isSorted();
        assertEquals(expResult, result);
    }

    @Test
    public void testIsSortedOneNumber() throws Exception {
        double[] vector = {10.0};
        vectorDouble = new VectorDouble(vector);
        boolean expResult = true;
        boolean result = vectorDouble.isSorted();
        assertEquals(expResult, result);
    }

    @Test(expected = Exception.class)
    public void testIsSortedNullCheck() throws Exception {
        double[] vector = null;
        vectorDouble = new VectorDouble(vector);
        vectorDouble.isSorted();
    }

    // 4. find local min/max
    @Test
    public void testFindLocalMin() throws Exception {
        double[] vector = {1.0, 4.0, 3.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        int expResult = 2;
        int result = vectorDouble.findLocalMin();
        assertEquals(expResult, result);
    }

    @Test
    public void testFindLocalMinNotFound() throws Exception {
        double[] vector = {1.0, 4.0, 6.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        int expResult = -1;
        int result = vectorDouble.findLocalMin();
        assertEquals(expResult, result);
    }

    @Test(expected = Exception.class)
    public void testFindLocalMinNullCheck() throws Exception {
        double[] vector = null;
        vectorDouble = new VectorDouble(vector);
        vectorDouble.findLocalMin();
    }

    @Test
    public void testFindLocalMax() throws Exception {
        double[] vector = {1.0, 4.0, 3.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        int expResult = 1;
        int result = vectorDouble.findLocalMax();
        assertEquals(expResult, result);
    }

    @Test
    public void testFindLocalMaxNotFound() throws Exception {
        double[] vector = {1.0, 4.0, 6.0, 10.0, 20.0};
        vectorDouble = new VectorDouble(vector);
        int expResult = -1;
        int result = vectorDouble.findLocalMax();
        assertEquals(expResult, result);
    }

    @Test(expected = Exception.class)
    public void testFindLocalMaxNullCheck() throws Exception {
        double[] vector = null;
        vectorDouble = new VectorDouble(vector);
        vectorDouble.findLocalMax();
    }

    // linear search
    @Test
    public void testFindElementLinear() throws Exception {
        double[] vector = {1.0, 4.0, 3.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        double element = 3.0;
        int expResult = 2;
        int result = vectorDouble.findElementLinear(element);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindElementLinearNotFound() throws Exception {
        double[] vector = {1.0, 4.0, 3.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        double element = 111;
        int expResult = -1;
        int result = vectorDouble.findElementLinear(element);
        assertEquals(expResult, result);
    }

    @Test(expected = Exception.class)
    public void testFindElementLinearNullCheck() throws Exception {
        double[] vector = null;
        vectorDouble = new VectorDouble(vector);
        double element = 111;
        vectorDouble.findElementLinear(element);
    }

    // binary search
    @Test
    public void testFindElementBinary() throws Exception {
        double[] vector = {1.0, 4.0, 3.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        double element = 3.0;
        int expResult = 2;
        int result = vectorDouble.findElementBinary(element);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindElementBinaryNotFound() throws Exception {
        double[] vector = {1.0, 4.0, 3.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        double element = 111;
        int expResult = -1;
        int result = vectorDouble.findElementBinary(element);
        assertEquals(expResult, result);
    }

    @Test(expected = Exception.class)
    public void testFindElementBinaryNullCheck() throws Exception {
        double[] vector = null;
        vectorDouble = new VectorDouble(vector);
        double element = 111;
        vectorDouble.findElementBinary(element);
    }

    // . reverse
    @Test
    public void testReverseEven() throws Exception {
        double[] vector = {1.0, 4.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        double[] expResult = {2.0, 10.0, 4.0, 1.0};
        VectorDouble tmp = vectorDouble.reverse();
        for (int i = 0; i < vectorDouble.getLength(); i++) {
            assertEquals(expResult[i], tmp.get(i), 0.000000001);
        }
    }

    @Test
    public void testReverseOdd() throws Exception {
        double[] vector = {1.0, 4.0, 15.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        double[] expResult = {2.0, 10.0, 15.0, 4.0, 1.0};
        VectorDouble tmp = vectorDouble.reverse();
        for (int i = 0; i < vectorDouble.getLength(); i++) {
            assertEquals(expResult[i], tmp.get(i), 0.000000001);
        }
    }

    @Test(expected = Exception.class)
    public void testReverseNullCheck() throws Exception {
        double[] vector = null;
        vectorDouble = new VectorDouble(vector);
        vectorDouble.reverse();
    }

    // sorts
    //bubble
    @Test
    public void testSortBubble() throws Exception {
        double[] vector = {1.0, 4.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        double[] expResult = {1.0, 2.0, 4.0, 10.0};
        VectorDouble tmp = vectorDouble.sortBubble();
        for (int i = 0; i < vectorDouble.getLength(); i++) {
            assertEquals(expResult[i], tmp.get(i), 0.000000001);
        }
    }

    @Test
    public void testSortBubbleDesc() throws Exception {
        double[] vector = {1.0, 4.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        double[] expResult = {10.0, 4.0, 2.0, 1.0};
        VectorDouble tmp = vectorDouble.sortBubbleDesc();
        for (int i = 0; i < vectorDouble.getLength(); i++) {
            assertEquals(expResult[i], tmp.get(i), 0.000000001);
        }
    }

    //insertion
    @Test
    public void testSortInsertion() throws Exception {
        double[] vector = {1.0, 4.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        double[] expResult = {1.0, 2.0, 4.0, 10.0};
        VectorDouble tmp = vectorDouble.sortInsertion();
        for (int i = 0; i < vectorDouble.getLength(); i++) {
            assertEquals(expResult[i], tmp.get(i), 0.000000001);
        }
    }

    @Test
    public void testSortInsertionDesc() throws Exception {
        double[] vector = {1.0, 4.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        double[] expResult = {10.0, 4.0, 2.0, 1.0};
        VectorDouble tmp = vectorDouble.sortInsertionDesc();
        for (int i = 0; i < vectorDouble.getLength(); i++) {
            assertEquals(expResult[i], tmp.get(i), 0.000000001);
        }
    }

    //selection
    @Test
    public void testSortSelection() throws Exception {
        double[] vector = {1.0, 4.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        double[] expResult = {1.0, 2.0, 4.0, 10.0};
        VectorDouble tmp = vectorDouble.sortSelection();
        for (int i = 0; i < vectorDouble.getLength(); i++) {
            assertEquals(expResult[i], tmp.get(i), 0.000000001);
        }
    }

    @Test
    public void testSortSelectionDesc() throws Exception {
        double[] vector = {1.0, 4.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        double[] expResult = {10.0, 4.0, 2.0, 1.0};
        VectorDouble tmp = vectorDouble.sortSelectionDesc();
        for (int i = 0; i < vectorDouble.getLength(); i++) {
            assertEquals(expResult[i], tmp.get(i), 0.000000001);
        }
    }

    //merge
    @Test
    public void testSortMerge() throws Exception {
        double[] vector = {1.0, 4.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        double[] expResult = {1.0, 2.0, 4.0, 10.0};
        VectorDouble tmp = vectorDouble.sortMerge();
        for (int i = 0; i < vectorDouble.getLength(); i++) {
            assertEquals(expResult[i], tmp.get(i), 0.000000001);
        }
    }

    @Test
    public void testSortMergeDesc() throws Exception {
        double[] vector = {1.0, 4.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        double[] expResult = {10.0, 4.0, 2.0, 1.0};
        VectorDouble tmp = vectorDouble.sortMergeDesc();
        for (int i = 0; i < vectorDouble.getLength(); i++) {
            assertEquals(expResult[i], tmp.get(i), 0.000000001);
        }
    }

    //quick
    @Test
    public void testSortQuick() throws Exception {
        double[] vector = {1.0, 4.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        double[] expResult = {1.0, 2.0, 4.0, 10.0};
        VectorDouble tmp = vectorDouble.sortQuick();
        for (int i = 0; i < vectorDouble.getLength(); i++) {
            assertEquals(expResult[i], tmp.get(i), 0.000000001);
        }
    }

    @Test
    public void testSortQuickDesc() throws Exception {
        double[] vector = {1.0, 4.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        double[] expResult = {10.0, 4.0, 2.0, 1.0};
        VectorDouble tmp = vectorDouble.sortQuickDesc();
        for (int i = 0; i < vectorDouble.getLength(); i++) {
            assertEquals(expResult[i], tmp.get(i), 0.000000001);
        }
    }

}
