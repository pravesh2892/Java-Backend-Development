package corejava.javafundamentals.NestedClass.NonStaticNestedClass.AnonymousInnerClass;

public class MethodBlockAbstractClass {
    abstract class Inner {
        abstract void print();
    }

    private void demo() {
        Inner inner = new Inner() {
            void print() {
                System.out.println("Inside print()");
            }
        };

        inner.print();
    }
    
    public static void main(String[] args) {
        MethodBlockAbstractClass methodBlockAbstractClass
                = new MethodBlockAbstractClass();

        methodBlockAbstractClass.demo();
    }
}
