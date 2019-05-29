class NumberLogic {
    // 3. Ascending numbers?
    public static boolean checkNumber4(int number) {
		
        int n1 = number % 10;	// ...X
        number /= 10;

        int n2 = number % 10; 	// ..X.
        number /= 10;

        int n3 = number % 10;	// .X..
        number /= 10;

        int n4 = number % 10;	// X...
        number /= 10;
			
        return n1 > n2 && n2 > n3 && n3 > n4;	// check and return result
    }
	
	// 3. Descending numbers?
    public static boolean checkNumber4(int number) {
		
        int n1 = number % 10;	// ...X
        number /= 10;

        int n2 = number % 10; 	// ..X.
        number /= 10;

        int n3 = number % 10;	// .X..
        number /= 10;

        int n4 = number % 10;	// X...
        number /= 10;
			
        return n1 < n2 && n2 < n3 && n3 < n4;	// check and return result
    }
}