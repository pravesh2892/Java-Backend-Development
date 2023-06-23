package corejava.javafundamentals.NestedClass.NonStaticNestedClass.LocalInnerClass;

public class LoopBlock {
    public static void main(String[] args) {
        int i = 0;

        //for
        for(i = 0; i < 10; i++) {
            class Local {
                void print() {
                    System.out.println("In Local class: for");
                }
            }

            Local local = new Local();
            local.print();
        }

        //while
        i = 0;
        while(i < 10) {
            class Local {
                void print() {
                    System.out.println("In Local class: while");
                }
            }

            Local local = new Local();
            local.print();

            i++;
        }

        //do-while
        i = 0;
        do {
            class Local {
                void print() {
                    System.out.println("In Local class: do-while");
                }
            }

            Local local = new Local();
            local.print();

            i++;
        }
        while(i < 10);
    }
}
