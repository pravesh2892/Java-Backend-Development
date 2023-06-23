package corejava.javafundamentals.NestedClass.NonStaticNestedClass.AnonymousInnerClass;

public class IfBlock {
    class Inner {
        void print() {
            System.out.println("Inside print()");
        }
    }
    private void demo() {
        int i = 10;

        if(i < 10) {
            Inner inner = new Inner() {
                void print() {
                    System.out.println("Hi!");
                }
            };

            inner.print();
        }
    }
    
    public static void main(String[] args) {
        IfBlock ifBlock = new IfBlock();
        ifBlock.demo();
    }
}
