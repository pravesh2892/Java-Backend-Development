package corejava.javafundamentals.OOP.Inheritance;

class A {
    int num1;
    int num2;

    void printA() {
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }
}

class B extends A {
    int num3;

    void printB() {
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

        System.out.println("num3: " + num3);
    }

    void sum() {
        int sum = num1 + num2 + num3;

        System.out.println("Sum: " + sum);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        A a = new A();
        a.num1 = 10;
        a.num2 = 20;
        //a.printA();

        B b = new B();
        b.num1 = 100;
        b.num2 = 200;
        b.num3 = 30;
        b.printB();
        b.sum();
    }
}
