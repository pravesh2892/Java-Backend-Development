package corejava.javafundamentals.IterationStatements.Exception;

class CustomException extends Exception {
    private String message;
    CustomException(String m) {
        message = m;
    }

    public String toString() {
        return "CustomException: " + message;
    }
}
public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            throw new CustomException("Custom message");
        }
        catch(CustomException e) {
            System.out.println(e);
        }
    }
}
