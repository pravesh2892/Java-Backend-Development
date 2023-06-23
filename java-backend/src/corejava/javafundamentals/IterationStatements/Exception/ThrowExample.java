package corejava.javafundamentals.IterationStatements.Exception;

public class ThrowExample {
    private static void demo() {
        try {
            throw new ArithmeticException();
        }
        catch(ArithmeticException e) {
            System.out.println("Caught: " + e);
            throw e;
        }
    }
    public static void main(String[] args) {
        try {
            demo();
        }
        catch(ArithmeticException e) {
            System.out.println("Recaught: " + e);
        }

        System.out.println("End of main()");
    }
}
