package by.epam.javatraining.alchern2412.maintask01;

/**
 *
 * @author Alex Chernyavsky
 */
public class VectorController {
    public static void main(String[] args) throws Exception {
        double[] array = {34, 17.0, 2.0, 5.1};
        VectorDouble vd = new VectorDouble(array);
        View.print(vd);
        View.print(vd.getLength());
        
        vd.add(77);
        View.print(vd);
        View.print(vd.getLength());
        
        int index = 3;
        View.print(vd.get(index));
        
        vd.set(777, index);
        View.print(vd.get(index));
        
        vd.sortInsertion();
        View.print(vd);
        
        vd.sortMergeDesc();
        View.print(vd);
        
        View.print(vd.findMax());
        
        View.print(vd.findLocalMin());
    }
}
