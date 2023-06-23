package corejava.javafundamentals.IterationStatements.Exception;

public class FinallyExample {
    private static void method1() {
        try {
            System.out.println("In method1()");
            throw new RuntimeException();
        }
        finally {
            System.out.println("In method1() finally");
        }
    }

    private static void method2() {
        try {
            System.out.println("In method2()");
            return;
        }
        finally {
            System.out.println("In method2() finally");
        }
    }

    private static void method3() {
        try {
            System.out.println("In method3()");
        }
        finally {
            System.out.println("In method3() finally");
        }
    }

    public static void main(String[] args) {
        try {
            method1();
        }
        catch(RuntimeException e) {
            System.out.println(e);
        }

        method2();

        method3();
    }
}
