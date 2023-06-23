package corejava.javafundamentals.OOP.Fundamentals;

class A {
    void print() {
        System.out.println("In print of class A");
    }
}

class B extends A {
    void print() {
        System.out.println("In print of class B");
    }
}
public class FinalUsageExample {
    final int constant = 10;

    public static void main(String[] args) {
        FinalUsageExample finalUsageExample = new FinalUsageExample();

        B b = new B();
        b.print();
    }
}
