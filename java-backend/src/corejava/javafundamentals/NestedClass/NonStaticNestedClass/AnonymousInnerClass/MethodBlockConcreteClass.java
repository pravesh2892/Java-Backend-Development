package corejava.javafundamentals.NestedClass.NonStaticNestedClass.AnonymousInnerClass;

public class MethodBlockConcreteClass {
    class Inner {
        void print() {
            System.out.println("Inside print()");
        }
    }

    private void demo() {
        int num = 10;
        Inner inner = new Inner() {
            void print() {
                System.out.println("Inside print() of demo() method");
                System.out.println("num: " + num);
            }
        };

        inner.print();
    }

    public static void main(String[] args) {
        MethodBlockConcreteClass methodBlockConcreteClass = new MethodBlockConcreteClass();
        methodBlockConcreteClass.demo();
    }
}
