package corejava.javafundamentals.String.StringOperations;

public class ReplaceExample {
    public static void main(String[] args) {
        String s = "Hello, World! Hello, I am Java";
        System.out.println(s.replace('o', 'i'));

        System.out.println(s.replace("Hello", "hi"));
    }
}
