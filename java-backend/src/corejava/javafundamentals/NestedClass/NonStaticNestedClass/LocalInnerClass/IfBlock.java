package corejava.javafundamentals.NestedClass.NonStaticNestedClass.LocalInnerClass;

public class IfBlock {
    public static void main(String[] args) {
        int num = 3;

        if(num % 2 == 0) {
            class Local {
                void print() {
                    System.out.println("Even");
                }
            }

            Local local = new Local();
            local.print();
        }
        else {
            class Local {
                void print() {
                    System.out.println("Odd");
                }
            }

            Local local = new Local();
            local.print();
        }
    }
}
