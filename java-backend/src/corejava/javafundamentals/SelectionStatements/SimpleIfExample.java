package corejava.javafundamentals.SelectionStatements;

public class SimpleIfExample {
    public static void main(String[] args) {
        int num = 0;

        if(num > 0) {
            System.out.println("Positive");
        }
        else if(num < 0) {
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }
    }
}
