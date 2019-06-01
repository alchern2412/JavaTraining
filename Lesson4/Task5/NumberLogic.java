class NumberLogic {
	private static final int DIVIDER = 10;
	
	private static final int MULTIPLIER1 = 10;
	private static final int MULTIPLIER2 = 100;
	private static final int MULTIPLIER3 = 1000;
	private static final int MULTIPLIER4 = 10000;
	private static final int MULTIPLIER5 = 100000;
	private static final int MULTIPLIER6 = 1000000;

	
	// reverse numbers of 7 digit number
    public static int reverseNumber7(int number) {
        int n1 = number % DIVIDER;	// ......X
        number /= DIVIDER;

        int n2 = number % DIVIDER;	// .....X.
        number /= DIVIDER;

        int n3 = number % DIVIDER;	// ....X..
        number /= DIVIDER;

        int n4 = number % DIVIDER;	// ...X...
        number /= DIVIDER;

        int n5 = number % DIVIDER;	// ..X....
        number /= DIVIDER;

        int n6 = number % DIVIDER;	// .X.....
        number /= DIVIDER;

        int n7 = number % DIVIDER;	// X......
        return n7 + n6 * MULTIPLIER1 + n5 * MULTIPLIER2 + n4 * MULTIPLIER3 + n3 * MULTIPLIER4 + n2 * MULTIPLIER5 + n1 * MULTIPLIER6;
    }
}