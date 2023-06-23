package corejava.javafundamentals.NestedClass.NestedInterface;

interface A {
    interface B {
        void printB();
    }

    void printA();
}
public class NestedInterfaceClassExample implements A.B {
    public void printB() {
        System.out.println("In printB() method");
    }

    public static void main(String[] args) {
        NestedInterfaceClassExample nestedInterfaceClassExample
                = new NestedInterfaceClassExample();

        nestedInterfaceClassExample.printB();
    }
}
