package corejava.javafundamentals.OOP.Fundamentals;

public class OverloadedMethodExample {
    static void print() {
        System.out.println("In print() method");
    }

    static void print(int num) {
        System.out.println("In print(int) method: " + num);
    }

    static void print(float num) {
        System.out.println("In print(float) method: " + num);
    }

    static void print(float num1, double num2) {
        System.out.println("In print(float, float) method: " + num1 + " " + num2);
    }

    static void print(double num1, float num2) {
        System.out.println("In print(double, double) method: " + num1 + " " + num2);
    }

    public static void main(String[] args) {
        print(10.0, 20);
    }
}
