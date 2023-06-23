package corejava.javafundamentals.OOP.Fundamentals;

public class Number {
    static void add() {
        int num1 = 10;
        int num2 = 18;

        int sum = num1 + num2;

        System.out.println(sum);
    }

    public static void main(String[] args) {
        Number number = new Number();

        add();
    }
}
