public class RingLogic {
	/*r1 - first radius, r2 - second radius*/
    public static double findRingSquare(double r1, double r2) {
        return Math.PI * (r1 * r1 - r2 * r2);	// first circle square - second square = ring square (easy :) )
    }
}
