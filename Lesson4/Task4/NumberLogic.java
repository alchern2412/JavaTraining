class NumberLogic {
	private static final int DIVIDER = 10;
	private static final double COUNT = 6.0;
	
	
    public static double geometricMean6(int number) {
		
		
		double n1 = number % DIVIDER;	// .....X
        number /= DIVIDER;

        double n2 = number % DIVIDER;	// ....X.
        number /= DIVIDER;

        double n3 = number % DIVIDER;	// ...X..
        number /= DIVIDER;

        double n4 = number % DIVIDER;	// ..X...
        number /= DIVIDER;

        double n5 = number % DIVIDER;	// .X....
        number /= DIVIDER;

        double n6 = number % DIVIDER;	// X.....
        return Math.pow((n1 * n2 * n3 * n4 * n5 * n6), 1.0 / COUNT);
    }

    public static double arithmeticMean6(int number) {
        double n1 = number % DIVIDER;
        number /= DIVIDER;

        double n2 = number % DIVIDER;
        number /= DIVIDER;

        double n3 = number % DIVIDER;
        number /= DIVIDER;

        double n4 = number % DIVIDER;
        number /= DIVIDER;

        double n5 = number % DIVIDER;
        number /= DIVIDER;

        double n6 = number % DIVIDER;
        return (n1 + n2 + n3 + n4 + n5 + n6) / COUNT;
    }
}