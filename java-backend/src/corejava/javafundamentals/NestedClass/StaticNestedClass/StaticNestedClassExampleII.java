package corejava.javafundamentals.NestedClass.StaticNestedClass;

class EnclosingClass {
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
}

public class StaticNestedClassExampleII {
    public static void main(String[] args) {
        EnclosingClass.NestedClass nestedClass = new EnclosingClass.NestedClass();

        nestedClass.displayEnclosingVariables();
    }
}
