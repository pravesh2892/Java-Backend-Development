package corejava.javafundamentals.NestedClass.NestedInterface;

class C {
    interface D {
        void printD();
    }
}
public class NestedInterfaceClassExampleII implements C.D {
    public void printD() {
        System.out.println("In printD() method");
    }

    public static void main(String[] args) {
        NestedInterfaceClassExampleII nestedInterfaceClassExampleII
                = new NestedInterfaceClassExampleII();

        nestedInterfaceClassExampleII.printD();
    }
}
