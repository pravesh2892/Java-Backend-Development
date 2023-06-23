package corejava.javafundamentals.Operators;

public class IncrementExample {
    public static void main(String[] args) {
        int a = 10;
        int x;

        x = ++a; //pre increment
        System.out.println(a);
        System.out.println(x);

        x = a++; //post increment
        System.out.println(a);
        System.out.println(x);
    }
}
