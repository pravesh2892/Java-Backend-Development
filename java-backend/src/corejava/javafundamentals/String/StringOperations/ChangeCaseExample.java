package corejava.javafundamentals.String.StringOperations;

public class ChangeCaseExample {
    public static void main(String[] args) {
        String s1 = "HELLO";
        String s2 = "hello";
        String s3 = "HelLo";

        System.out.println(s1.toUpperCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s3.toUpperCase());

        System.out.println(s1.toLowerCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s3.toLowerCase());
    }
}
