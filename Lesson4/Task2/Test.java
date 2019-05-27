public class Test {
    public static void main(String[] args) {
        // 2
		
        double r1;	
        double r2;
        r1 = 10;
        r2 = 5;
        System.out.println("Ring square: " + RingLogic.findRingSquare(r1, r2));

        // check square (testing)
        double MyRingSquare;
        MyRingSquare = r1 * r1 * Math.PI - r2 * r2 * Math.PI;
        System.out.println("My Ring Square: " + MyRingSquare);
    }
}
