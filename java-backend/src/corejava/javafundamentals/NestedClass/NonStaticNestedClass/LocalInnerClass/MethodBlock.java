package corejava.javafundamentals.NestedClass.NonStaticNestedClass.LocalInnerClass;

public class MethodBlock {
    static int num1;
    static int num2;
    private static void demo() {
        int temp = 10;
        class Local {


            void sum() {
                num1 = 10;
                num2 = 20;
                System.out.println("Sum: " + (num1 + num2));

                System.out.println("temp: " + temp);
            }
        }

        Local local = new Local();
        local.sum();
    }

    public static void main(String[] args) {
        demo();
    }
}
