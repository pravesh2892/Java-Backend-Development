package corejava.javafundamentals.Operators;

public class RelationalOperatorExample {
    public static void main(String[] args) {
        int num1 = 19;
        int num2 = 28;
        int num3 = 19;
        boolean result;

        result = num1 == num3;
        System.out.println(result);

        result = num1 != num3;
        System.out.println(result);

        result = num1 > num2;
        System.out.println(result);

        result = num1 < num2;
        System.out.println(result);

        result = num1 >= num3;
        System.out.println(result);

        result = num1 <= num3 - 1;
        System.out.println(result);
    }
}
