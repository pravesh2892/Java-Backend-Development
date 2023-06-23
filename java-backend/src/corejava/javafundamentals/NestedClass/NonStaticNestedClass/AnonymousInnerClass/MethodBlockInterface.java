package corejava.javafundamentals.NestedClass.NonStaticNestedClass.AnonymousInnerClass;

public class MethodBlockInterface {
    interface Inner {
        void print();
    }
    private void demo() {
        Inner inner = new Inner() {
            public void print() {
                System.out.println("Inside print");
            }
        };

        inner.print();
    }
    public static void main(String[] args) {
        MethodBlockInterface methodBlockInterface
                = new MethodBlockInterface();

        methodBlockInterface.demo();
    }
}
