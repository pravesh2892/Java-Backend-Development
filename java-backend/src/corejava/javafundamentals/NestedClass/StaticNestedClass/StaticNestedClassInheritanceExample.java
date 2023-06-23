package corejava.javafundamentals.NestedClass.StaticNestedClass;


class E1 {
    static class N1 {
        int num1;
        int num2;

        void display() {
            System.out.println(num1 + " " + num2);
        }
    }
}

class S1 extends E1.N1 {
    void print() {
        System.out.println("In print()");
    }
}
public class StaticNestedClassInheritanceExample {
    public static void main(String[] args) {
        S1 s1 = new S1();

        s1.display();
        s1.print();
    }
}
