package corejava.javafundamentals.IterationStatements.Exception;

public class ThrowsExample {
    private static void demo() throws IllegalAccessException, ClassNotFoundException {
        boolean status = false;

        if(status) {
            throw new IllegalAccessException();
        }
        else {
            throw new ClassNotFoundException();
        }

    }

    public static void main(String[] args) {
        try {
            demo();
        }
        catch(IllegalAccessException e) {
            System.out.println(e);
        }
        catch(ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
