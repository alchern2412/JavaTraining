public class Test {

    public static void main(String[] args) {
		
        // task 1
        // compare 3 integers
		
        int a, b, c;
        a = b = c = 10;
        System.out.println("три числа равны? ->" + a + " " + b + " " + c + " ? " + NumberLogic.equalsThreeNumbers(a, b, c));	// true
        b = 5;
        System.out.println("три числа равны? ->" + a + " " + b + " " + c + " ? " + NumberLogic.equalsThreeNumbers(a, b, c));	// false

    }
}
