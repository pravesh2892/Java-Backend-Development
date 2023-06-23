package corejava.javafundamentals.NestedClass.StaticNestedClass;

public class StaticNestedClassExample {
    static int nonInstanceInt;
    float instanceFloat;

    private static double privateDouble;

    int num = 10;

    static class NestedClass {
        int num = 20;

        void displayEnclosingVariables() {
            StaticNestedClassExample staticNestedClassExample
                    = new StaticNestedClassExample();

            NestedClass nestedClass = new NestedClass();

            System.out.println(nonInstanceInt);
            System.out.println(staticNestedClassExample.instanceFloat);

            System.out.println(privateDouble);

            System.out.println("num: " + nestedClass.num);
        }
    }

    public static void main(String[] args) {
        NestedClass nestedClass = new NestedClass();

        nestedClass.displayEnclosingVariables();
    }
}
