package corejava.javafundamentals.OOP.Inheritance.MultipleInheritance;

interface C {
    default void print() {
        System.out.println("In interface A");
    }
}

interface D extends C {
    default void print() {
        System.out.println("In interface B");
    }
}

public class Scenario2 implements D {
    public static void main(String[] args) {
        Scenario2 scenario2 = new Scenario2();
        scenario2.print();
    }
}
