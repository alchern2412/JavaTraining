public class Test {
    public static void main(String[] args) {
        //3
        int num = 1234;
        System.out.println(num + " - ascending numbers? " + NumberLogic.checkNumber4(num));	// true
        num = 1324;
        System.out.println(num + " - ascending numbers? " + NumberLogic.checkNumber4(num));	// false
        num = 1357;
        System.out.println(num + " - ascending numbers? " + NumberLogic.checkNumber4(num)); // true
    }
}
