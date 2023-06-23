package corejava.javafundamentals.NestedClass.NonStaticNestedClass.AnonymousInnerClass;

public class LoopBlock {
    class Inner {
        void print() {
            System.out.println("Inside print()");
        }
    }

    private void demo() {
        int i = 0;

        while(i < 10) {
            Inner inner = new Inner() {
                void print() {
                    System.out.println("Hi!");
                }
            };

            inner.print();

            i++;
        }
    }
    public static void main(String[] args) {
        LoopBlock loopBlock = new LoopBlock();

        loopBlock.demo();
    }
}
