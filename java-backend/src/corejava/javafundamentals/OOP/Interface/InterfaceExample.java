package corejava.javafundamentals.OOP.Interface;

interface A {
    void print1(int num);
    void print2(int num);
    void print3(int num);
}

abstract class Class1 implements A {
    public void print1(int num) {
        System.out.println("In print1() method inside Class1: " + num);
    }
}

class Class2 extends Class1 {
    public void print2(int num) {
        System.out.println("In print2() method inside Class2: " + num);
    }

    public void print3(int num) {
        System.out.println("In print3() method inside Class2: " + num);
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Class2 class2 = new Class2();

        class2.print1(10);
        class2.print2(20);
        class2.print3(30);
    }
}
