package corejava.javafundamentals.NestedClass.StaticNestedClass;

class S2 {
    void print() {
        System.out.println("In print()");
    }
}

class E2 {
    static class N2 extends S2 {
        int num1;
        int num2;

        void display() {
            System.out.println(num1 + " " + num2);
        }
    }
}

public class StaticNestedClassInheritanceExampleII {
    public static void main(String[] args) {
        E2.N2 n2 = new E2.N2();

        n2.display();
        n2.print();
    }
}
