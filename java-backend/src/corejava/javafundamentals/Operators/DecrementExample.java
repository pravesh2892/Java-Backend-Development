package corejava.javafundamentals.Operators;

public class DecrementExample {
    public static void main(String[] args) {
        int a = 10;
        int x;

        x = --a; //pre decrement
        System.out.println(a);
        System.out.println(x);

        x = a--; //post decrement
        System.out.println(a);
        System.out.println(x);
    }
}
