package corejava.javafundamentals.StringBuffer;

public class ReplaceExample {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Hello");

        s.replace(3, 5, "ixa");

        System.out.println(s);

        System.out.println(s.toString());
    }
}
