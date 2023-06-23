package corejava.javafundamentals.Operators;

public class BooleanLogicalOperatorExample {
    public static void main(String[] args) {
        int a = 12;
        boolean b1 = true;
        boolean b2 = a < 10; //false

        boolean result;

        result = !b1 || b2;
        System.out.println(result);
    }
}
