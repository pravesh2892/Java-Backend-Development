package corejava.javafundamentals.OOP.Inheritance.MultipleInheritance;

interface E {
    default void print() {
        System.out.println("In interface A");
    }
}

interface F {
    default void print() {
        System.out.println("In interface B");
    }
}
public class Scenario3 implements E, F {
    public void print() {
        System.out.println("In class Scenario3");
    }

    public static void main(String[] args) {
        Scenario3 scenario3 = new Scenario3();
        scenario3.print();
    }
}
