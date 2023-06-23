package corejava.javafundamentals.String.StringOperations;

public class TrimExample {
    public static void main(String[] args) {
        String s = "       Hello      ";
        System.out.println(s + " World");
        System.out.println(s.trim() + " World");
    }
}
