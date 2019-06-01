class NumberLogic {
	private static final int DIVIDER = 10;
	
    // 3. Ascending numbers?
    public static boolean checkNumber4(int number) {
		
        int n1 = number % DIVIDER;	// ...X
        number /= DIVIDER;

        int n2 = number % DIVIDER; 	// ..X.
        number /= DIVIDER;

        int n3 = number % DIVIDER;	// .X..
        number /= DIVIDER;

        int n4 = number % DIVIDER;	// X...
        number /= DIVIDER;
			
        return n1 > n2 && n2 > n3 && n3 > n4;	// check and return result
    }
	
	// 3. Descending numbers?
    public static boolean checkNumber4(int number) {
		
        int n1 = number % DIVIDER;	// ...X
        number /= DIVIDER;

        int n2 = number % DIVIDER; 	// ..X.
        number /= DIVIDER;

        int n3 = number % DIVIDER;	// .X..
        number /= DIVIDER;

        int n4 = number % DIVIDER;	// X...
        number /= DIVIDER;
			
        return n1 < n2 && n2 < n3 && n3 < n4;	// check and return result
    }
}