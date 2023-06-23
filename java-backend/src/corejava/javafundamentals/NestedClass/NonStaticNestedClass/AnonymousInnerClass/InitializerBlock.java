package corejava.javafundamentals.NestedClass.NonStaticNestedClass.AnonymousInnerClass;

public class InitializerBlock {
    class Inner {
        void print() {
            System.out.println("Inside print()");
        }
    }

    static {

    }

    {
        Inner inner = new Inner() {
            void print() {
                System.out.println("Inside print() of demo() method");
            }
        };

        inner.print();
    }
    
    public static void main(String[] args) {
        InitializerBlock initializerBlock = new InitializerBlock();
    }
}
