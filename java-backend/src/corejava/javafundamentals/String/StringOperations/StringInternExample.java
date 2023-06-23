package corejava.javafundamentals.String.StringOperations;

public class StringInternExample {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = new String("Java");
        s2 = s2.intern();

        String s3 = "Java";
        String s4 = new String("Java");
        s4 = s4.intern();

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s4);
    }
}
