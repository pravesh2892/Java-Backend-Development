package corejava.javafundamentals.IterationStatements.Exception;

public class DivideByZeroException {
    public static void main(String[] args) {
        int num1 = 10, num2 = 0;
        int result = 0;

        try {
            result = num1 / num2;
            System.out.println("After num1/num2");
        }
        catch(ArithmeticException e) {
            e.printStackTrace();
        }


        System.out.println(result);
    }
}
