package corejava.javafundamentals.IterationStatements.Exception;

public class StackOverflowErrorExample {
    private static void recursive() {
        recursive();
    }
    public static void main(String[] args) {
        recursive();
    }
}
