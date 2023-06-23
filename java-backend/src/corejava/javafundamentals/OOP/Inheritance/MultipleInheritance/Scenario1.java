package corejava.javafundamentals.OOP.Inheritance.MultipleInheritance;

interface A {
    default void print() {
        System.out.println("In interface A");
    }
}

interface B {
    default void print() {
        System.out.println("In interface B");
    }
}
public class Scenario1 implements A, B {
    public void print() {
        //System.out.println("In class Scenario1");
        B.super.print();
    }

    public static void main(String[] args) {
        Scenario1 scenario1 = new Scenario1();
        scenario1.print();
    }
}
