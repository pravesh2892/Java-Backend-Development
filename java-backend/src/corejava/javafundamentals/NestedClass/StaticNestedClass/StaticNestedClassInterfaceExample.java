package corejava.javafundamentals.NestedClass.StaticNestedClass;

interface I1 {
    void display();
}

class E3 {
    static class N3 implements I1 {
        int num1;
        int num2;

        public void display() {
            System.out.println("In display()");
        }
    }
}
public class StaticNestedClassInterfaceExample {
    public static void main(String[] args) {
        E3.N3 n3 = new E3.N3();
        n3.display();
    }
}
