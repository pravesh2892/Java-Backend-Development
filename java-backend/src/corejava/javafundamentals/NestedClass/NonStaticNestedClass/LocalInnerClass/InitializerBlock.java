package corejava.javafundamentals.NestedClass.NonStaticNestedClass.LocalInnerClass;

public class InitializerBlock {
    static {
        System.out.println("Static");
        int temp = 10;

        class Local {
            void sum() {
                int num1 = 10;
                int num2 = 20;
                System.out.println("Sum: " + (num1 + num2));

                System.out.println("temp: " + temp);
            }
        }

        Local local = new Local();
        local.sum();
    }

    {
        System.out.println("Non-Static");

        int temp = 10;

        class Local {
            void sum() {
                int num1 = 100;
                int num2 = 200;
                System.out.println("Sum: " + (num1 + num2));

                System.out.println("temp: " + temp);
            }
        }

        Local local = new Local();
        local.sum();
    }

    public static void main(String[] args) {
        InitializerBlock initializerBlock = new InitializerBlock();
    }
}
